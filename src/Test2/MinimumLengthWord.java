package Test2;

public class MinimumLengthWord {
public static String minLengthWord(String input){
		
		// Write your code here
		String res="";
		String[] strarr=input.split(" ");
		int minlen=Integer.MAX_VALUE;
		String minch="";
		for(int i=0;i<strarr.length;i++){
			char[] ch=strarr[i].toCharArray();
			if(ch.length<minlen){
				minlen=ch.length;
				minch=strarr[i];
			}
			//System.out.println(strarr[i]);
		}
					//System.out.print(minch);
		return minch;

	}
}
