package br.upe.sicc.negocio;

import br.upe.sicc.entidade.Atividade;
import java.io.Serializable;
import java.util.List;

public interface ServicosAtividade extends Serializable{
    
    public void cadastrar(Atividade atividade) throws AtividadeExistenteException;
    public void atualizar(Atividade atividade) throws AtividadeInexistenteException;
    public void remover (Long id) throws AtividadeInexistenteException;
    public List<Atividade> listarTodos();
    public List<Atividade> buscarPorAreaDeAtuacao (String area)throws ProfissionalInexistenteException;
}
