package br.upe.sicc.entidade;

import br.upe.sicc.entidade.Grupo;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class LugarAlternativo extends Lugar {

    private Pessoa pessoaResponsavel;
    private Grupo grupoRepsonsavel;

    public LugarAlternativo(String nome, String cep, String edereco,
            int numero, String complemento, String bairro,
            List<Evento> eventos, Pessoa pessoaResponsavel,
            Grupo grupoRepsonsavel) {
        super(nome, cep, edereco, numero, complemento, bairro, eventos);
        this.pessoaResponsavel = pessoaResponsavel;
        this.grupoRepsonsavel = grupoRepsonsavel;
    }

    public LugarAlternativo() {
        
    }

    @ManyToOne
    public Pessoa getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(Pessoa pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @ManyToOne
    public Grupo getGrupoRepsonsavel() {
        return grupoRepsonsavel;
    }

    public void setGrupoRepsonsavel(Grupo grupoRepsonsavel) {
        this.grupoRepsonsavel = grupoRepsonsavel;
    }

    @Override
    public String toString() {
        return "LugarAlternativo{" + "pessoaResponsavel=" + pessoaResponsavel + ", grupoRepsonsavel=" + grupoRepsonsavel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.pessoaResponsavel != null ? this.pessoaResponsavel.hashCode() : 0);
        hash = 97 * hash + (this.grupoRepsonsavel != null ? this.grupoRepsonsavel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LugarAlternativo other = (LugarAlternativo) obj;
        if (this.pessoaResponsavel != other.pessoaResponsavel && (this.pessoaResponsavel == null || !this.pessoaResponsavel.equals(other.pessoaResponsavel))) {
            return false;
        }
        if (this.grupoRepsonsavel != other.grupoRepsonsavel && (this.grupoRepsonsavel == null || !this.grupoRepsonsavel.equals(other.grupoRepsonsavel))) {
            return false;
        }
        return true;
    }
}
