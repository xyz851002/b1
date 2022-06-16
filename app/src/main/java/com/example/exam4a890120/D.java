package com.example.exam4a890120;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class D extends AppCompatActivity {

    private Button btnCreate, btnInsert, btnShoedata;
    private SQLiteDatabase db;
    private MemberDB memberDB = new MemberDB(D.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        setTitle("yyds");

        btnCreate = findViewById(R.id.btnCreate);
        btnInsert = findViewById(R.id.btnInsert);
        btnShoedata = findViewById(R.id.btnShowdata);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memberDB.initData();

            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = "蘇東坡";
                int age = 50;

                Member m = new Member(name,age);
                memberDB.insertMember(m);

            }
        });

        btnShoedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ArrayList<Member> member = memberDB.getMember();

                for (int i=0;i<member.size();i++){
                    Log.d("Demo",  member.get(i)._id +","+ member.get(i).name +","+ member.get(i).age);
                }

            }
        });



    }
}
