package com.hibernate;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name="students")
public class students {
	@Id
	public int c_id;
	@Column
	public String s_course;
	@Id
	public int s_id;
	@Override
	public String toString() {
		return "students [c_id=" + c_id + ", s_course=" + s_course + ", s_id=" + s_id + ", name=" + name + "]";
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getS_course() {
		return s_course;
	}
	public void setS_course(String s_course) {
		this.s_course = s_course;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String name;
	
	public students()
	{
		
	}
	public students(int c_id, String s_course,int s_id,String name)
	{
		this.c_id=c_id;
		this.s_course=s_course;
		this.s_id=s_id;
		this.name=name;
		
	}

}
