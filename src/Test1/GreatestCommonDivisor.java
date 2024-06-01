package Test1;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=1;k<=t;k++){
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			while(num1%num2!=0){
				int rem=num1%num2;
				num1=num2;
				num2=rem;
			}
			int gcd=num2;
			System.out.println(gcd);
		}
	}

}
