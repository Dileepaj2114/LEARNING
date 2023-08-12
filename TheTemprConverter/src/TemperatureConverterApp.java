import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter a fahrenit to convert celcius");
double  fahrenheit = scan.nextDouble();
TemperatureConverter t1=new  TemperatureConverter();
 double celcius =t1. convertFahrenheitToCelsius(fahrenheit) ;

    System.out.println(celcius);

	}

}
