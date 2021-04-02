package com.cg.sbs.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Products")
public class Products {
	@Id
	@Column(name="productId")
	private long productId;
	private String productName;
	private int quantity;
	private int inStockQty;
	private double cost;
	private boolean availability;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getInStockQty() {
		return inStockQty;
	}
	public void setInStockQty(int inStockQty) {
		this.inStockQty = inStockQty;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", inStockQty=" + inStockQty + ", cost=" + cost + ", availability=" + availability + "]";
	} 
	

}