package Methods;

public class Methods {
	
	public void print() {
		System.out.println("Method without return type and without parameter");
	}
	
    public void display(String name) {
		
		System.out.println("My name is "+name);
	}
    
    public int cube(int n) {
		
		return n*n*n;
	}
    
    public String fullName(String fname, String lname) {
		return fname+" "+lname;
	}
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj= new Methods();
		obj.print();
		obj.display("gaurav");
		
		int cube=obj.cube(5);
		System.out.println("Cube of 5 is: "+cube);
		
		String MyName=obj.fullName("gaurav", "mishra");
		System.out.println("My Name is: "+MyName);

	}

}
