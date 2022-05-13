package com.skilldistillery.crypto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.crypto.data.CryptoDAO;

@Controller
public class CryptoController {

	@Autowired
	private CryptoDAO dao;

	@RequestMapping(path = {"/", "index.do"})
	public String index(Model model) {
		model.addAttribute("crypto", dao.findById(1));
		return "index";
	}

}
