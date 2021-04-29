package com.example.testtriangle;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class TestTriangle {
    public static int calculatePerimeter(int a, int b, int c){
        System.out.println("Calculating perimeter with " + a + "cm"  + b + "cm " + c + "cm" );
        System.out.println("Length = " + a + "cm and base = " + b + "cm and side = " + c + "cm");
        int perimeter = a+b+c;
        return perimeter;
    }
    public static double calculateArea(int length,int base,int height){
        System.out.println("Calculating area with " + length + " cm " + base + " cm " + height + " cm");
        System.out.println("Length = " + length + " cm and breadth = " + base + " cm and height = " +  height + " cm");
        double area =  0.5 * (base *height);
        return area;}
    public static boolean proveEquilateral(int a, int b, int c){
            boolean triangle = false;
            if ((a==b) && (b==c) && (c==a)){
                triangle=true;
                System.out.println("Equilateral triangle = " + triangle);
            }
            else {
                triangle=false;
                System.out.println("Equilateral triangle = " + triangle);
            }
            return triangle;
        }


    public static void main(String[] args) {
        double area = calculateArea(21,31,12);
        System.out.println("Area = " + area + "cm");
        int perimeter = calculatePerimeter(21,31,12);
        System.out.println("Perimeter = " + perimeter + "cm");
        proveEquilateral(31,31,31);

    }
}
