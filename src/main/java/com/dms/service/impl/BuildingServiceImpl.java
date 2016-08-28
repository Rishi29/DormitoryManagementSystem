package com.dms.service.impl;

import com.dms.Dao.BuildingDao;
import com.dms.model.Building;
import com.dms.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rishi on 7/31/2016.
 */
@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingDao buildingDao;

    @Override
    public List<Building> getAll(){
        return buildingDao.findAllByOrderByIdAsc();
    }

    @Override
    public void add(Building building){


        buildingDao.save(building);
    }
    @Override
    public void delete(long id){
        buildingDao.delete(id);
    }
    @Override
    public Building findBy(long id){
        return buildingDao.findOne(id);
    }
    @Override
    public void update(Building building){
        buildingDao.save(building);
    }





}
