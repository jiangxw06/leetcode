package main;

public class No69 {
	public int mySqrt(int x) {
		return msqrt(x,0,x);

	}

	private int msqrt(int x, int left, int right) {
		if(right-left<=1){
			long tmp = right*right;
			if(tmp<=x)
				return right;
			return left;
		};
		int middle=(left+right)/2;
		long tmp=(long)middle*middle;
		if(tmp==x)return middle;
		if(tmp>x)return msqrt(x,left,middle-1);
		return msqrt(x,middle,right);
	}
}
