package com.felipealmeida.projetoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipealmeida.projetoWeb.modelo.Empresa;
import com.felipealmeida.projetoWeb.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {
	@Autowired
	private EmpresaService service;

	@Autowired
	public EmpresaResource (EmpresaService service) {
		this.service=service;
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Empresa> findById(@PathVariable Long id){
		Empresa e = service.findById(id);
		return ResponseEntity.ok().body(e);
		
	}
	
	
	@GetMapping
	public ResponseEntity<List<Empresa>> findAll(){
		List<Empresa> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
