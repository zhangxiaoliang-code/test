package com.zxl.test.dp.mashibing.factorymethod;

public class CarFactor {
	
	public Moveable create() {
		
		System.out.println("a car created!");
		
		return new Car();
	}

}
