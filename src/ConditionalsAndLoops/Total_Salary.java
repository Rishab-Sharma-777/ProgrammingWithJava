package ConditionalsAndLoops;
import java.util.Scanner;
import java.lang.Math;
public class Total_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        String str=sc.next();
        char grade=str.charAt(0);
        double Total_Salary=0;
        double hra=(0.2d*basic);
        double da=(0.5d*basic);
        double pf=(0.11d*basic);
        int Allow=0;
        if(grade=='A'){
            Allow=1700;
        }
        else if(grade=='B'){
            Allow=1500;
        }
        else{
            Allow=1300;
        }
        Total_Salary=(basic+hra+da+Allow)-pf;
        System.out.print(Math.round(Total_Salary));

	}

}
