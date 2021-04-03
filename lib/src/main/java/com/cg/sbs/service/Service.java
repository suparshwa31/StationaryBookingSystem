package com.cg.sbs.service;

import com.cg.sbs.entity.*;

public interface Service {
	public void addProduct(Products prod);
	public void addCart(Cart prod);
	public void addCustomer(Customer prod);
	public void addReview(Review prod);
	public void addAddress(Address prod);
	public void delProduct(Products prod);
	public void delCart(Cart prod);
	public void delCustomer(Customer prod);
	public void delReview(Review prod);
	public void delAddress(Address prod);
}
