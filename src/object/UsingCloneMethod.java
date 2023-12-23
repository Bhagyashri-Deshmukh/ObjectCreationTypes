package object;

public class UsingCloneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1,"Bhagyashri");
		System.out.println("Id is : "+employee.id);
		System.out.println("Name is : "+employee.name);
		System.out.println("========================================================");
		
		try {
			
			Employee employeeClone = (Employee) employee.clone();
			System.out.println("Cloned employee Id is : "+employeeClone.id);
			System.out.println("Cloned employee Name is : "+employeeClone.name);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Employee implements Cloneable{
	
	int id;
	String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	 @Override
	 protected Object clone() throws CloneNotSupportedException{
		 
	        return super.clone(); 
	 } 

}