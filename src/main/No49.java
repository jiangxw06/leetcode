package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class No49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(int i=0;i<strs.length;i++){
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			String sortedChars = String.valueOf(tmp);
			if(!map.containsKey(sortedChars)){
				map.put(sortedChars, new ArrayList<String>());
			}
			map.get(sortedChars).add(strs[i]);
		}
		for(List<String> value:map.values()){
			Collections.sort(value);
		}
		return new ArrayList<List<String>>(map.values());
	}
	// public List<List<String>> groupAnagrams(String[] strs) {
	// Map<int[], List<String>> map = new TreeMap<int[], List<String>>(new
	// Comparator<int[]>() {
	//
	// @Override
	// public int compare(int[] arr1, int[] arr2) {
	// for (int i = 0; i < arr1.length; i++)
	// if (arr1[i] > arr2[i])
	// return 1;
	// else if (arr1[i] < arr2[i])
	// return -1;
	// return 0;
	// }
	// });
	// Arrays.sort(strs);
	// for(int i=0;i<strs.length;i++){
	// int[] stat=new int[26];
	// Arrays.fill(stat, 0);
	// for(int j=0;j<strs[i].length();j++){
	// stat[strs[i].charAt(j)-'a']++;
	// }
	// if(!map.containsKey(stat)){
	// map.put(stat, new ArrayList<String>());
	// }
	// map.get(stat).add(strs[i]);
	// }
	// return new ArrayList<List<String>>(map.values());
	// }
}
