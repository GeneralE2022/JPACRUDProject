package com.skilldistillery.crypto.data;

import java.util.List;

import com.skilldistillery.crypto.entities.Crypto;

public interface CryptoDAO {
	
	Crypto findById(int CryptoId); 
	List<Crypto>findAll(); 
	Crypto updateSingleRecord(); 
	Crypto deleteSingleRecord(); 
	
}
