/**
 * @tile:JDK8NIOTest.java
 * @package:org.jettypractice
 * @Description:TODO
 * @author tbs005 tbs005@qq.com
 * @date 2016年2月25日上午11:06:27
 * @version v1.0
 */
package org.jettypractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p>Title:JDK8 Java NIO Test</p>
 * <p>Description:此类用来测试Java NIO 相关API</p>
 * <p>Company:</p>
 * @author tbs005 tbs005@qq.com
 * @date 2016年2月25日上午11:06:27
 */
public class JDK8NIOTest {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\javanio.txt");
		
		FileOutputStream fout = new FileOutputStream(file);
		
		FileChannel channel = fout.getChannel();
		
		String s= "java nio test.";
		ByteBuffer buff = ByteBuffer.allocate(1024);
		buff.put(s.getBytes());
		buff.flip();//在将数据读入缓存或者将缓存数据写入channel时，flip方法必须调用，这个方法使缓冲区的状态切换为读或者写read状态。
		
		channel.write(buff);
		
		channel.close();
		fout.close();

	}

}
