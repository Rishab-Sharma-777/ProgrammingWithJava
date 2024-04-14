package getstartedwithjava;
import java.util.Scanner;

public class RectangularArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		int calculatearea=(x2-x1)*(y2-y1);
		System.out.print(calculatearea);
	}

}
