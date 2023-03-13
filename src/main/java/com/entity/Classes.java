package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String className;
	private int teacherId;
	@OneToMany
	@JoinColumn(name = "classId")
	private List<Student> listOfStudents;
	@OneToMany
	@JoinColumn(name = "classId")
	private List<Subject> listOfSubjects;
	@OneToMany
	@JoinColumn(name = "classId")
	private List<Teacher> listOfTeachers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public List<Subject> getListOfSubjects() {
		return listOfSubjects;
	}

	public void setListOfSubjects(List<Subject> listOfSubjects) {
		this.listOfSubjects = listOfSubjects;
	}

	public List<Teacher> getListOfTeachers() {
		return listOfTeachers;
	}

	public void setListOfTeachers(List<Teacher> listOfTeachers) {
		this.listOfTeachers = listOfTeachers;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", className=" + className + ", teacherId=" + teacherId + ", listOfStudents="
				+ listOfStudents + ", listOfSubjects=" + listOfSubjects + ", listOfTeachers=" + listOfTeachers + "]";
	}

}
