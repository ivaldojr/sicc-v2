package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Equipamento;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioAreaDeAtucao extends CrudRepository<Equipamento, Long>{
    
}
