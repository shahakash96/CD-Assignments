package com.exception.code;

public class App {

	public static void main(String arg[]) {

		try {
			int i = 5;			
			//int b = i/0;
			
				try{
					int a[] = new int[5];
					a[6] = 5;
				} catch(ArrayIndexOutOfBoundsException ex) { 
					ex.printStackTrace();
				}
				
		}catch (ArithmeticException e){	
			e.printStackTrace();
		}finally {
			System.out.println("Exit");
		}	
	
	/*catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
	}*/
				
		//test();
		test1();		
	}
	
	public static void test() {
		throw new ArithmeticException();
	}
	
	public static void test1() throws NullPointerException{
		
		Integer id = null;
		
		int total = id+52;
		
	}
}
