package com.lec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView text1,text2,text3,text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1=findViewById(R.id.txt1);
        text2=findViewById(R.id.txt2);
        text3=findViewById(R.id.txt3);
        text4=findViewById(R.id.txt4);
        String etxt1=getIntent().getStringExtra("Kanwal");
        String etxt2=getIntent().getStringExtra("Ka");
        String etxt3=getIntent().getStringExtra("Kan");
        String etxt=getIntent().getStringExtra("Kanwalq");
        text1.setText(etxt1);
        text2.setText(etxt2);
        text3.setText(etxt3);
        text4.setText(etxt);
        Toast.makeText(getApplicationContext(),"Successfully Registered",Toast.LENGTH_LONG).show();
    }
}
