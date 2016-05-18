package main;

import java.util.ArrayList;
import java.util.List;

public class No77 {
	public List<List<Integer>> combine(int n, int k) {
		if(n<1||k<0||k>n)
			return null;
		int next=1;
		List<Integer> current = new ArrayList<Integer>();
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		combin(result,current,next,n,k);

		return result;
	}

	private void combin(List<List<Integer>> result, List<Integer> current, int next,int n,int k) {
		if(current.size()==k){
			result.add(new ArrayList<Integer>(current));
			return;
		}
		for(int i=next;i<=n;i++){
			current.add(i);
			combin(result, current, i+1,n,k);
			current.remove(current.size()-1);
		}
	}
}
