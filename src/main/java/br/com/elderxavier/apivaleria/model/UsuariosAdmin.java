/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elderxavier.apivaleria.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.TemporalType;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "usuarios_admin")
@EntityListeners(AuditingEntityListener.class)
public class UsuariosAdmin implements Serializable{    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_usuarios_admin;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "token")
    private String token;
    @Column(name = "tipo")
    private int tipo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "foto")
    private String foto;
    @Column(name = "visivel")
    private int visivel;
    @Column(name = "deletado")
    private int deletado;
    @Column(name = "criado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date criado;
    @Column(name = "atualizado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizado;
    
    
    public int getId_usuarios_admin() {
        return id_usuarios_admin;
    }

    public void setId_usuarios_admin(int id_usuarios_admin) {
        this.id_usuarios_admin = id_usuarios_admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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
    
   
    @Override
    public String toString() {
        return  "id_usuarios_admin : " + String.valueOf(getId_usuarios_admin()) +
        " | email: " + getEmail() +
        " | senha: " + getSenha() +
        " | token: " + getToken() + 
        " | tipo: " + String.valueOf(getTipo()) + 
        " | nome: " + getNome() +
        " | foto: " + getFoto() +
        " | visivel: " +  String.valueOf(getVisivel()) +
        " | deletado: " +  String.valueOf(getDeletado()) +
        " | criado: " +  String.valueOf(getCriado()) +
        " | atualizado: " +  String.valueOf(getAtualizado()) +
        "";
    }
    
}
