package com.zxl.test.classloader0;

public class MyTest1 {

	public static void main(String[] args) {
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
		
		
		//启动类加载器可加载的路径
		System.out.println(System.getProperty("sun.boot.class.path"));
		/*
	 	C:\Program Files\Java\jdk1.8.0_161\jre\lib\resources.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\lib\rt.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\lib\sunrsasign.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\lib\jsse.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\lib\jce.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\lib\charsets.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfr.jar;
		C:\Program Files\Java\jdk1.8.0_161\jre\classes
		*/
		
		//
		System.out.println(System.getProperty("java.ext.dirs"));
		/*
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext;
		 * C:\WINDOWS\Sun\Java\lib\ext
		 */
		
		//
		System.out.println(System.getProperty("java.class.path"));
		/*
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\resources.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\rt.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\jsse.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\jce.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\charsets.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfr.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\access-bridge-64.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\cldrdata.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\dnsns.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jaccess.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jfxrt.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\localedata.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\nashorn.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunec.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunjce_provider.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunmscapi.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunpkcs11.jar;
		 * C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\zipfs.jar;
		 * D:\Users\fengunion\eclipse-workspace\Test\bin
		 */
		
		//稍后研究下
//		System.out.printf(format, args);
		
	}
}
