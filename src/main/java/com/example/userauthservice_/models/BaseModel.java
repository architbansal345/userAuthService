package com.example.userauthservice_.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date creationDate;
    private Date modificationDate;
    private Status status;
    public BaseModel() {
        this.creationDate = new Date();
        this.modificationDate = new Date();
        this.status = Status.ACTIVE;
    }
}
