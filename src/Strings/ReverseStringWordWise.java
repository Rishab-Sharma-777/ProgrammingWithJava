package Strings;

public class ReverseStringWordWise {
	public static String reverseWordWise(String input) {
		// Write your code here
		String[] str=input.split(" ");
		String revstr="";
		for(int i=str.length-1;i>=0;i--){
			 revstr+=str[i]+" ";
		}
		return revstr;
	}
}
