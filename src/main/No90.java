package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No90 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0)
			return result;
		Arrays.sort(nums);
		subsetsWithDup(result,new ArrayList<Integer>(),nums,0);
		return result;
	}

	private void subsetsWithDup(List<List<Integer>> result, ArrayList<Integer> current,int[] nums,int next) {
		result.add(new ArrayList<Integer>(current));
		int last = 0;
		for(int i=next;i<nums.length;i++){
			if(i>next&&nums[i]==last)
				continue;
			current.add(nums[i]);
				subsetsWithDup(result,current,nums,i+1);
			current.remove((current.size()-1));
			last=nums[i];
		}
		
	}
}
