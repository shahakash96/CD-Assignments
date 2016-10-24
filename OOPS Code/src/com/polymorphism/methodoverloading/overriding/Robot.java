package com.polymorphism.methodoverloading.overriding;

public class Robot {

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void robortInfo() {
		System.out.println("The id of Robot is " + id);
	}
	
	public void robortInfo(double id){
		System.out.println("The id of Robot is " + id);
	}
	
	public void robortInfo(String category, int id){
		System.out.println("The id of Robot is "+id+"and The category of Robot is "+category);
	}
	
	public static void main(String arg[]){
		
		Robot robot = new Robot();
		robot.setId(55);
		
		robot.robortInfo();
		robot.robortInfo(145.36);
		robot.robortInfo("Military Robot", 20);
	}
}
