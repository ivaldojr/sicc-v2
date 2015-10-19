package br.upe.sicc.negocio;

import br.upe.sicc.entidade.AreaDeAtuacao;
import java.io.Serializable;
import java.util.List;

public interface ServicosAreaDeAtuacao extends Serializable{
    
    public void cadastrar(AreaDeAtuacao area) throws AreaDeAtuacaoExistenteException;
    public void atualizar(AreaDeAtuacao area) throws AreaDeAtucaoInexistenteException;
    public void remover (Long id) throws AreaDeAtucaoInexistenteException;
    public List<AreaDeAtuacao> listarTodos();
    
}
