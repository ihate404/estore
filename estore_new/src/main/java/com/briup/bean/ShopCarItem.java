package com.briup.bean;

import java.io.Serializable;

public class ShopCarItem implements Serializable{
	private Long id;
	private int num;
	private Book book;
	private double cost;
	private ShopCar car;
	public ShopCarItem(){}
	
	public ShopCarItem(Long id, int num, Book book, double cost, ShopCar car) {
		super();
		this.id = id;
		this.num = num;
		this.book = book;
		this.cost = cost;
		this.car = car;
	}

	public ShopCar getCar() {
		return car;
	}

	public void setCar(ShopCar car) {
		this.car = car;
	}

	public ShopCarItem(Long id, int num, Book book, double cost) {
		super();
		this.id = id;
		this.num = num;
		this.book = book;
		this.cost = cost;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ShopCarItem [id=" + id + ", num=" + num + ", book=" + book + ", cost=" + cost + "]";
	}

}
