package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Type;

@Entity
@Table(name="BIGMALL")
public class newMall {
	private int mallid;
	private String item_name;
	private float item_price;
	private int item_quantity;
	public newMall() {
		super();
	}
	@Id 
	@Column(name="ID")
	public int getMallid() {
		return mallid;
	}
	public void setMallid(int mallid) {
		this.mallid = mallid;
	}
	@Column(name="ITEMNAME")
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	@Column(name="ITEMPRICE")
	public float getItem_price() {
		return item_price;
	}
	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}
	@Column(name="QUANTITY")
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	@Override
	public String toString() {
		return "newMall [mallid=" + mallid + ", item_name=" + item_name + ", item_price=" + item_price
				+ ", item_quantity=" + item_quantity + "]";
	}
	
	

}
