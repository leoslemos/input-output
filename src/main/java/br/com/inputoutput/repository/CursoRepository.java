package br.com.inputoutput.repository;

import br.com.inputoutput.model.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
}
