package br.upe.sicc.negocio;

import br.upe.sicc.entidade.Evento;
import br.upe.sicc.entidade.Profissional;
import java.io.Serializable;
import java.util.List;

public interface ServicosEvento extends Serializable {
  
    public void cadastrar(Evento evento) throws EventoExistenteException;
    public void atualizar(Evento profissional) throws EventoInexistenteException;
    public void remover (Long id) throws EventoInexistenteException;
    public List<Evento> listarTodos();
    public List<Evento> buscarPorNomeOrDiaOrLugarOrTipoOrOrganizador (String nome, String dia, String lugar, String tipo, String Organizador);
    
}
