package com.dms.Dao;

import com.dms.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Rishi on 7/31/2016.
 */
public interface BuildingDao extends JpaRepository<Building,Long> {
    List<Building> findAllByOrderByIdAsc();

}
