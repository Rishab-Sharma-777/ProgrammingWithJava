package ConditionalsAndLoops;
import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int SumofEvens=0;
		int SumofOdds=0;
		while(n!=0){
			int rem=n%10;
			if(rem%2==0){
				SumofEvens+=rem;
			}
			else{
				SumofOdds+=rem;
			}
			n=n/10;
		}
		System.out.print(SumofEvens+" "+SumofOdds);
	}

}
