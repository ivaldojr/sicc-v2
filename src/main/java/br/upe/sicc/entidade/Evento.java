package br.upe.sicc.entidade;

import br.upe.sicc.entidade.Grupo;
import java.awt.Image;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Evento {

    private Long id;
    private String nome;
    private String descricao;
    private Date dia;
    private Date hora;
    private Lugar local;
    private Image foto;
    private EnumTipoEvento tipo;
    private Pessoa pessoaCriador;
    private Grupo grupoCriador;
    private Equipamento equipamentoCriador;

    public Evento(Long id, String nome, String descricao, Date dia, Date hora,
            Lugar local, Image foto, EnumTipoEvento tipo,
            Pessoa pessoaCriador, Grupo grupoCriador,
            Equipamento equipamentoCriador) {
        super();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dia = dia;
        this.hora = hora;
        this.local = local;
        this.foto = foto;
        this.tipo = tipo;
        this.pessoaCriador = pessoaCriador;
        this.grupoCriador = grupoCriador;
        this.equipamentoCriador = equipamentoCriador;
    }

    public Evento() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Temporal(TemporalType.DATE)
    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    @Temporal(TemporalType.TIME)
    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @ManyToOne
    public Lugar getLocal() {
        return local;
    }

    public void setLocal(Lugar local) {
        this.local = local;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    @Enumerated(EnumType.STRING)
    public EnumTipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoEvento tipo) {
        this.tipo = tipo;
    }

    @ManyToOne
    public Pessoa getPessoaCriador() {
        return pessoaCriador;
    }

    public void setPessoaCriador(Pessoa pessoaCriador) {
        this.pessoaCriador = pessoaCriador;
    }

    @ManyToOne
    public Grupo getGrupoCriador() {
        return grupoCriador;
    }

    public void setGrupoCriador(Grupo grupoCriador) {
        this.grupoCriador = grupoCriador;
    }

    @ManyToOne
    public Equipamento geteEquipamentoCriador() {
        return equipamentoCriador;
    }

    public void setEquipamentoCriador(Equipamento equipamentoCriador) {
        this.equipamentoCriador = equipamentoCriador;
    }

}
