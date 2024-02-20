package ru.alan.crudapp1.models;

public class Person {
	private String name;
	private int id;
	private int age;
	private String email;

	public Person(int id, String name, int age, String email) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person() {

	 }
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
