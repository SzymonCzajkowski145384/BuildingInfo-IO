package pl.put.poznan.buildinginfo.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Building extends abstract class "Location"
 *
 * @author Bartosz Cudzinski, Szymon Czajkowski
 * @version 0.5
 */

public class Building extends Location {

    public List<Floor> floors;

    /**
     * Constructor of a Building
     *
     * @param id param id is the id of the building
     * @param name param name is the name of the building
     */

    public Building(int id, String name) {
        super(id, name);
        this.floors = new ArrayList<>();
    }

    /**
     * This method computes sum of area
     *
     * @return return sum of area
     */

    @Override
    public float getArea() {
        float suma = 0;
        for (int i=0; i < floors.size(); i++){
            suma += floors.get(i).getArea();
        }
        return suma;
    }

    /**
     * This method computes cube
     *
     * @return return value of cube
     */

    @Override
    public float getCube()
    {
        float cube = 0;
        for(int i = 0; i < floors.size(); i++) {
            cube += floors.get(i).getCube();
        }
        return cube;
    }

    /**
     * This method compute heat
     *
     * @return return value of heat
     */

    @Override
    public float getHeating() {
        float heat = 0;
        for(int i = 0; i < floors.size(); i++) {
            heat += floors.get(i).getHeating();
        }
        return heat;
    }

    /**
     * This method computes light
     *
     * @return return value of light
     */

    @Override
    public float getLight() {
        float suma = 0;
        for (int i=0; i < floors.size(); i++){
            suma += floors.get(i).getLight();
        }
        return suma;
    }
}
