package pl.put.poznan.buildinginfo.classes;

/**
 * Class Room extends abstract class Location
 *
 * @author Bartosz Cudziński, Szymon Czajkowski
 * @version 0.5
 */

public class Room extends Location {
    private float area;
    private float cube;
    private float heating;
    private float light;

    /**
     * Constructor of a Room
     *
     * @param id id of Room
     * @param name name of Room
     * @param area area of Room
     * @param cube cubature of Room
     * @param heating heating of Room
     * @param light light of Room
     */

    public Room(int id, String name, float area, float cube, float heating, float light) {
        super(id, name);
        this.area = area;
        this.cube = cube;
        this.heating = heating;
        this.light = light;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public float getCube() {
        return cube;
    }

    @Override
    public float getHeating() {
        return heating;
    }

    @Override
    public float getLight() {
        return light;
    }

}
