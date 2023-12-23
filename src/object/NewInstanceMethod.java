package object;

import java.lang.reflect.*; 

class NewInstanceMethod { 
	
	private String name; 

	NewInstanceMethod() {
		
	} 

	public void setName(String name){ 
		this.name = name; 
	} 

	public static void main(String[] args) 
	{ 
		
		try { 
			Constructor<NewInstanceMethod> constructor 
				= NewInstanceMethod.class.getDeclaredConstructor(); 

			// creating object using new instance method.
			NewInstanceMethod newInstanceMethod = constructor.newInstance(); 

			newInstanceMethod.setName("Bhagyashri"); 
			System.out.println(newInstanceMethod.name); 
		} 

		catch (Exception e) { 
			
			e.printStackTrace(); 
		} 
	} 
}
