package com.streamApi;

public class Employee {
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	
	
	
	/**
	 * @param id
	 * @param name
	 * @param city
	 * @param age
	 * @param gender
	 * @param department
	 * @param yearOfJoining
	 * @param salary
	 */
	public Employee(int id, String name, String city, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the yearOfJoining
	 */
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	/**
	 * @param yearOfJoining the yearOfJoining to set
	 */
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + "]";
	}
}
