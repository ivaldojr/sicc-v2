package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Lugar;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioLugar extends CrudRepository<Lugar, Long> {
    
}
