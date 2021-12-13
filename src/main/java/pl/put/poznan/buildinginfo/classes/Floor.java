package pl.put.poznan.buildinginfo.classes;

import java.util.ArrayList;
import java.util.List;

public class Floor extends Location {

    public List<Room> rooms;

    public Floor(int id, String name) {
        super(id, name);
        this.rooms = new ArrayList<>();
    }

    public float getArea() {
        return 1;
    }


    public float getCube() {
        return 1;
    }


    public float getHeating() {
        return 1;
    }


    public float getLight() {
        return 1;
    }
}
