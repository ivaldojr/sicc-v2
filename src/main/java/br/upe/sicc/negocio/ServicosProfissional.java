package br.upe.sicc.negocio;

import br.upe.sicc.entidade.Profissional;
import java.io.Serializable;
import java.util.List;

public interface ServicosProfissional extends Serializable{
    
    public void cadastrar(Profissional profissional) throws ProfissionalExistenteException;
    public void atualizar(Profissional profissional) throws ProfissionalInexistenteException;
    public void remover (Long id) throws ProfissionalInexistenteException;
    public List<Profissional> listarTodos();
    public Profissional buscarPorCPFAndSenha (String cpf, String senha) throws ProfissionalInexistenteException;
    public Profissional buscarPorCPF (String cpf) throws ProfissionalInexistenteException;
    public List<Profissional> buscarPorNomeOrAreaOrAtividade (String nome, String area, String atividade)throws ProfissionalInexistenteException;
}
