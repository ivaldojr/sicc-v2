package br.upe.sicc.negocio;

import br.upe.sicc.entidade.Equipamento;
import java.io.Serializable;
import java.util.List;

public interface ServicoEquipamento extends Serializable {
    
    public void cadastrar(Equipamento equip) throws EquipamentoExistenteException;
    public void atualizar(Equipamento equip) throws EquipamentoInexistenteException;
    public void remover(Long id) throws EquipamentoInexistenteException;
    public List<Equipamento> listarTodos();
    public Equipamento buscarCpfSenha(String cpf, String senha) throws EquipamentoInexistenteException;
    public List<Equipamento> listarPorNomeOuTipo(String nome, String tipo);
    public Equipamento buscarCpfouCnpj(String cpf, String cnpj) throws EquipamentoInexistenteException;
    
}
