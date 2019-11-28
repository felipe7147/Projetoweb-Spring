package com.felipealmeida.projetoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipealmeida.projetoWeb.modelo.Endereco;
import com.felipealmeida.projetoWeb.service.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
	@Autowired
	private EnderecoService service;

	@Autowired
	public EnderecoResource (EnderecoService service) {
		this.service=service;
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Long id){
		Endereco ed = service.findById(id);
		return ResponseEntity.ok().body(ed);
		
	}
	
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		List<Endereco> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}