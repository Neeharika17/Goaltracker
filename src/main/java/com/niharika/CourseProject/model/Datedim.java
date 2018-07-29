package com.niharika.CourseProject.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datedim")
public class Datedim {
	public Datedim(int date_id, Date fulldate, int dayofmonth) {
		super();
		this.date_id = date_id;
		this.fulldate = fulldate;
		this.dayofmonth = dayofmonth;
	}

	
	
	public Datedim() {
		
	}
	
	
	public int getDate_id() {
		return date_id;
	}

	public void setDate_id(int date_id) {
		this.date_id = date_id;
	}

	public Date getFulldate() {
		return fulldate;
	}

	public void setFulldate(Date fulldate) {
		this.fulldate = fulldate;
	}

	public int getDayofmonth() {
		return dayofmonth;
	}

	public void setDayofmonth(int dayofmonth) {
		this.dayofmonth = dayofmonth;
	}

	public Set<Task> getTask() {
		return task;
	}

	public void setTask(Set<Task> task) {
		this.task = task;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "date_id")
	private int date_id;

	@Column(name = "fulldate")
	private Date fulldate;

	@Column(name = "dayofmonth")
	private int dayofmonth;
	
	@OneToMany(mappedBy = "datedim")
	private Set<Task> task;
	 

}
