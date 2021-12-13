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
