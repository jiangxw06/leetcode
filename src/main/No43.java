package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No43 {

	public String multiply(String num1, String num2) {
		if (num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0)
			return null;

		StringBuilder sb = new StringBuilder(num1);
		int[] result = new int[num1.length()+num2.length()];
		Arrays.fill(result, 0);
		sb.reverse();
		num1=sb.toString();
		sb=new StringBuilder(num2);
		sb.reverse();
		num2=sb.toString();
		for(int i=0;i<num1.length();i++)
			for(int j=0;j<num2.length();j++){
				int sum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				result[i+j]+=sum;
			}
		sb=new StringBuilder();
		for(int i=0;i<result.length;i++){
			int tmp=result[i];
			result[i] = (tmp%10);
			if(tmp>=10)
				result[i+1]+=tmp/10;
		}
		boolean isStart=false;
		for(int i=result.length-1;i>=0;i--)
			if(isStart)
				sb.append(result[i]);
			else if(result[i]!=0){
				isStart=true;
				sb.append(result[i]);
			}
		
		if(sb.length()>0)
			return sb.toString();
		else
			return "0";
			
	}
}
