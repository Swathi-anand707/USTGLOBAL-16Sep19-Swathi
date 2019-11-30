package com.ustglobal.jpawithhibernateapp.manytomany;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy ="student")
	@JoinTable(name = "student_course",joinColumns =@JoinColumn(name="cid"),
	inverseJoinColumns = @JoinColumn(name="sid"))
	private List<Course> course;

}
