package com.brian;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Box3 box3=new Box3();
        System.out.println("please enter the length");
        Scanner scan=new Scanner(System.in);
        int length=Integer.parseInt(scan.next());
        System.out.println("please enter the width");
        Scanner scan1=new Scanner(System.in);
        int width=Integer.parseInt(scan1.next());
        System.out.println("please enter the height");
        Scanner scan2=new Scanner(System.in);
        int height=Integer.parseInt(scan2.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        if (box3.validate(length, width, height)){
            System.out.println(box3.name());
            System.out.println(box3.price());
        }
    }

}
