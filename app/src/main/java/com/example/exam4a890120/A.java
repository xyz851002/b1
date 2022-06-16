package com.example.exam4a890120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class A extends AppCompatActivity {
private Button btn1,btn2;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        textView=findViewById(R.id.textView);
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
    }
    View.OnClickListener click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                if(v==btn1) {
                    String str = getString(R.string.text);
                    textView.setText(str);
                }
                if(v==btn2){
                    textView.setText(" ");
                }

        }
    };
}