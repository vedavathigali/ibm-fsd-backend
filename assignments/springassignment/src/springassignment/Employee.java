package springassignment;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	int id;
	String name;
	LocalDate dob=LocalDate.parse("2018-02-22");
	

	int age;
	String designation;
	double salary;
	List skills;
	Address address;
	boolean fulltime;
	public Employee(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isFulltime() {
		return fulltime;
	}
	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary + ", skills=" + skills + ", address=" + address + ", fulltime=" + fulltime + ",dob"+ dob +"]";
	}



}
