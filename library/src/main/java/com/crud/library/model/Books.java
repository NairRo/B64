package com.crud.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue
	private Integer id;
	private String Author;
	private String Title;
	private Double Cost;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(Integer id, String author, String title, Double cost) {
		super();
		this.id = id;
		Author = author;
		Title = title;
		Cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Double getCost() {
		return Cost;
	}
	public void setCost(Double cost) {
		Cost = cost;
	}
}
