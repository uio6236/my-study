package com.kh.pos.model;

public class Customer {
    private String name;
    private int age;
    private int points;

    public Customer() {super();}
    public Customer(String name, int age) {
    	super();
    	this.name = name;
        this.age = age;
    }
    public int getPoints() {return points;}
    public void setPoints(int points) {this.points = points;}
    public int getAge() {return age;}
    public String getName() {return name;}
	@Override
	public String toString() {
		return ("이름: " + name + ", 나이: " + age + ", 포인트: " + points);
	}

    

}
