package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText vpa,vma,vnm;
    Button to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpa=findViewById(R.id.pa);
        vma=findViewById(R.id.ma);
        vnm=findViewById(R.id.nm);
        to=findViewById(R.id.to);

        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float p = Float.parseFloat(vpa.getText().toString());

                float m = Float.parseFloat(vma.getText().toString());

                float n = Float.parseFloat(vnm.getText().toString());


                float EMI=p*m*((1+m)*n);

                float VMI =(1+m)*n-1;

                float ans = EMI/VMI;


                to.setText("EMI = "+ans);

            }
        });

    }
}