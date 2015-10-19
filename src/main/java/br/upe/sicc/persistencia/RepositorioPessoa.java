package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioPessoa extends CrudRepository<Pessoa, Long>{
    
}
