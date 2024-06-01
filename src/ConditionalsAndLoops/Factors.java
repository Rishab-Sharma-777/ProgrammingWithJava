package ConditionalsAndLoops;
import java.util.Scanner;

public class Factors {
	public static boolean isNPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=isNPrime(n);
        if(isPrime){
            System.out.print(-1);
        }
        else
        {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
                
            }
        }
	}

}
