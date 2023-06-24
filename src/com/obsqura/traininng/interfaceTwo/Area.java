package com.obsqura.traininng.interfaceTwo;

public class Area implements Shape, NewShape {
	private int length;
	private int breadth;
	public Area(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	@Override
	public int getArea() {
		int areaOfRectangle=length*breadth;
		return areaOfRectangle;
	}
	public static void main(String[] args) {
		Area area=new Area(10,15);
		System.out.println("Area :"+area.getArea());
	}
}


	


