package com.niharika.CourseProject.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iduser")
	private long id;
	@OneToMany(mappedBy = "user")
	private Set<Task> tasks;
	
	 public Set<Task> getTasks() {
		return tasks;
	}


	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	@Column(columnDefinition = "VARCHAR(45)")
	  private String name;
	 
	 
	  
	  public String getFav_book() {
		return fav_book;
	}


	public void setFav_book(String fav_book) {
		this.fav_book = fav_book;
	}


	public String getFav_movie() {
		return fav_movie;
	}


	public void setFav_movie(String fav_movie) {
		this.fav_movie = fav_movie;
	}


	public String getFav_city() {
		return fav_city;
	}


	public void setFav_city(String fav_city) {
		this.fav_city = fav_city;
	}

	private String email;
	  
	@Column(columnDefinition="VARCHAR(60)")
	  private String password;
	
	
	@Column(columnDefinition = "VARCHAR(15)")
	private String fav_book;
	private String fav_movie;
	private String fav_city;
	
	public User() {
		
	}
	
 
	public User(String name, String password,String email,String fav_book,String fav_movie,String fav_city) {
	super();
	
	this.name = name;
	this.password = password;
	this.email =email;

	this.fav_book=fav_book;
	this.fav_movie=fav_movie;
	this.fav_city=fav_city;
}
	@Override
	public String toString() {
		return String.format(
				"User [id=%s, tasks=%s, name=%s, email=%s, password=%s, fav_book=%s, fav_movie=%s, fav_city=%s]", id,
				tasks, name, email, password, fav_book, fav_movie, fav_city);
	}


	public void setId(long id) {
		this.id = id;
		
	}
	
	 public long getId() {
			return id;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

public void  setEmail(String email)
{
	this.email=email;
}

public String getEmail()
{
	return email;
}
}
