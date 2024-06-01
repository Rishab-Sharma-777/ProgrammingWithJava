package OpertorsAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,ans=0;
		double res=0,count=0;
		while(n>0){
			rem=n%10;
			res=(Math.pow(2.0,count))*rem;
			ans+=res;
			count++;
			n=n/10;
		}
		System.out.print(ans);
	}

}
