package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(name="name")
	private String teacherName;
	@Column(name="class_id")
	private int classId;
	@OneToMany
	@JoinColumn(name = "teacherId")
	private List<Classes> listOfClasses;
	@OneToMany
	@JoinColumn(name = "teacherId")
	private List<Subject> listOfSubjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public List<Classes> getListOfClasses() {
		return listOfClasses;
	}

	public void setListOfClasses(List<Classes> listOfClasses) {
		this.listOfClasses = listOfClasses;
	}

	public List<Subject> getListOfSubjects() {
		return listOfSubjects;
	}

	public void setListOfSubjects(List<Subject> listOfSubjects) {
		this.listOfSubjects = listOfSubjects;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", classId=" + classId + ", listOfClasses="
				+ listOfClasses + ", listOfSubjects=" + listOfSubjects + "]";
	}

}
