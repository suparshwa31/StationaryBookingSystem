package com.cg.sbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Reviews")
public class Review {
	@Id
	@Column(name="productId")
	private long productId;
	private String productName;
	private String productReview;
	private int productRating;
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
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
	public String getProductReview() {
		return productReview;
	}
	public void setProductReview(String productReview) {
		this.productReview = productReview;
	}
	
	
}
