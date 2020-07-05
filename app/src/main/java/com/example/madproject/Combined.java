package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Combined extends AppCompatActivity
{
    TextView nt4,pt1,pt2,pt3;
    EditText ne1;
    Button nb1;
    int nti;
    String nt1,nt2,nt3;
    double ntax,ntax1,ntax2;

    EditText e1,e2,e3;
    Button b1;
    TextView t4;
    int ti,gi,age,ded;
    double tax,tax1,tax2;
    String t1,t2,t3;
    Button p,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combined);
        pt1=(TextView)findViewById(R.id.textView5);
        pt2=(TextView)findViewById(R.id.textView6);
        pt3=(TextView)findViewById(R.id.textView9);
        p=(Button) findViewById(R.id.button8);
        c=(Button) findViewById(R.id.button9);


        nt4=(TextView) findViewById(R.id.textView8);
        nt4.setText("");
        ne1=(EditText) findViewById(R.id.editText5);
        nb1=(Button) findViewById(R.id.button6);


        t4=(TextView) findViewById(R.id.textView7);
        t4.setText("");

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText6);
        e3=(EditText) findViewById(R.id.editText7);


        b1=(Button) findViewById(R.id.button5);
        Button  b3=(Button) findViewById(R.id.button10);







        nb1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                String t=ne1.getText().toString();
                nti=Integer.parseInt(t);


                if(nti>250000 && nti<=500000)
                {

                    ntax=(nti-250000)*0.05;
                    ntax1=ntax*0.04;
                    ntax2=ntax+ntax1;
                    nt2=Double.toString(ntax);
                    nt3=Double.toString(ntax1);
                    nt1=Double.toString(ntax2);
                    nt4.setText("Payable tax : " + nt2 + "\nCess : " + nt3 + "\nTotal tax: " + nt1);


                }

                else if(nti>500000 && nti<=750000)
                {
                    ntax=12500+(nti-500000)*0.1;
                    ntax1=ntax*0.04;
                    ntax2=ntax+ntax1;
                    nt2=Double.toString(ntax);
                    nt3=Double.toString(ntax1);
                    nt1=Double.toString(ntax2);
                    nt4.setText("Payable tax : " + nt2 + "\nCess : " + nt3 + "\nTotal tax: " + nt1);
                }
                else if(nti>750000 && nti<=1000000)
                {
                    ntax=12500+25000+(nti-750000)*0.15;
                    ntax1=ntax*0.04;
                    ntax2=ntax+ntax1;
                    nt2=Double.toString(ntax);
                    nt3=Double.toString(ntax1);
                    nt1=Double.toString(ntax2);
                    nt4.setText("Payable tax : " + nt2 + "\nCess : " + nt3 + "\nTotal tax: " + nt1);
                }
                else if(nti>1000000 && nti<=1250000)
                {
                    ntax=12500+25000+37500+(nti-1000000)*0.2;
                    ntax1=ntax*0.04;
                    ntax2=ntax+ntax1;
                    nt2=Double.toString(ntax);
                    nt3=Double.toString(ntax1);
                    nt1=Double.toString(ntax2);
                    nt4.setText("Payable tax : " + nt2 + "\nCess : " + nt3 + "\nTotal tax: " + nt1);
                }
                else if(nti>1250000 && nti<=1500000)
                {
                    ntax=12500+25000+37500+50000+(nti-1250000)*0.25;
                    ntax1=ntax*0.04;
                    ntax2=ntax+ntax1;
                    nt2=Double.toString(ntax);
                    nt3=Double.toString(ntax1);
                    nt1=Double.toString(ntax2);
                    nt4.setText("Payable tax : " + nt2 + "\nCess : " + nt3 + "\nTotal tax: " + nt1);
                }


                else if(nti>1500000){
                    ntax=12500+25000+37500+50000+62500+(nti-1500000)*0.3;
                    ntax1=ntax*0.04;
                    ntax2=ntax+ntax1;
                    nt2=Double.toString(ntax);
                    nt3=Double.toString(ntax1);
                    nt1=Double.toString(ntax2);
                    nt4.setText("Payable tax : " + nt2 + "\nCess : " + nt3 + "\nTotal tax: " + nt1);

                }

                else{
                    Toast.makeText(getApplicationContext(), "Income Tax Not Applicable", Toast.LENGTH_LONG).show();
                }







            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {

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
                        t3=Double.toString(tax1);
                        t2=Double.toString(tax);
                        tax2=tax+tax1;
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }

                    else if(ti>500000 && ti<=1000000)
                    {
                        tax=12500+(ti-500000)*0.2;
                        tax1=tax*0.04;
                        t3=Double.toString(tax1);
                        t2=Double.toString(tax);
                        tax2=tax+tax1;
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }

                    else if(ti>1000000){
                        tax=100000+12500+(ti-1000000)*0.3;
                        tax1=tax*0.04;
                        t3=Double.toString(tax1);
                        t2=Double.toString(tax);
                        tax2=tax+tax1;
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Income Tax Not Applicable", Toast.LENGTH_LONG).show();
                    }
                }
                else if(age<80)
                {
                    if(ti>300000 && ti<=500000)
                    {

                        tax=(ti-300000)*0.05;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        t1=Double.toString(tax2);
                        t3=Double.toString(tax1);
                        t2=Double.toString(tax);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);


                    }

                    else if(ti>500000 && ti<=1000000)
                    {
                        tax=10000+(ti-500000)*0.2;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        t2=Double.toString(tax);
                        t3=Double.toString(tax1);
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);
                    }

                    else if(age>1000000){
                        tax=100000+10000+(ti-1000000)*0.3;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        t2=Double.toString(tax);
                        t3=Double.toString(tax1);
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);


                    }

                    else{
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
                        t2=Double.toString(tax);
                        t3=Double.toString(tax1);
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }

                    else if(ti>1000000)
                    {
                        tax=100000+(ti-1000000)*0.3;
                        tax1=tax*0.04;
                        tax2=tax+tax1;
                        t2=Double.toString(tax);
                        t3=Double.toString(tax1);
                        t1=Double.toString(tax2);
                        t4.setText("Payable tax : " + t2 + "\nCess : " + t3 + "\nTotal tax: " + t1);

                    }

                    else{
                        Toast.makeText(getApplicationContext(), "Income Tax Not Applicable", Toast.LENGTH_LONG).show();
                    }
                }





            }
        });

        p.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                double old1=Double.valueOf(t1);
                double new1=Double.valueOf(nt1);
                if(old1>new1)
                {
                    double nr=old1-new1;
                    pt3.setText("PROFIT :" +nr);
                    Toast.makeText(getApplicationContext(),"NEW REGIME BETTER!!!",Toast.LENGTH_LONG).show();
                }
                else if(old1<new1)
                {
                    double nr=new1-old1;
                    pt3.setText("PROFIT :" +nr);
                    Toast.makeText(getApplicationContext(),"OLD REGIME BETTER!!!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"CHOOSE ANY REGIME",Toast.LENGTH_LONG).show();
                }

            }
        });
        c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ne1.setText(null);
                nt4.setText(null);
                e1.setText(null);
                e2.setText(null);
                e3.setText(null);
                t4.setText(null);
                pt3.setText(null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i2=new Intent(Combined.this,MainActivity.class);
                startActivity(i2);
            }
        });


    }
}
