package com.gerenciamentopessoas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamentopessoas.model.JornadaTrabalho;
import com.gerenciamentopessoas.repository.JornadaRepository;

import antlr.collections.List;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
    	
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List findAll() {
        return (List) jornadaRepository.findAll();

    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {

        return jornadaRepository.findById(idJornada);

    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){

        return jornadaRepository.save(jornadaTrabalho);
    }

    public  void  deleteById(Long idJornada) {

    jornadaRepository.deleteById(idJornada);

    }
}
