package Test2;

public class LeadersinaArray {
	public static void leaders(int[] input) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++){
			if(input[i]>max){
				max=input[i];
			}
		}
		System.out.print(max);
	}
}
