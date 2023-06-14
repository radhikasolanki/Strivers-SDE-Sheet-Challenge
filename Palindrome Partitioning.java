import java.util.* ;
import java.io.*; 
public class Solution {

    public static void fun(int ind, String s, List<List<String>> res, List<String> list){
        if(ind==s.length()){
            res.add(new ArrayList<String>(list));
            return ;
        }
        for(int i=ind;i<s.length();i++){
            String sub=s.substring(ind,i+1);
            if(isPalindrome(sub)){
                list.add(sub);
                fun(i+1,s,res,list);
                list.remove(list.size()-1);
            }
        }
    }
     public static boolean isPalindrome(String s){
        int i=0;int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) 
               return false;
            i++;
            j--;
    
        }
        return true;
    }
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> list=new ArrayList<>();
        fun(0,s,list,new ArrayList<>());
        return list;
    }
}
