package com.felipealmeida.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealmeida.projetoWeb.modelo.Departamento;
import com.felipealmeida.projetoWeb.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository repository;

	public void add(Departamento departamento) {
		this.repository.save(departamento);
	}

	public void remove(Departamento departamento) {
		this.repository.delete(departamento);
	}

	public List<Departamento> findAll() {
		return repository.findAll();
	}

	public void edit(Departamento departamento) {
		this.repository.saveAndFlush(departamento);
	}

	public Departamento save(Departamento departamento) {
		return this.repository.save(departamento);
	}

	public Departamento findById(Long id) {
		Optional<Departamento> obj = repository.findById(id);
		return obj.get();
	}

}

