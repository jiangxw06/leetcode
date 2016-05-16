package main;

import java.util.ArrayList;
import java.util.List;

public class No93 {
	public List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<String>();
		if (s == null || s.length() < 4 || s.length() > 12)
			return result;
		helper(result,s,"",0,-1);
		return result;
	}

	private void helper(List<String> result, String s, String current, int currentNum, int lastIndex) {
		if(currentNum==4&&lastIndex==s.length()-1){
			result.add(current.substring(1));
			return;
			}
		if(currentNum>=4||lastIndex>=s.length()-1)
			return;
		if (s.length()-1 - lastIndex < 4 - currentNum || s.length()-1 - lastIndex > 3 * (4 - currentNum))
			return;
		if(lastIndex+2<=s.length()&&isShort(s,lastIndex+1,lastIndex+2))
			helper(result,s,current+"." +s.substring(lastIndex+1,lastIndex+2),currentNum+1,lastIndex+1);
		if(lastIndex+3<=s.length()&&isShort(s,lastIndex+1,lastIndex+3))
			helper(result,s,current+"." +s.substring(lastIndex+1,lastIndex+3),currentNum+1,lastIndex+2);
		if(lastIndex+4<=s.length()&&isShort(s,lastIndex+1,lastIndex+4))
			helper(result,s,current+"." +s.substring(lastIndex+1,lastIndex+4),currentNum+1,lastIndex+3);
	}

	private boolean isShort(String s, int beginIndex, int endIndex) {
		if (beginIndex >= endIndex)
			return false;
		if (endIndex == beginIndex + 1)
			return true;
		if (endIndex == beginIndex + 2 && s.charAt(beginIndex) != '0')
			return true;
		if (endIndex == beginIndex + 3 && s.charAt(beginIndex) != '0'
				&& Integer.parseInt(s.substring(beginIndex, endIndex)) <= 255)
			return true;
		return false;
	}
}
