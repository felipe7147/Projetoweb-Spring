package com.felipealmeida.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealmeida.projetoWeb.modelo.Dependente;
import com.felipealmeida.projetoWeb.repository.DependenteRepository;

@Service
public class DependenteService {

	@Autowired
	private DependenteRepository repository;

	public void add(Dependente dependente) {
		this.repository.save(dependente);
	}

	public void remove(Dependente dependente) {
		this.repository.delete(dependente);
	}

	public List<Dependente> findAll() {
		return repository.findAll();
	}

	public void edit(Dependente dependente) {
		this.repository.saveAndFlush(dependente);
	}

	public Dependente save(Dependente dependente) {
		return this.repository.save(dependente);
	}

	public Dependente findById(Long id) {
		Optional<Dependente> obj = repository.findById(id);
		return obj.get();
	}

}
