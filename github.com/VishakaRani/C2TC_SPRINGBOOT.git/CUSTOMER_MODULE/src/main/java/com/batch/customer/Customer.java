package com.batch.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer
{
	private Integer id;
	private String name;
	private String orderid;
	private String phone;
	private String email;
	
	public Customer(Integer id, String name, String orderid, String phone, String email) {
	
		this.id = id;
		this.name = name;
		this.orderid = orderid;
		this.phone = phone;
		this.email = email;
	}
	public Customer() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderid=" + orderid + ", phone=" + phone + ", email="
				+ email + "]";
	}
}
