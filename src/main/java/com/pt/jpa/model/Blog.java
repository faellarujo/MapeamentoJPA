package com.pt.jpa.model;

import jakarta.persistence.*;

@Entity
public class Blog {


    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "conteudo", nullable = false)
    private String conteudo;

    @OneToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public Blog() {
    }

    public Blog(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }

}
