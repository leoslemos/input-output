package br.com.inputoutput.controller;

import br.com.inputoutput.model.Estudante;
import br.com.inputoutput.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteRepository estudanteRepository;

    @PostMapping(path = "/")
    public @ResponseBody
    ResponseEntity<Estudante> addEstudante(@RequestBody Estudante estudante){
        try{
            Estudante nEstudante = estudanteRepository.save(estudante);
            return new ResponseEntity<>(nEstudante, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
