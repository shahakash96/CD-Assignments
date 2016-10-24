package com.polymorphism.methodoverloading.overriding;

public class MedicalRobot extends Robot{

	private String speciality;
	
	public MedicalRobot() {
		
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public void robortInfo() {
		//if we want to invoke the superclass method we can do that by using super keyword
		//super.robortInfo(25);
		System.out.println("The id of the robot is "+getId()+" and The speciality of robot is that it is a "+speciality);
	}
	
	public static void main(String arg[]){
		
		MedicalRobot robot = new MedicalRobot();
		
		robot.setId(25);
		robot.setSpeciality("Therapeutic robot");
		
		robot.robortInfo();
				
	}
}
