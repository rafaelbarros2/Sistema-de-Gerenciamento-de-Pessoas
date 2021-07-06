package com.gerenciamentopessoas.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamentopessoas.model.JornadaTrabalho;
import com.gerenciamentopessoas.service.JornadaService;


@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;
    
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    
	@GetMapping
    public List<JornadaTrabalho> getJornada(){
    return   jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {

        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow( () -> new Exception("Jornada não encontrada")));

    }
    
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.update(jornadaTrabalho);

}
   
	@DeleteMapping("/{idJornada}")
    public BodyBuilder deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
    	jornadaService.deleteById(idJornada);
        return  ResponseEntity.ok();

    }
}
