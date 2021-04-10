package com.company;

public class FlowerBed {
    double perimetr;
    double area;
    final double PI = 3.14;
    public double findPerimetr(double radius){
        perimetr = 2*PI*radius;
        System.out.println("Периметр круга з радіусом: " + radius +" = " + perimetr);
        return this.perimetr = perimetr;
    }

    public  double findArea(double radius){
        area = PI*Math.pow(radius,2);
        System.out.println("Площа круга з радіусом: " + radius +" = " + area);
        return  this.area = area;
    }
}
