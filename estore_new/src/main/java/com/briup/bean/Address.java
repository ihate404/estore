package com.briup.bean;
/**
 * 地址
 * */
public class Address {
	private Long id;
	private String receiveName;
	private String address;
	private String phone;
	private Customer customer;
	public Address(){}
	
	public Address(Long id, String receiveName, String address, String phone,
			Customer customer) {
		super();
		this.id = id;
		this.receiveName = receiveName;
		this.address = address;
		this.phone = phone;
		this.customer = customer;
	}

	public Address(Long id, String receiveName, String address, String phone) {
		super();
		this.id = id;
		this.receiveName = receiveName;
		this.address = address;
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", receiveName=" + receiveName
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
}
