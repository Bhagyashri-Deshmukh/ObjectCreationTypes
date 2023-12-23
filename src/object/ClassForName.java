package object;

class ClassForName { 

	String name = "Bhagyashri"; 
 
	public static void main(String[] args) 
	{ 

		try { 
			Class cls = Class.forName("ClassForName"); 

			ClassForName obj = (ClassForName)cls.newInstance(); 

			System.out.println(obj.name); 
		} 

		catch (ClassNotFoundException e) { 
			e.printStackTrace(); 
		} 
		catch (InstantiationException e) { 

			e.printStackTrace(); 
		} 
		catch (IllegalAccessException e) { 

			e.printStackTrace(); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		
	} 
}

