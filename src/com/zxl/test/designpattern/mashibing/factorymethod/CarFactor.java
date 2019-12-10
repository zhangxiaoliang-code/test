package com.zxl.test.designpattern.mashibing.factorymethod;

public class CarFactor {
	
	public Moveable create() {
		
		System.out.println("a car created!");
		
		return new Car();
	}

}
