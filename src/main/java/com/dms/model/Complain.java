package com.dms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Rishi on 7/30/2016.
 */
@Entity
public class Complain {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;

}
