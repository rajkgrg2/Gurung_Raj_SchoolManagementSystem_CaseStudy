package com.school.management.entity;

import javax.persistence.*;
import java.util.Set;

@Entity

@Table(name = "classs")
public class Classs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "classs_name" )//nullable = false)
    private String classs_name;

    @Column(name = "description" )//nullable = false)
    private String description;
    @ManyToMany(cascade=CascadeType.ALL, mappedBy = "classses")
    private Set<User> users;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClass_name() {
        return classs_name;
    }

    public void setClass_name(String class_name) {
        this.classs_name = classs_name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
