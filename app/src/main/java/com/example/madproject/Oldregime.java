package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Oldregime extends AppCompatActivity
{
    TextView pt1,pt2,t4;
    EditText e1,e2,e3;
    Button b1,b2,b3;
    int ti,gi,age,ded;
    double tax,tax1,tax2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldregime);
        pt1=(TextView)findViewById(R.id.textView2);
        pt2=(TextView)findViewById(R.id.textView3);
        t4=(TextView) findViewById(R.id.textView4);
        t4.setText("");

        e1=(EditText) findViewById(R.id.editText2);
        e2=(EditText) findViewById(R.id.editText3);
        e3=(EditText) findViewById(R.id.editText4);

        b1=(Button) findViewById(R.id.button4);
        b2=(Button) findViewById(R.id.button5);
        b3=(Button) findViewById(R.id.button6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t=e1.getText().toString();
                age=Integer.parseInt(t);
                t=e2.getText().toString();
                gi=Integer.parseInt(t);
                t=e3.getText().toString();
                ded=Integer.parseInt(t);
                ti=gi-ded;
                if(age<60)
                {
                    if(ti>250000 && ti<=500000)
                    {
                        tax=(ti-250000)*0.05;
                        tax1=tax*0.04;
                        String t3=Double.toString(tax1);
                        String t2=Double.toString(tax);
                        tax2=tax+tax1;
                        String t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                    }
                    else if(ti>500000 && ti<=1000000)
                    {
                        tax=12500+(ti-500000)*0.2;
                        tax1=tax*0.04;
                        String t3=Double.toString(tax1);
                        String t2=Double.toString(tax);
                        tax2=tax+tax1;
                        String t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                    }
                    else if(ti>1000000){
                        tax=100000+12500+(ti-1000000)*0.3;
                        tax1=tax*0.04;
                        String t3=Double.toString(tax1);
                        String t2=Double.toString(tax);
                        tax2=tax+tax1;
                        String t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Income Tax Not Applicable", Toast.LENGTH_LONG).show();
                    }
                }
                else if(age<80) {
                    if(ti>300000 && ti<=500000) {
                        tax=(ti-300000)*0.05;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        String t1=Double.toString(tax2);
                        String t3=Double.toString(tax1);
                        String t2=Double.toString(tax);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }
                    else if(ti>500000 && ti<=1000000) {
                        tax=10000+(ti-500000)*0.2;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        String t2=Double.toString(tax);
                        String t3=Double.toString(tax1);
                        String t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                    }

                    else if(age>1000000){
                        tax=100000+10000+(ti-1000000)*0.3;
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

                else if(age>=80)
                {

                    if(ti>500000 && ti<=1000000)
                    {
                        tax=(ti-500000)*0.2;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        String t2=Double.toString(tax);
                        String t3=Double.toString(tax1);
                        String t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }

                    else if(ti>1000000)
                    {
                        tax=100000+(ti-1000000)*0.3;
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
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                e1.setText(null);
                e2.setText(null);
                e3.setText(null);


                t4.setText(null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i2=new Intent(Oldregime.this,MainActivity.class);
                startActivity(i2);
            }
        });


    }
}
