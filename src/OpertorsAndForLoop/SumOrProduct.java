package OpertorsAndForLoop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int sum=0,product=1;
		if(c==1){
			for(int i=0;i<=n;i++){
				sum=sum+i;
			}
			System.out.print(sum);
		}
		else if(c==2){
				for(int i=1;i<=n;i++){
				product=product*i;
			}
			System.out.print(product);

		}
		else{
			System.out.print(-1);
		}

	}

}
