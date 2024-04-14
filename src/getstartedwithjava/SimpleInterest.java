package getstartedwithjava;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		double r=scan.nextDouble();
		int t=scan.nextInt();
		double si=(p*r*t)/100;
		int result=(int)si;
		System.out.print(result);
	}

}
