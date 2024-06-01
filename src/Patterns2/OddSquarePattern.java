package Patterns2;

import java.util.Scanner;

public class OddSquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();

        for (int j=0;j<jj;j++){
            int i=0+(j*2);
            int l=i;
            for (int p=1;p<=jj-j;){
                if (l%2!=0){
                    System.out.print(l);
                    p+=1;
                }
                l+=1;
            }
            int jg=0;
            for (int q=0;q<j;){
                if (jg%2!=0){
                    System.out.print(jg);
                    q+=1;
                }
                jg++;
            }
            System.out.println();

        }
	}

}
