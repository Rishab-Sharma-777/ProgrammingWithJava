package Strings;

public class RemoveConsecutiveDuplicates {
	public static void main(String[] args) {
		String res=removeConsecutiveDuplicates("phqghumeaylnlfdxfircvscxgbwkfnqduxwfnfozvsrtkjprepgxrpnrvystmwcysycqpevikefmznimkasvwsrenzkycxf");
		System.out.print(res);
}
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int n = str.length();
        if(n==0){ //to handle the case of empty string
            return str;
        }
        String answer = ""; //we create answer string to store the output.
        int startIndex = 0;
        while(startIndex < n){
            char UniqueChar = str.charAt(startIndex);
            int nextUniqueChar = startIndex + 1;
            while(nextUniqueChar<n && str.charAt(nextUniqueChar)==UniqueChar){
                nextUniqueChar++;
            }
            answer = answer + UniqueChar;
            startIndex = nextUniqueChar;
        }
        return answer;
	}

}
