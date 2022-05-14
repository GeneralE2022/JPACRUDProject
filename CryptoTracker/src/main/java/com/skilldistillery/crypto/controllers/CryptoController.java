package com.skilldistillery.crypto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.crypto.data.CryptoDAO;
import com.skilldistillery.crypto.entities.Crypto;

@Controller
public class CryptoController {

	@Autowired
	private CryptoDAO dao;

	@RequestMapping(path = { "/", "index.do" })
	public String index(Model model) {
		model.addAttribute("cryptos", dao.findAll());
		return "index";
	}
	
	@RequestMapping("getToken.do")
	public String getSingleToken(@RequestParam int token, Model model) {
		Crypto crypto = dao.findById(token);
		model.addAttribute("c", crypto);
		return "getSingleToken";
	}

	@RequestMapping(path = "deleteToken.do", params = "id")
	public String deleteToken(Integer id, Model model) {
		Crypto crypto = dao.findById(id);
		dao.delete(id);
		model.addAttribute("c", crypto);
		return "deleteToken";
	}
	
	
	@RequestMapping(path = "editToken.do", params = {"id", "editname", "editsymbol", "editdescription"})
	public String updateToken(int id, String editname, String editsymbol, String editdescription, Model model) {
		Crypto edited = dao.findById(id); 
		edited.setName(editname);
		edited.setToken(editsymbol);
		edited.setDescription(editdescription);
		dao.updateSingleRecord(id, edited);
		model.addAttribute("edited", edited);
		return "editconfirm";
	}
	
	
	@RequestMapping(path = "createToken.do", params = {"newname", "newsymbol", "newdescription"})
	public String createToken(String newname, String newsymbol, String newdescription, Model model) {
		Crypto newCrypto = null; 
		newCrypto.setName(newname);
		newCrypto.setToken(newsymbol);
		newCrypto.setDescription(newdescription);
		dao.create(newCrypto); 
		model.addAttribute("newcrypto", newCrypto);
		return "index";
	}
	
}
