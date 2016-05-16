package main;

public class No91 {
	public int numDecodings(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int numL = 1;
		int numR = s.charAt(0) == '0' ? 0 : 1;
		for (int i = 1; i < s.length(); i++) {
			int single = 1, d = 1;
			int tmp1=numL,tmp2=numR;
			if (s.charAt(i) == '0') {
				single = 0;
			}
			if (!twoDigits(s, i - 1, i)) {
				d = 0;
			}
			numL=tmp2;
			numR=single*tmp2+d*tmp1;
		}
		return numR;
	}

	private boolean twoDigits(String s, int i, int j) {
		if (s.charAt(i) == '1')
			return true;
		if (s.charAt(i) == '2' && (s.charAt(j) <= '6'))
			return true;
		return false;
	}
}
