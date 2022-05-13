package com.skilldistillery.crypto.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CryptoTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Crypto crypto;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("crypto");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		crypto = em.find(Crypto.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		crypto = null;
	}

	@Test
	@DisplayName("CRYPTO testing basic customer mapping")
	void test1() {
		assertNotNull(crypto);
		assertEquals("Bitcoin", crypto.getName());
	}

}