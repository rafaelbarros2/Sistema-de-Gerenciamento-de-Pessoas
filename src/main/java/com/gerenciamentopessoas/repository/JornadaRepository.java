package com.gerenciamentopessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciamentopessoas.model.JornadaTrabalho;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}
