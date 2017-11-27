package br.edu.univas.si8.ta.shopping.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.shopping.ejb.entities.Client;

@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "shopping_order")
	private EntityManager em;

	public void insert(Client client) {
		em.persist(client);
	}

	public List<Client> listAll() {
		return em.createQuery("from shopping_order p", Client.class).getResultList();
	}
}
