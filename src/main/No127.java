package main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * 超时
 * 当图中边的权重恒为1的时候，确实不需要用Dijkstra算法，因为两点之间的distance只与中间节点个数有关
 * 用BFS即可
 */
public class No127 {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		wordList.add(beginWord);
		wordList.add(endWord);
		int[][] adjacent = new int[wordList.size()][wordList.size()];
		List<Integer> remain = new ArrayList<Integer>();
		int[] dist = new int[wordList.size()];
		Arrays.fill(dist, Integer.MAX_VALUE);
		String[] array = new String[wordList.size()];
		wordList.toArray(array);
		int i, j;
		int begin = -1, end = -1;
		for (i = 0; i < array.length; i++) {
			if (beginWord.equals(array[i]))
				begin = i;
			if (endWord.equals(array[i]))
				end = i;
			adjacent[i][i] = 0;
			for (j = i + 1; j < array.length; j++) {
				adjacent[i][j] = calcDistance(array[i], array[j]);
				adjacent[j][i] = adjacent[i][j];
			}
		}
		if (begin == -1 || end == -1)
			return 0;

		dist[begin] = 0;
		for (i = 0; i < array.length; i++)
			// if (i != begin)
			remain.add(i);
		while (!remain.isEmpty()) {
			int minIndex = 0;
			for (j = 0; j < remain.size(); j++)
				if (dist[remain.get(j)] < dist[remain.get(minIndex)]) {
					minIndex = j;
				}
			if (dist[remain.get(minIndex)] < Integer.MAX_VALUE)
				for (j = 0; j < remain.size(); j++)
					if (adjacent[remain.get(minIndex)][remain.get(j)] < Integer.MAX_VALUE
							&& dist[remain.get(j)] > dist[remain.get(minIndex)]
									+ adjacent[remain.get(minIndex)][remain.get(j)])
						dist[remain.get(j)] = dist[remain.get(minIndex)]
								+ adjacent[remain.get(minIndex)][remain.get(j)];
			remain.remove(minIndex);
		}
		if (dist[end] == Integer.MAX_VALUE)
			return 0;
		return dist[end] + 1;
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

	public int ladderLength1(String beginWord, String endWord, Set<String> wordList) {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.add(beginWord);
		int level = 1;
		while (!queue.isEmpty()) {
			level++;
			int size = queue.size();
			for (int k = 0; k < size; k++) {
				String current = queue.poll();
				char[] chars = current.toCharArray();
				for (int i = 0; i < current.length(); i++) {
					char tmp = chars[i];
					for (int j = 0; j < 26; j++) {
						chars[i] = (char) ('a' + j);
						String t = new String(chars);
						if (t.equals(endWord))
							return level;
						if (wordList.contains(t)) {
							queue.add(t);
							wordList.remove(t);
						}
					}
					chars[i] = tmp;
				}
			}

		}

		return 0;
	}
}
