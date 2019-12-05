package com.code.svn;

public class Person {
	
	public static void main(String[] args) {
		System.out.println("aa");//冲突找茬
		System.out.println("aa");//old
		System.out.println("aa");//小烏龜哈哈哈
		System.out.println("aa");//abckyde 
		System.out.println("bbb");//又有冲突又来找茬
	}
	
	private Integer age;

	public Person() {
		super();
	}

	public Person(Integer age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
