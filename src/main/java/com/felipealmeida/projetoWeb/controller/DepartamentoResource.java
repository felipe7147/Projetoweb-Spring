package com.felipealmeida.projetoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipealmeida.projetoWeb.modelo.Departamento;
import com.felipealmeida.projetoWeb.service.DepartamentoService;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoResource {
	@Autowired
	private DepartamentoService service;

	@Autowired
	public DepartamentoResource (DepartamentoService service) {
		this.service=service;
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Departamento> findById(@PathVariable Long id){
		Departamento dep = service.findById(id);
		return ResponseEntity.ok().body(dep);
		
	}
	
	
	@GetMapping
	public ResponseEntity<List<Departamento>> findAll(){
		List<Departamento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
