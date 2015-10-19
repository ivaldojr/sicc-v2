package br.upe.sicc.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public abstract class Lugar {

    private Long id;
    private String nome;
    private String cep;
    private String edereco;
    private int numero;
    private String complemento;
    private String bairro;
    private List<Evento> eventos;

    public Lugar(String nome, String cep, String edereco, int numero,
            String complemento, String bairro, List<Evento> eventos) {
        super();
        this.nome = nome;
        this.cep = cep;
        this.edereco = edereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.eventos = eventos;
    }

    public Lugar() {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @OneToMany(mappedBy = "local")
    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Lugar [id=" + id + ", nome=" + nome + ", cep=" + cep
                + ", edereco=" + edereco + ", numero=" + numero
                + ", complemento=" + complemento + ", bairro=" + bairro
                + ", eventos=" + eventos + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result
                + ((complemento == null) ? 0 : complemento.hashCode());
        result = prime * result + ((edereco == null) ? 0 : edereco.hashCode());
        result = prime * result + ((eventos == null) ? 0 : eventos.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Lugar other = (Lugar) obj;
        if (bairro == null) {
            if (other.bairro != null) {
                return false;
            }
        } else if (!bairro.equals(other.bairro)) {
            return false;
        }
        if (cep == null) {
            if (other.cep != null) {
                return false;
            }
        } else if (!cep.equals(other.cep)) {
            return false;
        }
        if (complemento == null) {
            if (other.complemento != null) {
                return false;
            }
        } else if (!complemento.equals(other.complemento)) {
            return false;
        }
        if (edereco == null) {
            if (other.edereco != null) {
                return false;
            }
        } else if (!edereco.equals(other.edereco)) {
            return false;
        }
        if (eventos == null) {
            if (other.eventos != null) {
                return false;
            }
        } else if (!eventos.equals(other.eventos)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        if (numero != other.numero) {
            return false;
        }
        return true;
    }
}
