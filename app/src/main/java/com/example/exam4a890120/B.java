package com.example.exam4a890120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class B extends AppCompatActivity {
    private String[] star = {"林心如", "張惠妹", "林志玲", "張鈞甯", "劉詩詩", "金泰希", "李英愛",
            "宋慧喬", "隋棠", "劉亦菲","費玉清", "張學友", "陳奕迅", "劉德華", "王力宏"};
    private ListView lv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        lv01=findViewById(R.id.lv01);
        ArrayAdapter<String>str=new ArrayAdapter<>(B.this, android.R.layout.simple_list_item_1,star);
        lv01.setAdapter(str);
        lv01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str=star[position];
                Toast.makeText(B.this,str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}