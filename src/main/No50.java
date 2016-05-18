package main;

public class No50 {

	public double myPow(double x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		if (x == Double.NaN)
			return Double.NaN;
		if (x == 1)
			return 1;
		if (x == 0) {
			if (n > 0)
				return 0;
			else
				return Double.POSITIVE_INFINITY;
		}
		if(n==Integer.MIN_VALUE){
			if(x>1||x<-1)
				return 0;
			if(1>x&&x>0)
				return Double.POSITIVE_INFINITY;
			if(0>x&&x>-1)
				return Double.NEGATIVE_INFINITY;
			if(x==-1)
				return 1;
		}
		
		boolean isPositive = n > 0;
		n = Math.abs(n);
		double result = 1;
		double tmp = x;
		while (n > 0) {
			if ((n & 1) == 1) {
				result *= tmp;
			}
			tmp *= tmp;
			n = n >> 1;
		}
		if (isPositive)
			return result;
		else
			return 1 / result;

	}
}
