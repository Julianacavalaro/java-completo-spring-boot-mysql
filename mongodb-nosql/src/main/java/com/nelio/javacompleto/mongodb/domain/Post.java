package com.nelio.javacompleto.mongodb.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Documento MongoDB - Post de um blog
 */
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private Date data;
    private String titulo;
    private String corpo;

    public Post() {
    }

    public Post(String id, Date data, String titulo, String corpo) {
        this.id = id;
        this.data = data;
        this.titulo = titulo;
        this.corpo = corpo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", data=" + data +
                ", titulo='" + titulo + '\'' +
                ", corpo='" + corpo + '\'' +
                '}';
    }
}
