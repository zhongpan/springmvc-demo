package com.zp.demo.beans;

public class Sword {

    public Sword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	String name;
	int age;
	
	
	@Override
	public String toString() {
		return "Sword [name=" + name + ", age=" + age + "]";
	}    
}