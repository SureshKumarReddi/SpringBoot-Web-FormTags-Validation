package com.Suresh.SpringBoot.Models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Student {
	@NotNull(message = "Id should not be blank")
	private Integer studId;
	@NotNull(message = "Name should not be blank")
	private String studName;
	@NotNull(message = "age must not be null")
	@Min(value = 18,message = "Age must be Greater than 18")
	private Integer studAge;
	@NotNull(message = "Phno should not be blank")
	private Integer studphone;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studName, int studAge, int studphone) {
		this.studName = studName;
		this.studAge = studAge;
		this.studphone = studphone;
	}

 
	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Integer getStudAge() {
		return studAge;
	}

	public void setStudAge(Integer studAge) {
		this.studAge = studAge;
	}

	public Integer getStudphone() {
		return studphone;
	}

	public void setStudphone(Integer studphone) {
		this.studphone = studphone;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studphone="
				+ studphone + "]";
	}

}
