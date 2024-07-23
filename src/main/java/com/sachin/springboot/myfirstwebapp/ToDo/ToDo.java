package com.sachin.springboot.myfirstwebapp.ToDo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class ToDo {

	
	@Id
	@GeneratedValue
	private int id; 
	private String username;
	
//	BindingResult didn't worked
	//@Size(min=10,message="Enter at least 10 character")
	private String description;
	private LocalDate target;
	private Boolean done;
	
	
	public ToDo(int id, String username, String description, LocalDate target, Boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.target = target;
		this.done = done;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTarget() {
		return target;
	}
	public void setTarget(LocalDate target) {
		this.target = target;
	}
	public Boolean getDone() {
		return done;
	}
	public void setDone(Boolean done) {
		this.done = done;
	}


	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", target=" + target
				+ ", done=" + done + "]";
	}
	
	
	
}
