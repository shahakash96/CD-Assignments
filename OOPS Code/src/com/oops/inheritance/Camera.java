package com.oops.inheritance;

public class Camera extends Machine {

	public void start(){
		System.out.println("Camera is capturing");
	}
	
	public void capture(){
		System.out.println("Photo is captured by camera");
	}
	
	public static void main(String arg[]){
		
		Machine machine1 = new Machine();
		Machine machine2 = new Camera();
		Camera camera = new Camera();
		
		machine1.id = 45;
		System.out.println("The id of the machine is "+machine1.id);
		
		/*we can access the public and protected variable of super class
		 * and sub class can access the default variable if it is in the same
		 * package same as the super class
		 */
		machine2.id = 25;
		System.out.println("The id of the machine is "+machine2.id);
		
		machine1.start();
		machine2.start();
		
		machine1.stop();
		machine2.stop();
		
		/*super class have no idea about the property of subclass
		 * it is not visible for super class
		 */
		//machine2.capture();
		
		camera.capture();
	}
	
}
