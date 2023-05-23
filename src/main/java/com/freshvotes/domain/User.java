package com.freshvotes.domain;

import jakarta.persistence.*;

@Entity
//if the table name left blank then it will keep the default value which is the current class name, here its User.
//the jakarta.persistence formerly known as java.persistence which keeps the program generic while the hibernate will make it tightly coupled.
@Table(name="Users")
public class User {
    private long id;
    private String username;
    private String password;
    private String name;

//    it is mandatory to create annotation for Id otherwise the JDBC will throw an error
//    the id should be an auto generated value and below is the annotation text which will create an incremented value by default. if left blank the snapshot will create a default value depending on its version.
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
public long getId() {
    return id;
}

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
