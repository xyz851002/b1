package com.example.exam4a890120;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MemberDB extends SQLiteOpenHelper {

    private final static int _DBVersion = 1;
    private final static String _DBName = "member";

    public MemberDB(@Nullable Context context){
        super(context, _DBName, null, _DBVersion);
    }

    public void initData(){

        SQLiteDatabase db = this.getWritableDatabase();

        db.delete("member","", new String[]{});

        Member m1 = new Member("張三",20);
        Member m2 = new Member("李四",30);
        Member m3 = new Member("王武",40);

        insertMember(m1);
        insertMember(m2);
        insertMember(m3);

    }


    public void insertMember(Member m){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("name",m.name);
        cv.put("age",m.age);

        db.insert("member",null,cv);

        Log.d("Demo", m.name);

    }

    public ArrayList<Member> getMember(){

        SQLiteDatabase db = this.getReadableDatabase();

        String sql = "select * from member";

        Cursor cursor = db.rawQuery(sql,null);

        ArrayList<Member> memberList = new ArrayList<>();

        cursor.moveToFirst();

        do{
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            int age = cursor.getInt(2);

            Member m = new Member(id, name, age);

            memberList.add(m);
        }while (cursor.moveToNext());

        return memberList;


    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table IF NOT EXISTS member " +
                " (_id integer primary key autoincrement, name text, " +
                "age integer)";

        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String SQL = "delete from member";
        sqLiteDatabase.execSQL(SQL);
    }
}