package com.dms.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rishi on 7/30/2016.
 */
@Entity
public class Building {
    @Id@GeneratedValue
    private long id;
    private long buildingNo;
    private String buildingName;
    private String buildingAddress;
    @OneToMany(cascade= CascadeType.PERSIST)
    @JoinColumn(name="building_id")
    private final List<Room> roomList=new ArrayList<>();

    public Building() {
    }

    public Building(long buildingNo, String buildingName, String buildingAddress) {
        this.buildingNo = buildingNo;
        this.buildingName = buildingName;
        this.buildingAddress = buildingAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(long buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

   // public void setRoomList(List<Room>){

   // }
}
