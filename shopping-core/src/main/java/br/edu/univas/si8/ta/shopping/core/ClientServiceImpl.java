package br.edu.univas.si8.ta.shopping.core;

import javax.ejb.EJB;

import br.edu.univas.si8.ta.shopping.api.ClientService;

public class ClientServiceImpl implements ClientService {
	
	//@EJB(mappedName = "java:app/shopping-ejb-0.1-SNAPSHOT/ClientBean!br.edu.univas.si8.ta.shopping.ejb.interfaces.ClientRemote")
	// private Client client;
	
	@Override
	public String[] listOrders() {
		// return client.listClientNames();
		return null;
	}

	@Override
	public String addOrder(String description) {
		// TODO Auto-generated method stub
		return null;
	}

}
