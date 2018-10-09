package br.com.elderxavier.apivaleria.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "produto_tipo")
@EntityListeners(AuditingEntityListener.class)
public class ProdutoTipo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produto_tipo;
    @Column(name = "id_produto_tipo_pai")
    private int id_produto_tipo_pai;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "visivel")
    private int visivel;
    @Column(name = "deletado")
    private int deletado;    
    @Column(name = "criado", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date criado;
    @Column(name = "atualizado",nullable = false)    
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate    
    private Date atualizado;

    public Long getId_produto_tipo() {
        return id_produto_tipo;
    }

    public void setId_produto_tipo(Long id_produto_tipo) {
        this.id_produto_tipo = id_produto_tipo;
    }

    public int getId_produto_tipo_pai() {
        return id_produto_tipo_pai;
    }

    public void setId_produto_tipo_pai(int id_produto_tipo_pai) {
        this.id_produto_tipo_pai = id_produto_tipo_pai;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getVisivel() {
        return visivel;
    }

    public void setVisivel(int visivel) {
        this.visivel = visivel;
    }

    public int getDeletado() {
        return deletado;
    }

    public void setDeletado(int deletado) {
        this.deletado = deletado;
    }

    public Date getCriado() {
        return criado;
    }

    public void setCriado(Date criado) {
        this.criado = criado;
    }

    public Date getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(Date atualizado) {
        this.atualizado = atualizado;
    }
    

}
