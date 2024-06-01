package ConditionalsAndLoops;
import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		int g=sc.nextInt();

		while(s<=e){
			int convert=(5*(s-32))/9;
			System.out.println(s+" "+convert);
			s=s+g;
		}
	}

}
