package com.zxl.test.jvm.shudaizi.classloader1;

public class MyTest3 {

	static {
		i = 0;
		//System.out.println(i);//Error:Cannot reference a field before it is defined(非法向前应用)
	}
	
	static int i;
	
	public static void main(String[] args) {
		System.out.println(i);
	}
}


