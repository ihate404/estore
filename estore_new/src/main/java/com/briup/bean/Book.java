package com.briup.bean;

import java.util.Date;

/**
 * 商品类
 * */
public class Book {
	private Long id;
	private String name;
	private Double price;
	private String author;
	private Date pubDate;
	private String description;
	private String publisher;
	private Category category;
	private String imgPath;
	private int click;
	public Book(){}
	
	

	public Book(Long id, String name, Double price, String author,
			Date pubDate, String description, String publisher,
			Category category, String imgPath, int click) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.pubDate = pubDate;
		this.description = description;
		this.publisher = publisher;
		this.category = category;
		this.imgPath = imgPath;
		this.click = click;
	}


	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price
				+ ", author=" + author + ", pubDate=" + pubDate
				+ ", description=" + description + ", publisher=" + publisher
				+ ", category=" + category + "]";
	}
	
}
