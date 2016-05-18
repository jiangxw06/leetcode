package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import main.No127;

public class Test127 {
	int result;
	String beginWord="hit";
	String endWord="cog";
	Set<String> wordList=new HashSet<String>();

	@Before
	public void setup() {
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
	}

	@Test
	public void test() {
		result = new No127().ladderLength(beginWord, endWord, wordList);
		System.out.println(result);
	}
}
