import java.util.Scanner;

public class jointString {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter two parameter");
		String str1=scan.next();
		String str2=scan.next();
	System.out.println(jointString( str1, str2));
	
		
		

	}
	public static String jointString(String str1, String str2) {
		return str1+" "+str2;
	
	}

}
