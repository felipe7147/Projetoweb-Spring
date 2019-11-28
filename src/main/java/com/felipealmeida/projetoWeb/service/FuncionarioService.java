package com.felipealmeida.projetoWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealmeida.projetoWeb.modelo.Funcionario;
import com.felipealmeida.projetoWeb.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	public void add(Funcionario funcionario) {
		this.repository.save(funcionario);
	}

	public void remove(Funcionario funcionario) {
		this.repository.delete(funcionario);
	}

	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	public void edit(Funcionario funcionario) {
		this.repository.saveAndFlush(funcionario);
	}

	public Funcionario save(Funcionario funcionario) {
		return this.repository.save(funcionario);
	}

	public Funcionario findById(Long id) {
		Optional<Funcionario> obj = repository.findById(id);
		return obj.get();
	}

}