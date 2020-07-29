package br.com.inputoutput.repository;

import br.com.inputoutput.model.Estudante;
import org.springframework.data.repository.CrudRepository;

public interface EstudanteRepository extends CrudRepository<Estudante, Integer> {
}
