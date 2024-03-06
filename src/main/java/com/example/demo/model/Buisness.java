package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="buisness")
public class Buisness {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
