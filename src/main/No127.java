package main;

import java.util.Iterator;
import java.util.Set;

public class No127 {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		wordList.add(beginWord);
		wordList.add(endWord);
		int[][] distance = new int[wordList.size()][wordList.size()];
		String[] array = new String[wordList.size()];
		wordList.toArray(array);
		int i, j;
		int begin = -1, end = -1;
		for (i = 0; i < array.length; i++) {
			if (beginWord.equals(array[i]))
				begin = i;
			if (endWord.equals(array[i]))
				end = i;
			distance[i][i] = 0;
			for (j = i + 1; j < array.length; j++) {
				distance[i][j] = calcDistance(array[i], array[j]);
				distance[j][i] = distance[i][j];
			}
		}
		if (begin == -1 || end == -1)
			return 0;
		for (i = 0; i < array.length; i++)
			for (j = 0; j < array.length; j++)
				if (distance[begin][i] < Integer.MAX_VALUE && distance[i][j] < Integer.MAX_VALUE
						&& distance[begin][j] > distance[begin][i] + distance[i][j])
					distance[begin][j] = distance[begin][i] + distance[i][j];
		if(distance[begin][end]==Integer.MAX_VALUE)
			return 0;
		return distance[begin][end];
	}

	private int calcDistance(String string, String string2) {
		int diff = 0;
		for (int i = 0; i < string.length(); i++)
			if (string.charAt(i) != string2.charAt(i))
				diff++;
		if (diff > 1)
			return Integer.MAX_VALUE;
		return 1;

	}
}
