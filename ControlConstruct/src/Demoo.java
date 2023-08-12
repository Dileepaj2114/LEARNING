import java.util.Scanner;

public class Demoo {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		switch (num)
		{
		case 1 :
			System.out.println("MONDAY");
			break;
		case 2 :
			System.out.println("TUESDAY");
			break;
		case 3 :
			System.out.println("WEDNESDAY");
			break;
		case 4 :
			System.out.println("THURSDAY");
			break;
		case 5 : 
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default :
			System.out.println("hey gubal... go to eye care");
		
		
		
		}			

	}

}
