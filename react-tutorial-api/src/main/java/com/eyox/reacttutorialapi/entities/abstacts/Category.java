package com.eyox.reacttutorialapi.entities.abstacts;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "categories")


public class Category {

    @Id
    @Column(name = "category_id")
    private int id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private int description;



}
