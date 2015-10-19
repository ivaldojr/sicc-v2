package br.upe.sicc.entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class AreaDeAtuacao {

    private Long id;
    private String nome;
    private List<Atividade> atividades;
    private List<Profissional> profissionais;

    public AreaDeAtuacao(String nome, List<Atividade> atividades, List<Profissional> profissionais) {
        this.nome = nome;
        this.atividades = atividades;
        this.profissionais = profissionais;
    }

    public AreaDeAtuacao() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @OneToMany(mappedBy = "areaDeAtucao")
    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    @ManyToMany
    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

    @Override
    public String toString() {
        return "AreaDeAtuacao{" + "id=" + id + ", nome=" + nome + ", atividades=" + atividades + ", profissionais=" + profissionais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 47 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 47 * hash + (this.atividades != null ? this.atividades.hashCode() : 0);
        hash = 47 * hash + (this.profissionais != null ? this.profissionais.hashCode() : 0);
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
        final AreaDeAtuacao other = (AreaDeAtuacao) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.atividades != other.atividades && (this.atividades == null || !this.atividades.equals(other.atividades))) {
            return false;
        }
        if (this.profissionais != other.profissionais && (this.profissionais == null || !this.profissionais.equals(other.profissionais))) {
            return false;
        }
        return true;
    }
}
