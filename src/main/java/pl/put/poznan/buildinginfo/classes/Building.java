package pl.put.poznan.buildinginfo.classes;

import java.util.ArrayList;
import java.util.List;

public class Building extends Location {

    public List<Floor> floors;

    public Building(int id, String name) {
        super(id, name);
        this.floors = new ArrayList<>();
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
