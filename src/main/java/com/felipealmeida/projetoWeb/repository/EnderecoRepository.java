package com.felipealmeida.projetoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipealmeida.projetoWeb.modelo.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}