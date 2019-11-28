package com.felipealmeida.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealmeida.projetoWeb.modelo.Empresa;
import com.felipealmeida.projetoWeb.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	public void add(Empresa empresa) {
		this.repository.save(empresa);
	}

	public void remove(Empresa empresa) {
		this.repository.delete(empresa);
	}

	public List<Empresa> findAll() {
		return repository.findAll();
	}

	public void edit(Empresa empresa) {
		this.repository.saveAndFlush(empresa);
	}

	public Empresa save(Empresa empresa) {
		return this.repository.save(empresa);
	}

	public Empresa findById(Long id) {
		Optional<Empresa> obj = repository.findById(id);
		return obj.get();
	}

}