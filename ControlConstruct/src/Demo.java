import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
Scanner scan = new Scanner ( System.in);
System.out.println("enter a score");
int score= scan.nextInt();
Grade g1= new Grade();
g1.giveGrade(score);

	}

}
