package Composition;
import java.io.*;
import java.util.*;


class Employee {
	private String name;
	private String position;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	Employee(String name, String position) {
		this.name = name;
		this.position = position;
		}
	}

class Salary {
	private final List<Employee> emp;
	Salary (List<Employee> emp)
	{
		this.emp = emp;
		}
	public List<Employee> getSalaryInEmp(){
		return emp;
		}
	}
