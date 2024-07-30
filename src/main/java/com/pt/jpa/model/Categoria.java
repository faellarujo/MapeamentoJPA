package com.pt.jpa.model;


import jakarta.persistence.*;

@Entity
public class Categoria {

    /**
     * No relacionamento OneToOne, um item pode pertencer a apenas um outro item, é uma ligação um para um. Isso significa que cada linha de uma entidade se refere a apenas uma linha de outra entidade.
     * Vamos considerar o exemplo acima. Blog e Categoria de forma unidirecional reversa, a relação é uma relação OneToOne.
     * Isso significa que cada blog pertence a apenas uma categoria.
     * A anotação para mapear uma única entidade para uma única outra entidade é @OneToOne.
     *
     * */

    //

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String descricao;

    @OneToOne
    @JoinColumn(name = "blog_id", nullable = true)
    private Blog blog;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.descricao = nome;
    }

    public String getNome() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + descricao + '\'' +
                '}';
    }
}
