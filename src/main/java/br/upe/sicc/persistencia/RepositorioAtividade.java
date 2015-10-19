package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Atividade;
import br.upe.sicc.entidade.Equipamento;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioAtividade extends CrudRepository<Equipamento, Long>{
    
    public List<Atividade> findByAreaDeAtuacao (String areaDeAtuacao);
   
}
