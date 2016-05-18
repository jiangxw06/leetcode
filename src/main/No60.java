package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No60 {

	public String getPermutation(int n, int k) {
		if (n < 0 || k <= 0)
			return null;
		int[] p = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };// int[] p
																	// 为全排列的个数
		List<Integer> avals = new ArrayList<Integer>();
		for (int i = 0; i <= n; i++)
			avals.add(i);
		if (k > p[n])
			return null;
		int i = 1;// 计算第i个数
		k--;
		StringBuilder sb = new StringBuilder();
		while (i <= n) {
			int j = k / p[n - i]; // 跳过j*p[n-i]个排列
			int tmp = avals.get(j + 1);
			avals.remove(j + 1);
			sb.append(tmp);
			k = k % p[n - i];
			i++;
		}

		return sb.toString();

	}
}
