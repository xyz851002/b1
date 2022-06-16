package com.example.exam4a890120;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
    }
    View.OnClickListener click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it =new Intent();
            if(v==btn1)
                it.setClass(MainActivity.this,A.class);
            if(v==btn2)
                it.setClass(MainActivity.this,B.class);
            if(v==btn3)
                it.setClass(MainActivity.this,C.class);
            if(v==btn4)
                it.setClass(MainActivity.this,D.class);
            startActivity(it);
        }
    };
}