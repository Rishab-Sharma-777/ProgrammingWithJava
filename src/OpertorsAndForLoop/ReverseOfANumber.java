package OpertorsAndForLoop;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		while(n!=0){
            rem = rem * 10 + n% 10; 
			n=n/10;
		}
		System.out.print(rem);
	}

}
