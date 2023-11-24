package com.hexaware.restcrud.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	private String ename;
	private  double salary;
	private  LocalDate doj;
	
	
	public Long getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
	
	
	
	
	

}
