package pl.put.poznan.buildinginfo.classes;

import java.util.ArrayList;
import java.util.List;

public class Floor extends Location {

    public List<Room> rooms;

    public Floor(int id, String name) {
        super(id, name);
        this.rooms = new ArrayList<>();
    }

    @Override
    public float getArea() {
        float suma = 0;
        for (int i=0; i < rooms.size(); i++){
            suma += rooms.get(i).getArea();
        }
        return suma;
    }

    @Override
    public float getCube()
    {
        float cube = 0;
        for(int i = 0; i < rooms.size(); i++) {
            cube += rooms.get(i).getCube();
        }
        return cube;
    }

    @Override
    public float getHeating() {
        float heat = 0;
        for(int i = 0; i < rooms.size(); i++) {
            heat += rooms.get(i).getHeating();
        }
        return heat;
    }

    @Override
    public float getLight() {
        float suma = 0;
        for (int i=0; i < rooms.size(); i++){
            suma += rooms.get(i).getLight();
        }
        return suma;
    }
}
