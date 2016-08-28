package com.dms.service;


import com.dms.model.Item;

import java.util.List;

/**
 * Created by Rishi on 8/4/2016.
 */
public interface ItemService {

//    List<Building>getAll();
//    void add(Building building);
//    void delete(long id);
//    Building findBy(long id);
//    void update(Building building);


    List<Item>getAll();
    void add(Item item);
    void delete(long id);
    Item findBy(long id);
    void update(Item item);



}
