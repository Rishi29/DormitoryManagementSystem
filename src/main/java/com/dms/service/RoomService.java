package com.dms.service;

import com.dms.Dao.RoomDao;
import com.dms.model.Room;

import java.util.List;

/**
 * Created by Rishi on 8/5/2016.
 */
public interface RoomService {

//    List<Item>getAll();
//    void add(Item item);
//    void delete(long id);
//    Item findBy(long id);
//    void update(Item item);


    List<Room>getAll();
    void add (Room room);
    void delete(long id);
    void findBy(long id);
    void update(Room room);
}
