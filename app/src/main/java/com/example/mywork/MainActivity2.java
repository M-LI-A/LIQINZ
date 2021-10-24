package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView5=findViewById(R.id.textView5);
        Intent intent=getIntent();
        String xinwenye=intent.getStringExtra("xinwenye");
        if (xinwenye.equals("小米Note")){
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");

        }
        else if (xinwenye.equals("华为荣耀7")) {
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");
        }
        else if (xinwenye.equals("魅族MX5")) {
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");
        }
        else if (xinwenye.equals("锤子T1")) {
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");
        }
    }
}