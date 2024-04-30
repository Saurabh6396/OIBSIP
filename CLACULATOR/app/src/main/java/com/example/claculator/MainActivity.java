package com.example.claculator;
// Code written by Saurabh Patel
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.claculator.R;

import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView ta1;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.e1);
        et2=(EditText) findViewById(R.id.e2);
        bt1=(Button) findViewById(R.id.b1);
        bt2=(Button) findViewById(R.id.b2);
        bt3=(Button) findViewById(R.id.b3);
        bt4=(Button) findViewById(R.id.b4);
        bt5=(Button) findViewById(R.id.b5);
        bt6=(Button) findViewById(R.id.b6);
        bt7=(Button) findViewById(R.id.b7);
        bt8=(Button) findViewById(R.id.b8);
        bt9=(Button) findViewById(R.id.b9);
        bt10=(Button) findViewById(R.id.b10);
        bt11=(Button) findViewById(R.id.b11);
        bt12=(Button) findViewById(R.id.b12);
        ta1=(TextView) findViewById(R.id.t1);
        // Code written by Saurabh Patel
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                long re=n1+n2;
                ta1.setText(String.valueOf(re));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                long re=n1-n2;
                ta1.setText(String.valueOf(re));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("1");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("1");
                }
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                long re=n1*n2;
                ta1.setText(String.valueOf(re));
            }
        });
        // Code written by Saurabh Patel
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("1");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("1");
                }
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                float re=(float)n1/n2;
                ta1.setText(String.valueOf(re));
            }
        });
        // Code written by Saurabh Patel
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=Math.sin(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
        // Code written by Saurabh Patel
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=Math.cos(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=1/Math.cos(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=Math.sin(n1+n2)/Math.cos(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
        // Code written by Saurabh Patel
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=1/Math.sin(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=1/(Math.sin(n1+n2)/Math.cos(n1+n2));
                ta1.setText(String.valueOf(re));
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=Math.log(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().length()==0){
                    et1.setText("0");
                }
                if(et2.getText().toString().length()==0){
                    et2.setText("0");
                }
                double n1=Double.parseDouble(et1.getText().toString());
                double n2=Double.parseDouble(et2.getText().toString());
                double re=Math.sqrt(n1+n2);
                ta1.setText(String.valueOf(re));
            }
        });
    }
}
// Code written by Saurabh Patel
