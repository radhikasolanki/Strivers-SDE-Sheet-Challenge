import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
		ArrayList<ArrayList<Long>> res=new ArrayList<>();
			ArrayList<Long>list=new ArrayList<>();
			list.add(1l);
			res.add(list);
		//	ArrayList<Long> prev=list;
			for(int i=2;i<=n;i++){
				ArrayList<Long>ls=new ArrayList<>();
				ls.add(1l);
				int size=res.size();
				for(int j=1;j<size;j++){
					ls.add(res.get(size-1).get(j)+res.get(size-1).get(j-1));
				}
				ls.add(1l);
				res.add(ls);


			 }
			return res;
		
	}
}
