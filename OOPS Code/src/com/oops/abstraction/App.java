package com.oops.abstraction;

abstract class Machine {

	public abstract void start();

	public static void stop() {
		System.out.println("Machine stop");
	}
}

abstract class Robot extends Machine {
	public void start() {
	}
}

class Audi implements Car{

	public void service() {
		System.out.println("My Audi car is in service");
	}
	
}

class Camera extends Machine {

	public void start() {
		System.out.println("Camera is capturing");
	}

	public void capture() {
		System.out.println("Photo is captured by camera");
	}

}

public class App {

	public static void main(String arg[]) {

		Car car = new Audi();
		Camera machine = new Camera();
		machine.capture();
		machine.start();
		Machine.stop();
		car.service();
	}

}
