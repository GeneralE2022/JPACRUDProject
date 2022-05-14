package com.skilldistillery.crypto.data;

import java.util.List;

import org.springframework.ui.Model;

import com.skilldistillery.crypto.entities.Crypto;

public interface CryptoDAO {
	
	Crypto findById(int id); 
	List<Crypto>findAll(); 
	Crypto updateSingleRecord(int id, Crypto crypto); 
	boolean delete(int id); 
	Crypto create(Crypto crypto); 
	
}