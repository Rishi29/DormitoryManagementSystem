package com.dms.model;

import com.dms.Enums.RoomType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rishi on 7/29/2016.
 */
@Entity
public class Room {

    @Id
    @GeneratedValue
    private long id;
    private long roomNo;
    private String description;


   @Enumerated(EnumType.STRING)
   private RoomType type;

    @ManyToOne(fetch=FetchType.LAZY)
    private Building building;
   @OneToMany(cascade = CascadeType.PERSIST)
   private  List<Item> itemList = new ArrayList<>();




    public Room() {
    }

    public Room(long id, long roomNo, String description) {
        this.id = id;
        this.roomNo = roomNo;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(long roomNo) {
        this.roomNo = roomNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList){
        this.itemList= itemList;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

}
