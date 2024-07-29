package com.pt.jpa.model;

import jakarta.persistence.*;

@Entity
public class Fone {

    /**
     * Uma persona pode ter varios telefones
     * Neste exemplo, a tabela Fone terá uma coluna chamada person_id
     * Nexte exemplo: (@JoinColumn(name = "person_id") esta fracamente acoplado, pois posso criar um fone sem uma pessoa
     * @JoinColumn(name = "person_id", nullable = false) -> não posso criar um fone sem uma pessoa
     */

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Fone() {
    }

    public Fone(String number, Person person) {
        this.number = number;

    }

    public String getNumber() {
        return number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Fone{" +
                "number='" + number + '\'' +
                '}';

    }
}
