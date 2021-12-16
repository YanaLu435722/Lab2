package com.company;

public class Point3d extends Point2d {
    /* Возвращение координаты Z */
    public double getZ() {
        return zCoord;
    }

    /* Установка значения координаты Y. */
    public void setZ(double zCoord) {
        this.zCoord = zCoord;
    }
    double zCoord;

    /* Конструктор инициализации */
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    /* Конструктор по умолчанию. */
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    //    Метод для сравнения двух объектов
    public boolean equals(Point3d other) {
        return (this.getX() == other.getX()) && (this.getY() == other.getY()) && (this.getZ() == other.getZ());
    }

    /* Расстояние между двумя точками */
    // с точностью 2 знака после точки
    public double distanceTo(Point3d other) {
        double x = this.getX() - other.getX();
        double y = this.getY() - other.getY();
        double z = this.getZ() - other.getZ();
        double distance =Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)+ Math.pow(z, 2));
        distance *= 100;
        distance = Math.round(distance);
        distance /= 100;
        return distance;
    }
}
