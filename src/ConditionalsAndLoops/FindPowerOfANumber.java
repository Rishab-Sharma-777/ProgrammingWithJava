package ConditionalsAndLoops;
import java.util.Scanner;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int power=1;
        for(int i=0;i<n;i++){
            power*=x;
        }
        System.out.print(power);
	}

}
