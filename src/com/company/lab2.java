package com.company;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите координаты первой точки:");
        double[] coordsFirst = new double[3];
        for (int i = 0; i < 3; ++i)
            coordsFirst[i] = scan.nextDouble();

        System.out.println("Введите координаты второй точки:");
        double[] coordsSecond = new double[3];
        for (int i = 0; i < 3; ++i)
            coordsSecond[i] = scan.nextDouble();

        System.out.println("Введите координаты третьей точки:");
        double[] coordsThird = new double[3];
        for (int i = 0; i < 3; ++i)
            coordsThird[i] = scan.nextDouble();
        scan.close();

        Point3d pointFirst = new Point3d(coordsFirst[0], coordsFirst[1], coordsFirst[2]);
        Point3d pointSecond = new Point3d(coordsSecond[0], coordsSecond[1], coordsSecond[2]);
        Point3d pointThird = new Point3d(coordsThird[0], coordsThird[1], coordsThird[2]);


        if (pointFirst.equals(pointSecond) || pointSecond.equals(pointThird) || pointThird.equals(pointFirst)) {
            System.out.println("Несколько точек совпадают");
        } else {
            System.out.println("Площадь = " + computeArea(pointFirst, pointSecond, pointThird));
        }
    }


    public static double computeArea(Point3d pointFirst, Point3d pointSecond, Point3d pointThird) {
        double a = pointFirst.distanceTo(pointSecond);
        double b = pointSecond.distanceTo(pointThird);
        double c = pointThird.distanceTo(pointFirst);

        //Формула Герона
        double p = (a + b + c) / 2;

        //Формула площади треугольника по координатам вершин
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
