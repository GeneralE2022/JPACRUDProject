package com.skilldistillery.crypto.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.crypto.entities.Crypto;

@Service
@Transactional
public class CryptoDAOImpl implements CryptoDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Crypto findById(int id) {
		return em.find(Crypto.class, id);
	}

	@Override
	public List<Crypto> findAll() {
		String jpql = "SELECT token FROM Crypto token";
		List<Crypto> crypto = em.createQuery(jpql, Crypto.class).getResultList();
		return crypto;
	}

	@Override
	public boolean delete(int id) {
		boolean deleteConfirm = false; 
        Crypto crypto = em.find(Crypto.class, id);
        
        if (crypto != null) {
        	em.remove(crypto);
        	deleteConfirm = !em.contains(crypto); 
        }
        em.close();
        return deleteConfirm; 
	}
	
	@Override
	public Crypto updateSingleRecord(int id, Crypto crypto) {

		Crypto cryptoUpdate = em.find(Crypto.class, id); 
		cryptoUpdate.setName(crypto.getName());
		cryptoUpdate.setToken(crypto.getToken());
		cryptoUpdate.setDescription(crypto.getDescription());
		em.flush();
        em.close();
		return cryptoUpdate;
	}
	
	public Crypto create(Crypto crypto) {
		Crypto newCrypto = new Crypto();
		newCrypto.setName(crypto.getName());
		newCrypto.setToken(crypto.getToken());
		newCrypto.setDescription(crypto.getDescription());
		em.persist(newCrypto);
		em.flush();
        em.close();
		return newCrypto;
	}

}








