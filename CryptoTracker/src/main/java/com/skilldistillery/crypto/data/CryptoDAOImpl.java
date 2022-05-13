package com.skilldistillery.crypto.data;

import java.util.List;

import javax.persistence.EntityManager;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crypto updateSingleRecord() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Crypto deleteSingleRecord() {
		
		return null; 
	}

}
