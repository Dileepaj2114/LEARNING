import java.util.Scanner;

public class DoubleTheNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		System.out.println("enter a number as double");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		

	}
	public static int doubleTheNumber(int num) {
        return num*2; 
	}

}
