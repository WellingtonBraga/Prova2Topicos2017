package br.edu.univas.si8.ta.shopping.ejb.interfaces;

public interface Client {
	
	void addOrder(String description);

	String[] listOrders();
}
