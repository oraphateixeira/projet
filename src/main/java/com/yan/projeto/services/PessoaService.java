package com.yan.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yan.projeto.domain.Pessoa;
import com.yan.projeto.repositories.PessoaRepository;
import com.yan.projeto.services.exceptions.ObjectnotFoundExpection;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	public PessoaRepository repository;
	
	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundExpection("Objeto não encontrado! Id: " + id));
		
	}

	public List<Pessoa> findAll() {
		return repository.findAll();
	}

	public Pessoa create(Pessoa obj) {
	return repository.save(obj);
	}

	public Pessoa update(Long id, Pessoa obj) {
		try {
			Pessoa entity = repository.getReferenceById(id);
			editData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ObjectnotFoundExpection(id);
		}
	}

	private void editData(Pessoa entity, Pessoa obj) {
		entity.setNome(obj.getNome());
		entity.setDataNascimento(obj.getDataNascimento());
	}

}
