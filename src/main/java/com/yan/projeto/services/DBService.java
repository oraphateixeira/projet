package com.yan.projeto.services;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.projeto.domain.Endereco;
import com.yan.projeto.domain.Pessoa;
import com.yan.projeto.repositories.EnderecoRepository;
import com.yan.projeto.repositories.PessoaRepository;

@Service
public class DBService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public void instanciaDB() {

		Pessoa pessoa1 = new Pessoa(null, "Raphael", Instant.parse("1996-01-01T00:00:00Z"));
		Pessoa pessoa2 = new Pessoa(null, "Yan", Instant.parse("1997-02-02T00:00:00Z"));

		Endereco endereco1 = new Endereco(null, "Amaralina", "41905-200", 06, "Salvador", true, pessoa1);
		Endereco endereco2 = new Endereco(null, "7 de Abril", "41906-300", 19, "Salvador", true, pessoa2);
		Endereco endereco3 = new Endereco(null, "Amargosa", "41903-254", 18, "Curitiba", false, pessoa1);
		Endereco endereco4 = new Endereco(null, "Nordeste", "41259-225", 32, "Salvador", false, pessoa2);

		pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2));

		enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2, endereco3, endereco4));

	}

}
