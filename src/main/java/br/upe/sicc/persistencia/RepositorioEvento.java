package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Evento;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioEvento extends CrudRepository<Evento, Long>{
    public List<Evento> findByNomeOrDiaOrLugarOrTipoOrOrganizador (String nome, String dia, String lugar, String tipo, String Organizador);
}
