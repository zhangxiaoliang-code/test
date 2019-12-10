package com.zxl.test.designpattern.mashibing.abstractfactory;

public abstract class AbstractFactory {
	abstract Food createFood();
	abstract Vehicle createVehicle();
	abstract Weapon createWeapon();
}
