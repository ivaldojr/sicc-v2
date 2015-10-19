package br.upe.sicc.entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Atividade {

    private Long id;
    private String nome;
    private AreaDeAtuacao areaDeAtucao;
    private List<Profissional> profissionais;

    public Atividade(String nome, AreaDeAtuacao areaDeAtucao, List<Profissional> profissionais) {
        this.nome = nome;
        this.areaDeAtucao = areaDeAtucao;
        this.profissionais = profissionais;
    }

    public Atividade() {
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

    @ManyToOne
    public AreaDeAtuacao getAreaDeAtucao() {
        return areaDeAtucao;
    }

    public void setAreaDeAtucao(AreaDeAtuacao areaDeAtucao) {
        this.areaDeAtucao = areaDeAtucao;
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

}
