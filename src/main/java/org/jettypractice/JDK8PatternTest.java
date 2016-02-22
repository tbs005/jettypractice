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
		System.out.println(Pattern.matches("^a*b$", "aaaab"));
		
		System.out.println(Pattern.matches("^[a-z]*$", "aaeez"));
		System.out.println(Pattern.matches("^[a-f]*$", "aaaaaaaabf"));
		System.out.println(Pattern.matches("^[a-f]*$", "aaaaaaaabfg"));
		System.out.println("-------------------------------------------");
		
		String regex=",";
		String str = "one,two,three,four,five";
		Pattern p = Pattern.compile(regex);
		String [] s = p.split(str);
		for (String tmp:s){
			System.out.println(tmp);
		}
		System.out.println("-------------------------------------------");
		
		String [] s1 = p.split(str,3);
		for(String tmp:s1){
			System.out.println(tmp);
		}
		System.out.println("-------------------------------------------");
		
		String [] s2 = p.split(str,5);
//		String [] s2 = p.split(str,6);
		for(String tmp:s2){
			System.out.println(tmp);
		}
		System.out.println("-------------------------------------------");
		
		String [] s3 = p.split(str,-1);
		for(String tmp:s3){
			System.out.println(tmp);
		}
	}

}
