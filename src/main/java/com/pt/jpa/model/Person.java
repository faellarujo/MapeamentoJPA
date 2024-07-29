package com.pt.jpa.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    /**
     * mappedBy = "person" -> indica que a classe person já esta sendo mapeada na classe Fone     *
     */

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;


    @OneToMany(mappedBy = "person")
    private List<Fone> fone = new ArrayList<>();

    public Person() {
    }

    public Person(String name, List<Fone> fone) {
        this.name = name;
        this.fone = fone;
    }

    public String getName() {
        return name;
    }


    public List<Fone> getFone() {
        return fone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fone=" + fone +
                '}';
    }
}
