package Strings;

public class CheckPalindrome {
	public static boolean isPalindrome(String str) {
		//Your code goes here
		String revStr="";
		for(int j=str.length()-1;j>=0;j--){
				revStr+=str.charAt(j);
		}
		if(revStr.equalsIgnoreCase(str)){
			return true;
		}
		else{
		return false;
		}
	}

}
