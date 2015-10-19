package br.upe.sicc.entidade;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

@Entity
public class Equipamento extends Lugar {

    private String cpf;
    private String cnpj;
    private String nomeFantasia;
    private String nomeResponsavel;
    private Date dataCriacao;
    private String descricao;
    private String telefone;
    private String telefone2;
    private String email;
    private String site;
    private EnumTipoGrupo tipo;
    private List<String> redes;
    private Image fotoPerfil;
    private ArrayList<Image> documentos;
    private List<Evento> eventosDoEquipamento;
    private String senha;

    public Equipamento(String nome, String cep, String edereco, int numero,
            String complemento, String bairro, List<Evento> eventos,
            String cpf, String cnpj, String nomeFantasia,
            String nomeResponsavel, Date dataCriacao, String descricao,
            String telefone, String telefone2, String email, String site,
            EnumTipoGrupo tipo, List<String> redes, Image fotoPerfil,
            ArrayList<Image> documentos, List<Evento> eventosDoEquipamento, String senha) {
        super(nome, cep, edereco, numero, complemento, bairro, eventos);
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.nomeResponsavel = nomeResponsavel;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.telefone = telefone;
        this.telefone2 = telefone2;
        this.email = email;
        this.site = site;
        this.tipo = tipo;
        this.redes = redes;
        this.fotoPerfil = fotoPerfil;
        this.documentos = documentos;
        this.eventosDoEquipamento = eventosDoEquipamento;
        this.senha = senha;
    }

    public Equipamento() {
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Enumerated(EnumType.STRING)
    public EnumTipoGrupo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoGrupo tipo) {
        this.tipo = tipo;
    }

    public List<String> getRedes() {
        return redes;
    }

    public void setRedes(List<String> redes) {
        this.redes = redes;
    }

    public Image getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(Image fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    @OneToMany(mappedBy = "equipamentoCriador")
    public List<Evento> getEventosDoEquipamento() {
        return eventosDoEquipamento;
    }

    public void setEventosDoEquipamento(List<Evento> eventosDoEquipamento) {
        this.eventosDoEquipamento = eventosDoEquipamento;
    }

    public ArrayList<Image> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Image> documentos) {
        this.documentos = documentos;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "cpf=" + cpf + ", cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", nomeResponsavel=" + nomeResponsavel + ", dataCriacao=" + dataCriacao + ", descricao=" + descricao + ", telefone=" + telefone + ", telefone2=" + telefone2 + ", email=" + email + ", site=" + site + ", tipo=" + tipo + ", redes=" + redes + ", fotoPerfil=" + fotoPerfil + ", documentos=" + documentos + ", eventosDoEquipamento=" + eventosDoEquipamento + ", senha=" + senha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
        hash = 97 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
        hash = 97 * hash + (this.nomeFantasia != null ? this.nomeFantasia.hashCode() : 0);
        hash = 97 * hash + (this.nomeResponsavel != null ? this.nomeResponsavel.hashCode() : 0);
        hash = 97 * hash + (this.dataCriacao != null ? this.dataCriacao.hashCode() : 0);
        hash = 97 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 97 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 97 * hash + (this.telefone2 != null ? this.telefone2.hashCode() : 0);
        hash = 97 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 97 * hash + (this.site != null ? this.site.hashCode() : 0);
        hash = 97 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        hash = 97 * hash + (this.redes != null ? this.redes.hashCode() : 0);
        hash = 97 * hash + (this.fotoPerfil != null ? this.fotoPerfil.hashCode() : 0);
        hash = 97 * hash + (this.documentos != null ? this.documentos.hashCode() : 0);
        hash = 97 * hash + (this.eventosDoEquipamento != null ? this.eventosDoEquipamento.hashCode() : 0);
        hash = 97 * hash + (this.senha != null ? this.senha.hashCode() : 0);
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
        final Equipamento other = (Equipamento) obj;
        if ((this.cpf == null) ? (other.cpf != null) : !this.cpf.equals(other.cpf)) {
            return false;
        }
        if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
            return false;
        }
        if ((this.nomeFantasia == null) ? (other.nomeFantasia != null) : !this.nomeFantasia.equals(other.nomeFantasia)) {
            return false;
        }
        if ((this.nomeResponsavel == null) ? (other.nomeResponsavel != null) : !this.nomeResponsavel.equals(other.nomeResponsavel)) {
            return false;
        }
        if (this.dataCriacao != other.dataCriacao && (this.dataCriacao == null || !this.dataCriacao.equals(other.dataCriacao))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
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
        if ((this.site == null) ? (other.site != null) : !this.site.equals(other.site)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (this.redes != other.redes && (this.redes == null || !this.redes.equals(other.redes))) {
            return false;
        }
        if (this.fotoPerfil != other.fotoPerfil && (this.fotoPerfil == null || !this.fotoPerfil.equals(other.fotoPerfil))) {
            return false;
        }
        if (this.documentos != other.documentos && (this.documentos == null || !this.documentos.equals(other.documentos))) {
            return false;
        }
        if (this.eventosDoEquipamento != other.eventosDoEquipamento && (this.eventosDoEquipamento == null || !this.eventosDoEquipamento.equals(other.eventosDoEquipamento))) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        return true;
    }

}
