package pl.put.poznan.buildinginfo.classes;

import java.util.ArrayList;
import java.util.List;

public class Building extends Location {

    public List<Floor> floors;

    public Building(int id, String name) {
        super(id, name);
        this.floors = new ArrayList<>();
    }

    @Override
    public float getArea() {
        float suma = 0;
        for (int i=0; i < floors.size(); i++){
            suma += floors.get(i).getArea();
        }
        return suma;
    }

    @Override
    public float getCube() {
        return 1;
    }

    @Override
    public float getHeating() {
        return 1;
    }

    @Override
    public float getLight() {
        return 1;
    }
}
