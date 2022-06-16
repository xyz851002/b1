package com.example.exam4a890120;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class C extends AppCompatActivity {
    private RecyclerView rc01;
    private int[] imgIds = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6};
    private String[] text = new String[]{"圖片1","圖片2","圖片3","圖片4","圖片5","圖片6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        rc01 =findViewById(R.id.rc01);

        Myadapter myadapter =new Myadapter(C.this,text,imgIds );

        rc01.setLayoutManager(new GridLayoutManager(C.this,2));
        rc01.setAdapter(myadapter);


    }

}