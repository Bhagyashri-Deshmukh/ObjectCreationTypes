package object;

import java.io.*; 

class DeSerialization implements Serializable { 
	
	private String name; 
	
	DeSerialization(String name) { 
		this.name=name; 
	} 

	public static void main(String[] args) 
	{ 

		try { 
		
			DeSerialization deSerialization = new DeSerialization("Bhagyashri"); 
			FileOutputStream fileOutputStream = new FileOutputStream("name.txt"); 
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); 
			objectOutputStream.writeObject(deSerialization); 
			objectOutputStream.close(); 
			fileOutputStream.close(); 
		} 

		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}
}

