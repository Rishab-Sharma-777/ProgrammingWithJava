package getstartedwithjava;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char c=str.charAt(0);
		int m1=scan.nextInt();
		int m2=scan.nextInt();
		int m3=scan.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(c);
		System.out.print(avg);
	}

}
