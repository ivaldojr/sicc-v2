package br.upe.sicc.negocio;

import br.upe.sicc.entidade.Grupo;
import java.io.Serializable;
import java.util.List;

public interface ServicosGrupo extends Serializable{
    
    public void cadastrar(Grupo grupo) throws GrupoExistenteException;
    public void atualizar(Grupo grupo) throws GrupoInexistenteException;
    public void remover (Long id) throws GrupoInexistenteException;
    public List<Grupo> listarTodos();
    public Grupo buscarPorCPFAndSenha (String cpf, String senha) throws GrupoInexistenteException;
    public Grupo buscarPorCPFOrCNPJ (String cpf, String cnpj) throws GrupoInexistenteException;
    public List<Grupo> buscarPorNomeOrTipo (String nome, String tipo)throws GrupoInexistenteException;

}
