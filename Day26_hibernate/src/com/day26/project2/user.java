package com.day26.project2;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user
{
	
	
	public user() {
		
		
	}
	
	
	public user(int id, String name, int pno, String email) {
		super();
		this.id= id;
		this.name = name;
		this.pno = pno;
		this.email = email;
		
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="pno")
	int pno;
	
	@Column(name="email")
	String email;
	
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

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
