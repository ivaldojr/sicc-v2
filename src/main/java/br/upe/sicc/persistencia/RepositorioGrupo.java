package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Grupo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioGrupo extends CrudRepository<Grupo, Long> {
    public Grupo findByCpfAndSenha (String cpf, String senha);
    public Grupo findByCpfOrCnpj (String cpf, String Cnpj);
    public List<Grupo> findByNomeOrTipo (String nome, String tipo);
    
}
