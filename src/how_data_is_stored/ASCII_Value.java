package how_data_is_stored;
import java.util.Scanner;

public class ASCII_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char ch=str.charAt(0);
		int val=ch;
		System.out.print(val);
	}

}
