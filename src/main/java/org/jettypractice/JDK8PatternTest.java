package org.jettypractice;

import java.util.regex.Pattern;

/**
 * Pattern 正则
 * 参考文章地址：http://blog.csdn.net/aerchi/article/details/7440433
 */
public class JDK8PatternTest {

	public static void main(String[] args) {
		
		
		Pattern pt=Pattern.compile("a*b");
		boolean result = pt.matcher("aaaab").matches();
		System.out.println(result);
		
		//
		System.out.println(Pattern.matches("a*b", "aaaaaaaab"));
	}

}
