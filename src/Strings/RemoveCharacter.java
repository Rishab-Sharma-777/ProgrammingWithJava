package Strings;

public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans="";
		int n=str.length();
		int i=0;
		while(i<n){
			char strchar=str.charAt(i);
			if(strchar!=ch){
				ans+=strchar;
			}
			i++;
		}
		return ans;
	}
}
