package com.wineseller.web.entity;

public class Wine {

	private int id;
	private String winename;
	private int price;
	private String img;
	
	public Wine() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Wine(int id, String winename, int price, String img) {
		super();
		this.id = id;
		this.winename = winename;
		this.price = price;
		this.img = img;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWinename() {
		return winename;
	}
	public void setWinename(String winename) {
		this.winename = winename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
