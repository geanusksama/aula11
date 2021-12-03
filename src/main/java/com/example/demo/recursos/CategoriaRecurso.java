package com.example.demo.recursos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaRecurso {
		
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Esta funcionando um REST";
	}
	
}
