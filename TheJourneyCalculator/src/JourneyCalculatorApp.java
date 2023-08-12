import java.util.Scanner;
class JourneyCalculatorApp{
public static void main (String []args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter speed and time for calculate distance");
	double speed = scan.nextDouble();
	double time = scan.nextDouble();
	JourneyCalculator j1=new JourneyCalculator();
	 double distance= j1.calculateDistance( speed, time);
	System.out.println(distance);
	
}
}