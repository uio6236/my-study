package com.kh.model.set;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private double score;

	public Student() {}
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getScore() {return score;}
	public void setScore(double score) {this.score = score;}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	// 이름과 나이가 같은 경우 동일 객체로 판단
	@Override
	public int hashCode() {return Objects.hash(name, age);}
	@Override
	public boolean equals(Object obj) {
		// 현재 객체 : this
		// 다른 객체 : Object obj ---> 다운캐스팅(Student)
		// 현재 객체와 전달된 객체(다른 객체)가 같은 객체
		if (this == obj) return true;
		// 전달된 객체가 비어 있는 경우
		if (obj == null) return false;
		Student other = (Student)obj;
		return this.name.equals(other.name) && this.age == other.age;
	}
}
