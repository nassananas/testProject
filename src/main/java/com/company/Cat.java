package com.company;

import javax.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "color")
    private String color;

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public Cat() {
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

}