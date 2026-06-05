package day5.bai7;


public sealed abstract class Shape permits Triangle, Circle, Rectangle {
    abstract double dienTich();
}