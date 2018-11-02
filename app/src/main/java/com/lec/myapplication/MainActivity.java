package com.lec.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText etxt1,etxt2,etxt3,etxt4;
Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        etxt1=findViewById(R.id.etext1);
        etxt2=findViewById(R.id.etext2);
        etxt3=findViewById(R.id.etext3);
        etxt4=findViewById(R.id.etext4);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("Kanwal",etxt1.getText().toString());
        intent.putExtra("Ka",etxt2.getText().toString());
        intent.putExtra("Kan",etxt3.getText().toString());
        intent.putExtra("Kanwal",etxt4.getText().toString());

        startActivity(intent);

    }
}
