package com.zxl.test.dp.mashibing.factorymethod;

public class Main {
	public static void main(String[] args) {
		Moveable m = new CarFactor().create();
		m.go();
	}
}
