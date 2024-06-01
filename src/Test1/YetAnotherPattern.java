package Test1;

import java.util.Scanner;

public class YetAnotherPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=0;
		for(int k=1;k<=t;k++){
			n=sc.nextInt();
			for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j>=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}

	}

}
