package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class PrintResult {

	public static void show(Object obj) throws Exception {
		System.out.println(getString(obj));
	}

	private static String getString(Object obj) throws Exception {
		if (obj instanceof Integer || obj instanceof Double || obj instanceof Boolean || obj instanceof Double
				|| obj instanceof Character||obj instanceof String)
			return obj.toString();
		else if (obj.getClass().isArray()) {
			int len = Array.getLength(obj);
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 0; i < len - 1; i++) {
				sb.append(getString(Array.get(obj, i)));
				sb.append(",");
			}
			sb.append(getString(Array.get(obj, len - 1)));
			sb.append("]");
			return sb.toString();
		} else if (obj instanceof Iterable) {
			Iterable iter = (Iterable) obj;
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (Object element : iter) {
				sb.append(getString(element));
				sb.append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("]");
			return sb.toString();
		} else
			return obj.toString();
	}
}
