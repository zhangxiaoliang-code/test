package com.zxl.test.designpattern.hanshunping.dp.singleton.type1;

public class SingletonTest01 {
	public static void main(String[] args) {
		//测试
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

/**
 * 饿汉式（静态变量） 
 */
class Singleton {
	
	//1.构造器私有化
	private Singleton() {}
	
	//2.类的内部创建对象
	private final static Singleton instance = new Singleton();
	
	//3.向外暴露一个公共的静态方法（getInstance）
	public static Singleton getInstance() {
		return instance;
	}
}
