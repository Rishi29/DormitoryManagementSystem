package com.dms.service.impl;

import com.dms.Dao.RoomDao;
import com.dms.model.Room;
import com.dms.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rishi on 8/5/2016.
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    public List<Room> getAll() {
        return roomDao.findAllByOrderByIdAsc();
    }

    @Override
    public void add(Room room) {

        roomDao.save(room);

    }

    @Override
    public void delete(long id) {
        roomDao.delete(id);

    }

    @Override
    public void findBy(long id) {
        roomDao.findOne(id);
    }

    @Override
    public void update(Room room) {
        roomDao.save(room);
    }
}
