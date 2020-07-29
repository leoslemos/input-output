package br.com.inputoutput.controller;

import br.com.inputoutput.model.CursoRegistro;
import br.com.inputoutput.repository.CursoResgistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/cursoRegistro")
public class CursoRegistroController {

    @Autowired
    private CursoResgistroRepository cursoResgistroRepository;

    @PostMapping(path = "/")
    public @ResponseBody
    ResponseEntity<CursoRegistro> addCursoRegistro(@RequestBody CursoRegistro cursoRegistro){
        try{
            CursoRegistro nCursoResgistro = cursoResgistroRepository.save(cursoRegistro);
            return new ResponseEntity<>(nCursoResgistro, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
