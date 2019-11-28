package com.felipealmeida.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealmeida.projetoWeb.modelo.Endereco;
import com.felipealmeida.projetoWeb.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public void add(Endereco endereco) {
		this.repository.save(endereco);
	}

	public void remove(Endereco endereco) {
		this.repository.delete(endereco);
	}

	public List<Endereco> findAll() {
		return repository.findAll();
	}

	public void edit(Endereco endereco) {
		this.repository.saveAndFlush(endereco);
	}

	public Endereco save(Endereco endereco) {
		return this.repository.save(endereco);
	}

	public Endereco findById(Long id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.get();
	}

}