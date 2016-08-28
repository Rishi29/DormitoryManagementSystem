package com.dms.service;

import com.dms.model.Building;

import java.util.List;

/**
 * Created by Rishi on 7/31/2016.
 */
public interface BuildingService {
    List<Building>getAll();
    void add(Building building);
    void delete(long id);
    Building findBy(long id);
    void update(Building building);

}
