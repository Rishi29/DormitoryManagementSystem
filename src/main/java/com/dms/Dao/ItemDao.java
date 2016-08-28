package com.dms.Dao;


import com.dms.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Rishi on 8/4/2016.
 */
public interface ItemDao extends JpaRepository<Item, Long> {

    List<Item> findAllByOrderByIdAsc();

}
