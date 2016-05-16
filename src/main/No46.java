package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No46 {
	public List<List<Integer>> permute(int[] nums) {
		Arrays.sort(nums);
		boolean[] alives=new boolean[nums.length];
		Arrays.fill(alives, true);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		permute(nums,alives,current,result);
		return result;

	}
	
	public void permute(int[] nums,boolean[] alives,List<Integer> current,List<List<Integer>> result){
		if(current.size()==nums.length){
			result.add(new ArrayList<Integer>(current));
			return;
		}
		for(int i=0;i<nums.length;i++)
			if(alives[i]){
				current.add(nums[i]);
				alives[i]=false;
				permute(nums,alives,current,result);
				current.remove(current.size()-1);
				alives[i]=true;
			}
	}
}
