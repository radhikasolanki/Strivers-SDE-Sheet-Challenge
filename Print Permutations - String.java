import java.util.* ;
import java.io.*; 
public class Solution {
    public static void fun(int ind, String s,List<String> list,String res ,boolean []check){
        if(ind==s.length()){
            list.add(res);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(check[i]!=true){
                check[i]=true;
                fun(ind+1,s,list,res+s.charAt(i),check);
                check[i]=false;
            }
        }
    }
    public static List<String> findPermutations(String s) {
        // Write your code here.
        boolean []check=new boolean[s.length()];
        List<String> list=new ArrayList<>();
        String res="";
        fun(0,s,list,res,check);
        return list;
    }
}
