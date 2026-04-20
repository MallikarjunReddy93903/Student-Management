package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Employee

{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long employeeId;
		private String employeeName;
		private String employeeEmail;
		private String employeePhoneNo;
		private String employeeDepartment;
		private Double employeeSalary;
		private String employeeCity;
		
		
		public Employee()
		{
			
		}


		public Employee(Long employeeId, String employeeName, String employeeEmail, String employeePhoneNo,
				String employeeDepartment, Double employeeSalary, String employeeCity) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeEmail = employeeEmail;
			this.employeePhoneNo = employeePhoneNo;
			this.employeeDepartment = employeeDepartment;
			this.employeeSalary = employeeSalary;
			this.employeeCity = employeeCity;
		}


		public Long getEmployeeId() {
			return employeeId;
		}


		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}


		public String getEmployeeName() {
			return employeeName;
		}


		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}


		public String getEmployeeEmail() {
			return employeeEmail;
		}


		public void setEmployeeEmail(String employeeEmail) {
			this.employeeEmail = employeeEmail;
		}


		public String getEmployeePhoneNo() {
			return employeePhoneNo;
		}


		public void setEmployeePhoneNo(String employeePhoneNo) {
			this.employeePhoneNo = employeePhoneNo;
		}


		public String getEmployeeDepartment() {
			return employeeDepartment;
		}


		public void setEmployeeDepartment(String employeeDepartment) {
			this.employeeDepartment = employeeDepartment;
		}


		public Double getEmployeeSalary() {
			return employeeSalary;
		}


		public void setEmployeeSalary(Double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}


		public String getEmployeeCity() {
			return employeeCity;
		}


		public void setEmployeeCity(String employeeCity) {
			this.employeeCity = employeeCity;
		}
             
            public String toString() {
            	
            	return employeeId + " " + employeeName + " " + employeeEmail + " " + employeePhoneNo + " " + employeeDepartment + " "+ employeeSalary + " " + employeeCity ;
            			
     
        
              }
}
	