package com.brian;

public class Box3 extends Box{
    public Box3(){
        int length=10;
        int width=10;
        int height=10;
    }
    @Override
    public String name(){
        return "Box3";
    }
    @Override
    public int price(){
        return 60;
    }
}
