package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.LugarAlternativo;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioLugarAlternativo extends CrudRepository<LugarAlternativo, Long>{
    
}
