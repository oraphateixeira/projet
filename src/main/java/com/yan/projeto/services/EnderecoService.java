package com.yan.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.projeto.domain.Endereco;
import com.yan.projeto.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	public EnderecoRepository repository;
	
	public List<Endereco> findAll() {
		return repository.findAll();
	}

	public Endereco  findById(Long id) {
		Optional <Endereco> obj = repository.findById(id);
		return obj.get();
	}

}
