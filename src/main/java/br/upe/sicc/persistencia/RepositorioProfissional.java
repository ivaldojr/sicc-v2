package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Profissional;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioProfissional extends CrudRepository<Profissional, Long>{
    public Profissional findByCpfAndSenha (String cpf, String senha);
    public Profissional findByCpf (String cpf);
    public List<Profissional> findByNomeOrAreaOrAtividade (String nome, String area, String atividade);
}
