package Patterns2;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1,nrow=n,nstars=1,nspaces=n/2;
        while(row<=nrow){
            for(int c=1;c<=nspaces;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=nstars;c++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=n/2){
                nstars=nstars+2;
                nspaces=nspaces-1;
            }
            else{
                nstars=nstars-2;
                nspaces=nspaces+1;
            }
            row++;
        }
	}

}
