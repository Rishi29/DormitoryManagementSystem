package com.dms.service.impl;

import com.dms.Dao.ItemDao;

import com.dms.model.Item;
import com.dms.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Rishi on 8/4/2016.
 */
@Service
public class ItemServiceImpl  implements ItemService{

   @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> getAll(){
        return itemDao.findAllByOrderByIdAsc();
    }

    @Override
    public void add(Item item) {
        itemDao.save(item);
    }

    @Override
    public void delete(long id) {
        itemDao.delete(id);

    }

    @Override
    public Item findBy(long id) {
        return itemDao.findOne(id);
    }

    @Override
    public void update(Item item) {
        itemDao.save(item);

    }

}
