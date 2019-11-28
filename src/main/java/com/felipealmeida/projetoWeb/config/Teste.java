package com.felipealmeida.projetoWeb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipealmeida.projetoWeb.modelo.Departamento;
import com.felipealmeida.projetoWeb.modelo.Dependente;
import com.felipealmeida.projetoWeb.modelo.Empresa;
import com.felipealmeida.projetoWeb.modelo.Endereco;
import com.felipealmeida.projetoWeb.modelo.Funcionario;
import com.felipealmeida.projetoWeb.repository.DepartamentoRepository;
import com.felipealmeida.projetoWeb.repository.DependenteRepository;
import com.felipealmeida.projetoWeb.repository.EmpresaRepository;
import com.felipealmeida.projetoWeb.repository.EnderecoRepository;
import com.felipealmeida.projetoWeb.repository.FuncionarioRepository;

@Configuration
@Profile("test")
public class Teste implements CommandLineRunner {

@Autowired
private FuncionarioRepository funcionarioRepository;

@Autowired
private EnderecoRepository enderecoRepository;

@Autowired
private DepartamentoRepository departamentoRepository;

@Autowired
private EmpresaRepository empresaRepository;

@Autowired
private DependenteRepository dependenteRepository;

public void run(String... args) throws Exception {



Funcionario f1 = new Funcionario (null,"felipe","felipe_nunesrodrigues@hotmail.com" );
Endereco e1 = new Endereco(null, "joao pessoa", "jardim oceania", "argemiro de figueiredo", 58037030);
Departamento d1 = new Departamento(null, "administrativo", "2042", "d1");
Empresa em1 = new Empresa(null, "jdbc", "5874984", null);
Dependente dp1 = new Dependente(null, "ana", "0123456789", "258741");

funcionarioRepository.saveAll(Arrays.asList(f1));
enderecoRepository.saveAll(Arrays.asList(e1));
departamentoRepository.saveAll(Arrays.asList(d1));
empresaRepository.saveAll(Arrays.asList(em1));
dependenteRepository.saveAll(Arrays.asList(dp1));


//dependenteRepository.deleteById((long) 1);



}

}
