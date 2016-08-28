package com.dms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Created by Rishi on 7/29/2016.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Lob
    private String description;

    public Item() {
    }

    public Item( String name, String description) {

        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
