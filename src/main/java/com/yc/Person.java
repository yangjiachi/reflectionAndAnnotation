package com.yc;

import com.Showable;

public class Person implements Showable {
    private String name;
    private int age;

    public Person(){System.out.println("无参构造方法");}

    public Person(String name){
        this.name=name;
        System.out.println("有参构造方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void show() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
