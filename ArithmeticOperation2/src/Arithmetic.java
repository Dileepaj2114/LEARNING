import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter 2 number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println( substractNumber( num1,  num2));
		
		System.out.println("enter 2 number");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println( multiuplyNumber( num1,  num2));
		
		System.out.println("enter 2 number");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println(devideNumber(num1,num2));
		
		System.out.println("enter 2 number");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println( findReminder( num1,  num2));
	}
	public static int substractNumber(int num1, int num2) {
		return num2-num1;
	}
	public static int multiuplyNumber(int num1, int num2) {
		return num1*num2;
		
	}
	public static double devideNumber(int num1, int num2) {
		return num1/num2;
		
	}
	public static int findReminder(int num1,int num2) {
		return num1%num2;
		
	}


	
	
	
	
	
	
	
	
	
	
}