package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Newregime extends AppCompatActivity
{
    TextView t4,pt1;
    Button b1,b2;
    EditText e1;
    double tax,tax1,tax2;
    int ti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newregime);
        pt1=(TextView)findViewById(R.id.textView2);
        t4=(TextView) findViewById(R.id.textView4);
        t4.setText("");

        e1=(EditText) findViewById(R.id.editText2);

        b1=(Button) findViewById(R.id.button4);
        b2=(Button) findViewById(R.id.button5);
        Button b3=(Button) findViewById(R.id.button6);


        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                String t=e1.getText().toString();
                ti=Integer.parseInt(t);
                if(ti>250000 && ti<=500000)
                {
                    tax=(ti-250000)*0.05;
                    tax1=tax*0.04;
                    tax2=tax+tax1;
                    String t2=Double.toString(tax);
                    String t3=Double.toString(tax1);
                    String t1=Double.toString(tax2);
                    t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                }
                else if(ti>500000 && ti<=750000)
                {
                    tax=12500+(ti-500000)*0.1;
                    tax1=tax*0.04;
                    tax2=tax+tax1;
                    String t2=Double.toString(tax);
                    String t3=Double.toString(tax1);
                    String t1=Double.toString(tax2);
                    t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                }
                else if(ti>750000 && ti<=1000000)
                {
                    tax=12500+25000+(ti-750000)*0.15;
                    tax1=tax*0.04;
                    tax2=tax+tax1;
                    String t2=Double.toString(tax);
                    String t3=Double.toString(tax1);
                    String t1=Double.toString(tax2);
                    t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                }
                else if(ti>1000000 && ti<=1250000)
                {
                    tax=12500+25000+37500+(ti-1000000)*0.2;
                    tax1=tax*0.04;
                    tax2=tax+tax1;
                    String t2=Double.toString(tax);
                    String t3=Double.toString(tax1);
                    String t1=Double.toString(tax2);
                    t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                }
                else if(ti>1250000 && ti<=1500000)
                {
                    tax=12500+25000+37500+50000+(ti-1250000)*0.25;
                    tax1=tax*0.04;
                    tax2=tax+tax1;
                    String t2=Double.toString(tax);
                    String t3=Double.toString(tax1);
                    String t1=Double.toString(tax2);
                    t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                }
                else if(ti>1500000){
                    tax=12500+25000+37500+50000+62500+(ti-1500000)*0.3;
                    tax1=tax*0.04;
                    tax2=tax+tax1;
                    String t2=Double.toString(tax);
                    String t3=Double.toString(tax1);
                    String t1=Double.toString(tax2);
                    t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Income Tax Not Applicable", Toast.LENGTH_LONG).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                e1.setText(null);
                t4.setText(null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i2=new Intent(Newregime.this,MainActivity.class);
                startActivity(i2);
            }
        });




    }
}
