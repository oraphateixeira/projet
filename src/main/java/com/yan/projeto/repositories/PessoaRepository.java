package com.yan.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yan.projeto.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
