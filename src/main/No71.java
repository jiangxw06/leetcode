package main;

import java.util.Stack;

public class No71 {
	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<String>();
		String[] names = path.split("/");
		for (String name : names) {
			if (name.length() == 0)
				continue;
			if (name.equals("."))
				continue;
			if (name.equals("..")) {
				if (!stack.empty())
					stack.pop();
				continue;
			}
			stack.push(name);
		}
		path = "";
		for(int i=0;i<stack.size();i++)
			path+="/"+stack.elementAt(i);
		if(path.length()==0)
			path="/";
		return path;

	}
}
