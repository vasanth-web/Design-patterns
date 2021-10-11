package com.DecoratorDesignPattern;

public class LuxuryCar implements Car{
	String carName = "BMW M5 CS";
	String carBody;
	String carDoor;
	String carWheels;
	String engine;
	@Override
	public Car manufactureCar() {
		this.carBody = "Carbon fiber";
		this.carDoor = "4 doors";
		this.carWheels = "Diamond cut alloys with Carbon ceramic brakes";
		this.engine = "new";
		return this;
	}
	@Override
	public String toString() {
		return "LuxuryCar [carName=" + carName + ", carBody=" + carBody + ", carDoor=" + carDoor + ", carWheels="
				+ carWheels + ", engine=" + engine + "]";
	}
	
	public String getCarName() {
		return carName;
	}
	public String getCarBody() {
		return carBody;
	}
	public void setCarBody(String carBody) {
		this.carBody = carBody;
	}
	public String getCarDoor() {
		return carDoor;
	}
	public void setCarDoor(String carDoor) {
		this.carDoor = carDoor;
	}
	public String getCarWheels() {
		return carWheels;
	}
	public void setCarWheels(String carWheels) {
		this.carWheels = carWheels;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
}
