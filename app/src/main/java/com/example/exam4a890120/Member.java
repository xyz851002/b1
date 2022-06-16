package com.example.exam4a890120;

public class Member {
    public int _id;
    public String name;
    public int age;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Member(int _id, String name, int age) {
        this._id = _id;
        this.name = name;
        this.age = age;
    }

}
