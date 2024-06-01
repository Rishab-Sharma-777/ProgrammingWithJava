package ConditionalsAndLoops;
import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=str.charAt(0);
        int val=ch;
        if(val>64 && val<91){
            System.out.print(1);
        }
        else if(val>96 && val<123){
            System.out.print(0);
        }
        else{
            System.out.print(-1);
        }

	}

}
