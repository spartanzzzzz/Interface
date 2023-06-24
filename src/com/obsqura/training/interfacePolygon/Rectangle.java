package com.obsqura.training.interfacePolygon;

public class Rectangle implements Polygon {
	private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


	@Override
	public double getArea() {
		return length*breadth;
	}
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}



