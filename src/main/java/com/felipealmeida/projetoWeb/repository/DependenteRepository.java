package com.felipealmeida.projetoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipealmeida.projetoWeb.modelo.Dependente;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {

}
