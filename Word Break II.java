import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static void fun(String s, ArrayList<String> dic,String temp,ArrayList<String> list){
		if(s.equals("")){
		    list.add(temp.trim());
			return;
		}
		for(int i=0;i<s.length();i++){
			String pref=s.substring(0,i+1);
			if(dic.contains(pref)){
				String suff=s.substring(i+1);
				fun(suff,dic,temp+" "+pref,list);
			}
		}
	}

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
		ArrayList<String> list=new ArrayList<>();
		fun(s,dictionary,"",list);
		return list;	
	}
}
