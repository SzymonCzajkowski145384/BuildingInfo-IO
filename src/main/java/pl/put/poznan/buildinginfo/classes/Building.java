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
    public float getCube()
    {
        float cube = 0;
        for(int i = 0; i < floors.size(); i++) {
            cube += floors.get(i).getCube();
        }
        return cube;
    }

    @Override
    public float getHeating() {
        float heat = 0;
        for(int i = 0; i < floors.size(); i++) {
            heat += floors.get(i).getHeating();
        }
        return heat;
    }

    @Override
    public float getLight() {
        float suma = 0;
        for (int i=0; i < floors.size(); i++){
            suma += floors.get(i).getLight();
        }
        return suma;
    }
}
