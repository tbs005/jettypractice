package org.jettypractice;

/**
 * 分布式一致性哈希算法学习时有个取模运算比较模糊，看看资料记录在这里
 * 规律：
 * 左边如果小于右边，结果是左边
 * 左边等于右边，结果是0
 * 右边是1，结果是0
 *  1%-5=1
 *  -1%5=-1
 *  取模的时候如果运算里出现了负数，这个负数只看被模数，或者看%左边，右边正负都不管！
 *  参考文章：
 *  http://my.oschina.net/u/1580996/blog/501960
 *  http://blog.sina.com.cn/s/blog_6940cab30101hji5.html
 */
public class JDK8ModTest {
	public static void main(String[] args) {
		System.out.println(1%9);
		System.out.println(2%9);
		System.out.println(3%9);
		System.out.println(4%9);
		System.out.println(5%9);
		System.out.println(6%9);
		System.out.println(7%9);
		System.out.println(8%9);
		System.out.println(9%9);
		System.out.println(10%9);
		System.out.println(11%9);
	}
}
