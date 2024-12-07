package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {  
 
	@Id
	private int id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private String genere;
	
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false)
	private int publishedyear;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenere() {
		return genere;
	}

	public double getPrice() {
		return price;
	}

	public int getPublishedyear() {
		return publishedyear;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genere=" + genere + ", price=" + price
				+ ", publishedyear=" + publishedyear + "]";
	}
	
}
