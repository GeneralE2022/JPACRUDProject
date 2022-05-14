package com.skilldistillery.crypto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="token")
public class Crypto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String token;

	private String description;

	// const
	public Crypto() {
		super();
	}
	
	

	public Crypto(int id, String name, String token, String description) {
		super();
		this.id = id;
		this.name = name;
		this.token = token;
		this.description = description;
	}



	// methods
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
	
	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Crypto [id=" + id + ", name=" + name + ", token=" + token + ", description=" + description + "]";
	}

	
	
	
}