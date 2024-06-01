package Strings;

public class countWords {
	public static int countWords(String str) {	
		//Your code goes here
		String[] arrOfStr = str.split(" ");
		return arrOfStr.length;
	}
}
