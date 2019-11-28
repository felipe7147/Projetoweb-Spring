package com.felipealmeida.projetoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipealmeida.projetoWeb.modelo.Dependente;
import com.felipealmeida.projetoWeb.service.DependenteService;

@RestController
@RequestMapping(value = "/dependentes")
public class DependenteResource {
	@Autowired
	private DependenteService service;

	@Autowired
	public DependenteResource (DependenteService service) {
		this.service=service;
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Dependente> findById(@PathVariable Long id){
		Dependente d = service.findById(id);
		return ResponseEntity.ok().body(d);
		
	}
	
	
	@GetMapping
	public ResponseEntity<List<Dependente>> findAll(){
		List<Dependente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}