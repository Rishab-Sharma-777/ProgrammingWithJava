package Strings;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class HighestOccuringCharcter {
	public static char highestOccuringChar(String str) {
		//Your code goes here
		int arr[] = new int[26];
		for(int i = 0; i<str.length(); i++){
			int a=((int)str.charAt(i)-97);
			arr[a]+=1;
		}
		// System.out.println(Arrays.toString(arr));
		int ind = 0;
		int g = 0;
		for(int i = 0 ; i < 26; i++){
			if(arr[i]>g){
				// System.out.println(arr[i]);
				ind = i;
				g = arr[i];
			}
		}
		return (char)(ind+97);	
	}
	}


