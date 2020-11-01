package com.example.JPAdemo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name = "Find_All_People", query = "select p from person p")
public class person{

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;

    @Column(name = "JOINDATE")
    private Date joinDate;

    public person(int id, String name, String description, Date joinDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.joinDate = joinDate;
    }

    public person(String name, String description, Date joinDate) {
        this.name = name;
        this.description = description;
        this.joinDate = joinDate;
    }

    public person() {
    }

    @Override
    public String toString() {
        return "\nperson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }

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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}