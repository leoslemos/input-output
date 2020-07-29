package br.com.inputoutput.controller;

import br.com.inputoutput.model.Curso;
import br.com.inputoutput.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/curso")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping(path = "/")
    public @ResponseBody
    ResponseEntity<Curso> addCurso(@RequestBody Curso curso){
        try{
            Curso nCurso = cursoRepository.save(curso);
            return new ResponseEntity<>(nCurso, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
