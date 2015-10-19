package br.upe.sicc.entidade;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Grupo {
	
	private Long id;
	private String cpf;
	private String cnpj;
	private String nome;
	private String nomeFantasia;
	private String nomeResponsavel;
	private Date dataCriacao;
	private String descricao;
	private String cep;
	private String edereco;
	private int numero;
	private String complemento;
	private String bairro;
	private String telefone;
	private String telefone2;
	private String email;
	private String site;
	private EnumTipoGrupo tipo;
	private List<String> redes;
	private Image fotoPerfil;
	private ArrayList<Image> documentos;
	private List<Profissional> integrantes;
	private List<Evento> eventos;
	private List<LugarAlternativo> lugares;
        private String senha;
	
	public Grupo(String cpf, String cnpj, String nome, String nomeFantasia,
			String nomeResponsavel, Date dataCriacao, String descricao,
			String cep, String edereco, int numero, String complemento,
			String bairro, String telefone, String telefone2, String email,
			String site, EnumTipoGrupo tipo, List<String> redes,
			Image fotoPerfil, ArrayList<Image> documentos,
			List<Profissional> integrantes, List<Evento> eventos,
			List<LugarAlternativo> lugares, String senha) {
		super();
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.nomeResponsavel = nomeResponsavel;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
		this.cep = cep;
		this.edereco = edereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.email = email;
		this.site = site;
		this.tipo = tipo;
		this.redes = redes;
		this.fotoPerfil = fotoPerfil;
		this.documentos = documentos;
		this.integrantes = integrantes;
		this.eventos = eventos;
		this.lugares = lugares;
                this.senha = senha;
	}

	public Grupo() {
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
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	@Temporal(TemporalType.DATE)
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
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getEdereco() {
		return edereco;
	}
	
	public void setEdereco(String edereco) {
		this.edereco = edereco;
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
	
	@ManyToMany
	public List<Profissional> getIntegrantes() {
		return integrantes;
	}
	
	public void setIntegrantes(List<Profissional> integrantes) {
		this.integrantes = integrantes;
	}
	
	@OneToMany(mappedBy = "grupoCriador")
	public List<Evento> getEventos() {
		return eventos;
	}
	
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	@OneToMany(mappedBy = "grupoResponsavel")
	public List<LugarAlternativo> getLugares() {
		return lugares;
	}
	
	public void setLugares(List<LugarAlternativo> lugares) {
		this.lugares = lugares;
	}
	
	public Grupo(ArrayList<Image> documentos) {
		super();
		this.documentos = documentos;
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
        return "Grupo{" + "id=" + id + ", cpf=" + cpf + ", cnpj=" + cnpj + ", nome=" + nome + ", nomeFantasia=" + nomeFantasia + ", nomeResponsavel=" + nomeResponsavel + ", dataCriacao=" + dataCriacao + ", descricao=" + descricao + ", cep=" + cep + ", edereco=" + edereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", telefone=" + telefone + ", telefone2=" + telefone2 + ", email=" + email + ", site=" + site + ", tipo=" + tipo + ", redes=" + redes + ", fotoPerfil=" + fotoPerfil + ", documentos=" + documentos + ", integrantes=" + integrantes + ", eventos=" + eventos + ", lugares=" + lugares + ", senha=" + senha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 89 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);
        hash = 89 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
        hash = 89 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 89 * hash + (this.nomeFantasia != null ? this.nomeFantasia.hashCode() : 0);
        hash = 89 * hash + (this.nomeResponsavel != null ? this.nomeResponsavel.hashCode() : 0);
        hash = 89 * hash + (this.dataCriacao != null ? this.dataCriacao.hashCode() : 0);
        hash = 89 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 89 * hash + (this.cep != null ? this.cep.hashCode() : 0);
        hash = 89 * hash + (this.edereco != null ? this.edereco.hashCode() : 0);
        hash = 89 * hash + this.numero;
        hash = 89 * hash + (this.complemento != null ? this.complemento.hashCode() : 0);
        hash = 89 * hash + (this.bairro != null ? this.bairro.hashCode() : 0);
        hash = 89 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 89 * hash + (this.telefone2 != null ? this.telefone2.hashCode() : 0);
        hash = 89 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 89 * hash + (this.site != null ? this.site.hashCode() : 0);
        hash = 89 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        hash = 89 * hash + (this.redes != null ? this.redes.hashCode() : 0);
        hash = 89 * hash + (this.fotoPerfil != null ? this.fotoPerfil.hashCode() : 0);
        hash = 89 * hash + (this.documentos != null ? this.documentos.hashCode() : 0);
        hash = 89 * hash + (this.integrantes != null ? this.integrantes.hashCode() : 0);
        hash = 89 * hash + (this.eventos != null ? this.eventos.hashCode() : 0);
        hash = 89 * hash + (this.lugares != null ? this.lugares.hashCode() : 0);
        hash = 89 * hash + (this.senha != null ? this.senha.hashCode() : 0);
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
        final Grupo other = (Grupo) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.cpf == null) ? (other.cpf != null) : !this.cpf.equals(other.cpf)) {
            return false;
        }
        if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
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
        if ((this.cep == null) ? (other.cep != null) : !this.cep.equals(other.cep)) {
            return false;
        }
        if ((this.edereco == null) ? (other.edereco != null) : !this.edereco.equals(other.edereco)) {
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
        if (this.integrantes != other.integrantes && (this.integrantes == null || !this.integrantes.equals(other.integrantes))) {
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
