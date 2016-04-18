package test;

import org.junit.Test;
import main.No34;

public class Test34 {
	int[] nums={5, 7, 7, 8, 8, 10};
	int target=8;

	@Test
	public void test(){
		int[] nums={5, 7, 7, 8, 8, 10};
		int target=8;
		int[] result=new No34().SearchRange(nums, target);
//		System.out.println(result[0]+","+result[1]);
	}
	@Test
	public void test2() throws Exception{
		int[] nums={1};
		int target=0;
		int[] result=new No34().SearchRange(nums, target);
//		System.out.println(result[0]+","+result[1]);
		PrintResult.show(result);
	}
}
