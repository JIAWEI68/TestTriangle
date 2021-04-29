package com.example.testtriangle;

public class TestTriangle {
    public static int calculatePerimeter(int a, int b, int c){
        System.out.println(" Calculating perimeter with " + a + " cm" + b + " cm" + c + " cm" );
        System.out.println("Length = " + a + " cm and base = " + b + " cm and side = " + c + " cm");
        boolean triangle = false;
        if ((a==b) && (b==c) && (c==a)){
            triangle=true;
            System.out.println("Equilateral triangle = " + triangle);
        }
        else if ((a!=b) && (b!=c)){
            triangle=false;
            System.out.println("Equilateral triangle = " + triangle);
        }
        int perimeter = a+b+c;
        return perimeter;



    }
    public static int calculateArea(int length,int breadth,int height){
        System.out.println("Calculating area with " + length + " cm" + breadth + " cm" + height + " cm");
        System.out.println("Length = " + length + " cm and breadth = " + breadth + " cm and height = " +  );
    }
}
