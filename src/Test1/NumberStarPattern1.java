package Test1;

import java.util.Scanner;

public class NumberStarPattern1 {
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int p=n;
			for(int j=1;j<=n;j++){
				if(j==(n+1)-i){
				System.out.print("*");
				}
				else{
					System.out.print(p);
				}
				p--;
			}
			System.out.println();
		}
	}
}
