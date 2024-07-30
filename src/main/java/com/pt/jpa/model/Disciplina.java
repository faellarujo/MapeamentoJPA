package com.pt.jpa.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "disciplinas")
public class Disciplina {

    // nome, semestre, aluno

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer semestre;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno", // nome da tabela de juncão do relacionamento
            joinColumns = @JoinColumn(name = "disciplina_id"), // nome da coluna que referencia a tabela atual
            inverseJoinColumns = @JoinColumn(name = "aluno_id")) // nome da coluna que referencia a outra tabela
    private Set<Aluno> aluno; // Set me garante valores não repetidos, diferente de List

    public Disciplina() {
    }

    public Disciplina(String nome, Integer semestre, Set<Aluno> aluno) {
        this.nome = nome;
        this.semestre = semestre;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public Set<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(Set<Aluno> aluno) {
        this.aluno = aluno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", semestre=" + semestre +
                ", aluno=" + aluno +
                '}';
    }




}
