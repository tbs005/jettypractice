package org.jettypractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * <p>
 * Title:JavaIO 测试类
 * </p>
 * <p>
 * Description:Java IO API
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author tbs005 tbs005@qq.com
 * @date 2016年2月25日上午10:49:23
 */
public class JDK8IOTest {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\javaio.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		
		
		FileInputStream in = new FileInputStream(file);
		byte[] bytes = new byte[1024];
//		FileChannel channel = in.getChannel();
		in.read(bytes);
		in.close();

	}
}
