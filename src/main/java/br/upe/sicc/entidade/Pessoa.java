package br.upe.sicc.entidade;

import java.awt.Image;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public abstract class Pessoa {

    private Long id;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private String cidade;
    private String cidadeNatal;
    private String cep;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String telefone;
    private String telefone2;
    private String email;
    private EnumSexo sexo;
    private EnumEscolaridade escolaridade;
    private Image fotoPerfil;
    private Boolean administrador;
    private List<Evento> eventos;
    private List<LugarAlternativo> lugares;
    private String senha;

    public Pessoa(String cpf, String nome, Date dataNascimento, String cidade,
            String cidadeNatal, String cep, String endereco, int numero,
            String complemento, String bairro, String telefone,
            String telefone2, String email, EnumSexo sexo,
            EnumEscolaridade escolaridade, Image fotoPerfil,
            Boolean administrador, List<Evento> eventos,
            List<LugarAlternativo> lugares, String senha) {
        super();
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.cidadeNatal = cidadeNatal;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.telefone2 = telefone2;
        this.email = email;
        this.sexo = sexo;
        this.escolaridade = escolaridade;
        this.fotoPerfil = fotoPerfil;
        this.administrador = administrador;
        this.eventos = eventos;
        this.lugares = lugares;
        this.senha = senha;
    }

    public Pessoa() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(TemporalType.DATE)
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Enumerated(EnumType.STRING)
    public EnumSexo getSexo() {
        return sexo;
    }

    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    @Enumerated(EnumType.STRING)
    public EnumEscolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(EnumEscolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Image getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(Image fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    @OneToMany(mappedBy = "pessoaCriador")
    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @OneToMany(mappedBy = "profissionalResponsavel")
    public List<LugarAlternativo> getLugares() {
        return lugares;
    }

    public void setLugares(List<LugarAlternativo> lugares) {
        this.lugares = lugares;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cidade=" + cidade + ", cidadeNatal=" + cidadeNatal + ", cep=" + cep + ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", telefone=" + telefone + ", telefone2=" + telefone2 + ", email=" + email + ", sexo=" + sexo + ", escolaridade=" + escolaridade + ", fotoPerfil=" + fotoPerfil + ", administrador=" + administrador + ", eventos=" + eventos + ", lugares=" + lugares + ", senha=" + senha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 19 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
        hash = 19 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 19 * hash + (this.dataNascimento != null ? this.dataNascimento.hashCode() : 0);
        hash = 19 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
        hash = 19 * hash + (this.cidadeNatal != null ? this.cidadeNatal.hashCode() : 0);
        hash = 19 * hash + (this.cep != null ? this.cep.hashCode() : 0);
        hash = 19 * hash + (this.endereco != null ? this.endereco.hashCode() : 0);
        hash = 19 * hash + this.numero;
        hash = 19 * hash + (this.complemento != null ? this.complemento.hashCode() : 0);
        hash = 19 * hash + (this.bairro != null ? this.bairro.hashCode() : 0);
        hash = 19 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 19 * hash + (this.telefone2 != null ? this.telefone2.hashCode() : 0);
        hash = 19 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 19 * hash + (this.sexo != null ? this.sexo.hashCode() : 0);
        hash = 19 * hash + (this.escolaridade != null ? this.escolaridade.hashCode() : 0);
        hash = 19 * hash + (this.fotoPerfil != null ? this.fotoPerfil.hashCode() : 0);
        hash = 19 * hash + (this.administrador != null ? this.administrador.hashCode() : 0);
        hash = 19 * hash + (this.eventos != null ? this.eventos.hashCode() : 0);
        hash = 19 * hash + (this.lugares != null ? this.lugares.hashCode() : 0);
        hash = 19 * hash + (this.senha != null ? this.senha.hashCode() : 0);
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
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.cpf == null) ? (other.cpf != null) : !this.cpf.equals(other.cpf)) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.dataNascimento != other.dataNascimento && (this.dataNascimento == null || !this.dataNascimento.equals(other.dataNascimento))) {
            return false;
        }
        if ((this.cidade == null) ? (other.cidade != null) : !this.cidade.equals(other.cidade)) {
            return false;
        }
        if ((this.cidadeNatal == null) ? (other.cidadeNatal != null) : !this.cidadeNatal.equals(other.cidadeNatal)) {
            return false;
        }
        if ((this.cep == null) ? (other.cep != null) : !this.cep.equals(other.cep)) {
            return false;
        }
        if ((this.endereco == null) ? (other.endereco != null) : !this.endereco.equals(other.endereco)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.complemento == null) ? (other.complemento != null) : !this.complemento.equals(other.complemento)) {
            return false;
        }
        if ((this.bairro == null) ? (other.bairro != null) : !this.bairro.equals(other.bairro)) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if ((this.telefone2 == null) ? (other.telefone2 != null) : !this.telefone2.equals(other.telefone2)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.escolaridade != other.escolaridade) {
            return false;
        }
        if (this.fotoPerfil != other.fotoPerfil && (this.fotoPerfil == null || !this.fotoPerfil.equals(other.fotoPerfil))) {
            return false;
        }
        if (this.administrador != other.administrador && (this.administrador == null || !this.administrador.equals(other.administrador))) {
            return false;
        }
        if (this.eventos != other.eventos && (this.eventos == null || !this.eventos.equals(other.eventos))) {
            return false;
        }
        if (this.lugares != other.lugares && (this.lugares == null || !this.lugares.equals(other.lugares))) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        return true;
    }

}
