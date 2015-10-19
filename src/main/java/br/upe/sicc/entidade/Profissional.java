package br.upe.sicc.entidade;

import br.upe.sicc.entidade.AreaDeAtuacao;
import br.upe.sicc.entidade.Grupo;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Profissional extends Pessoa {

    private String nomeArtistico;
    private List<AreaDeAtuacao> areasDeAtuacao;
    private List<Atividade> atividades;
    private String curriculo;
    private String site;
    private List<String> redes;
    private ArrayList<Image> documentos;
    private List<Grupo> grupos;

    public Profissional(String nomeArtistico, List<AreaDeAtuacao> areasDeAtuacao, List<Atividade> atividades, String curriculo, String site, List<String> redes, ArrayList<Image> documentos, List<Grupo> grupos, String cpf, String nome, Date dataNascimento, String cidade, String cidadeNatal, String cep, String endereco, int numero, String complemento, String bairro, String telefone, String telefone2, String email, EnumSexo sexo, EnumEscolaridade escolaridade, Image fotoPerfil, Boolean administrador, List<Evento> eventos, List<LugarAlternativo> lugares, String senha) {
        super(cpf, nome, dataNascimento, cidade, cidadeNatal, cep, endereco, numero, complemento, bairro, telefone, telefone2, email, sexo, escolaridade, fotoPerfil, administrador, eventos, lugares, senha);
        this.nomeArtistico = nomeArtistico;
        this.areasDeAtuacao = areasDeAtuacao;
        this.atividades = atividades;
        this.curriculo = curriculo;
        this.site = site;
        this.redes = redes;
        this.documentos = documentos;
        this.grupos = grupos;
    }

    public Profissional() {
    
    }



    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    @ManyToMany(mappedBy = "profissionais")
    public List<AreaDeAtuacao> getAreasDeAtuacao() {
        return areasDeAtuacao;
    }

    public void setAreasDeAtuacao(List<AreaDeAtuacao> areasDeAtuacao) {
        this.areasDeAtuacao = areasDeAtuacao;
    }

    @ManyToMany(mappedBy = "profissionais")
    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public List<String> getRedes() {
        return redes;
    }

    public void setRedes(List<String> redes) {
        this.redes = redes;
    }

    @ManyToMany(mappedBy = "integrantes")
    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Image> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Image> documentos) {
        this.documentos = documentos;
    }

}
