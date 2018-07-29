package com.niharika.CourseProject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
	private long id;

	@Column(name = "description")
	private String desc;

	@ManyToOne
	@JoinColumn(name = "iduser")
	private User user;
	
	
	
	
	
	
public void setId(long id) {
		this.id = id;
	}

	//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ManyToOne
    @JoinColumn(name = "date_id")
	private Datedim datedim;

	public long getId() {
		return id;
	}

	public Task() {

	}

	public Task(String desc, User user, Datedim datedim) {
		super();
		this.desc = desc;
		this.user = user;
		this.datedim = datedim;
	}

	public Datedim getDatedim() {
		return datedim;
	}

	public void setDatedim(Datedim datedim) {
		this.datedim = datedim;
	}

	public Task(String desc) {
		this.desc = desc;
	}

	public Task(String desc, User user) {
		super();
		this.desc = desc;
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
