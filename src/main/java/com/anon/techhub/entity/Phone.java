package com.anon.techhub.entity;

import jakarta.persistence.*;


@Entity()
@Table(name="phones")
public class Phone {
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(){

    }

    public Phone(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }



    @Column(name = "price")
    public int price;
}
