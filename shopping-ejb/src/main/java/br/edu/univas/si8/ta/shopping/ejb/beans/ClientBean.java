package br.edu.univas.si8.ta.shopping.ejb.beans;

import javax.ejb.EJB;

import br.edu.univas.si8.ta.shopping.ejb.dao.ClientDAO;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.ClientLocal;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.ClientRemote;

public class ClientBean implements ClientLocal, ClientRemote{


	@EJB
	private ClientDAO dao;

	@Override
	public void addOrder(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] listOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
