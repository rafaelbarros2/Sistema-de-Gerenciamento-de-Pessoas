package com.gerenciamentopessoas.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamentopessoas.model.JornadaTrabalho;
import com.gerenciamentopessoas.repository.JornadaRepository;



@Service
public class JornadaService {

   
    JornadaRepository jornadaRepository;
    
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
    	this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
    	
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return  jornadaRepository.findAll();
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
