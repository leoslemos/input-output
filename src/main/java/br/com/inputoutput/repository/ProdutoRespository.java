package br.com.inputoutput.repository;

import br.com.inputoutput.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRespository extends CrudRepository<Produto, Integer> {
}
