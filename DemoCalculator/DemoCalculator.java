package DemoCalculator;
import java.util.Scanner;

public class DemoCalculator {
	
	int add(int a ,int b) {
		return a+b;
		
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	int div(int a, int b) {
		return a/b;
	}
	
	

	public static void main(String[] args) {
		int a, b;
		char op;
		//float cal;

		DemoCalculator obj = new DemoCalculator();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value a: ");
		a =sc.nextInt();
		
		System.out.println("enter the value b: ");
		b= sc.nextInt();
		System.out.println("Choose Arithmatic operator(+,-,*,/)");
		op = sc.next().charAt(0);
		
		if(op=='+') {
			//obj.add();
			System.out.println("the result is "+obj.add(a,b));
			
			
			
		}
		
		if(op =='-') {
			//obj.add();
			System.out.println("the result is "+obj.sub(a,b));
			
			
			
		}
		if(op =='*') {
			//obj.add();
			System.out.println("the result is "+obj.mul(a,b));
			
			
			
		}
		if(op =='/') {
			//obj.add();
			System.out.println("the result is "+obj.div(a,b));
			
			
			
		}
		
		

	}

}
