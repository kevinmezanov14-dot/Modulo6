package com.biblioteca.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.sevices.AutorService;

@Controller
@RequestMapping("/autores")
public class AutorController {
	@Autowired
	private AutorService autorService;

	public AutorService getAutorService() {
		return autorService;
	}

	public void setAutorService(AutorService autorService) {
		this.autorService = autorService;
	}
	
		
	}
	


