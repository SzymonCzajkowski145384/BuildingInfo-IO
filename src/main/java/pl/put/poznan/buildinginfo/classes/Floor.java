package pl.put.poznan.buildinginfo.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Floor extends abstract class "Location"
 *
 * @author Bartosz Cudzinski, Szymon Czajkowski
 * @version 0.5
 */

public class Floor extends Location {

    public List<Room> rooms;

    /**
     * Constructor of a Floor
     *
     * @param id param id is the id of the floor
     * @param name param name is the name of the floor
     */

    public Floor(int id, String name) {
        super(id, name);
        this.rooms = new ArrayList<>();
    }

    /**
     * This method computes sum of area
     *
     * @return return area of the floor
     */

    @Override
    public float getArea() {
        float suma = 0;
        for (int i=0; i < rooms.size(); i++){
            suma += rooms.get(i).getArea();
        }
        return suma;
    }

    /**
     * This method computes cube of the floor
     *
     * @return return value of cube
     */

    @Override
    public float getCube()
    {
        float cube = 0;
        for(int i = 0; i < rooms.size(); i++) {
            cube += rooms.get(i).getCube();
        }
        return cube;
    }

    /**
     * This method compute heat of the floor
     *
     * @return return value of heat
     */

    @Override
    public float getHeating() {
        float heat = 0;
        for(int i = 0; i < rooms.size(); i++) {
            heat += rooms.get(i).getHeating();
        }
        return heat;
    }

    /**
     * This method computes light of the floor
     *
     * @return return value of light
     */

    @Override
    public float getLight() {
        float suma = 0;
        for (int i=0; i < rooms.size(); i++){
            suma += rooms.get(i).getLight();
        }
        return suma;
    }
}
