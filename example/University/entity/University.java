package com.example.University.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university")
public class University {
	@Id
	private int id;
	@Column(name="kakatiya")
	private String name;
	public University(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public University() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + "]";
	}
	
	

}
