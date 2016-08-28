package com.dms.Dao;

import com.dms.model.Room;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Rishi on 8/5/2016.
 */

public interface RoomDao extends JpaRepository<Room,Long> {
    List<Room> findAllByOrderByIdAsc();

}
