package br.upe.sicc.persistencia;

import br.upe.sicc.entidade.Equipamento;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioEquipamento extends CrudRepository<Equipamento, Long>{
    public Equipamento findByCpfAndSenha (String cpf, String senha);
    public Equipamento findByCpfOrCnpj (String cpf, String Cnpj);
    public List<Equipamento> findByNomeOrTipo (String nome, String tipo);
}
