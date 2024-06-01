package Strings;

public class CompressString {
	public static void main(String[] args) {
		String res=getCompressedString("aaabbcddeeeee");
		System.out.print(res);
}

	public static String getCompressedString(String str) {
		// Write your code here.
		int n = str.length();
		int count=0;
        if(n==0){ //to handle the case of empty string
            return str;
        }
        String answer = ""; //we create answer string to store the output.
        int startIndex = 0;
        while(startIndex < n){
        	count=0;
            char UniqueChar = str.charAt(startIndex);
            int nextUniqueChar = startIndex + 1;
            while(nextUniqueChar<n && str.charAt(nextUniqueChar)==UniqueChar){
                nextUniqueChar++;
                count++;
            }
            count++;
            if(count>1) {
                answer = answer + UniqueChar+count;
            }
            else {
                answer =answer + UniqueChar;
            }
            startIndex = nextUniqueChar;
        }
        return answer;

	}
}
