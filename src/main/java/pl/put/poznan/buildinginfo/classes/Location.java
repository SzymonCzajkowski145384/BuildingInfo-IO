package pl.put.poznan.buildinginfo.classes;

/**
 * This is abstract class. Classes Floor, Building, Rooom extend from them.
 *
 * @author Bartosz Cudzinski, Szymon Czajkowski
 * @version 0.5
 */

public abstract class Location {

    private int id;
    private String name;

    /**
     * Abstract constructor of a Location
     *
     * @param id param id is the id of the Location
     * @param name param name is the name of the Location
     */
    public Location(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * This method return the Id of Location
     *
     * @return return Id of Location
     */
    public int getId() {
        return id;
    }

    /**
     * This method set the Id of Location
     *
     * @param id param id is the id of the Location
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method return the name of Location
     *
     * @return return name of Location
     */
    public String getName() {
        return name;
    }

    /**
     * This method set the name of Location
     *
     * @param name param name is the name of the Location
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method return the Area of Location. The method is override by extending classes.
     *
     * @return return area of Location
     */
    public float getArea() {
        return 1;
    }

    /**
     * This method return the Area of Location. The method is override by extending classes.
     *
     * @return return area of Location
     */
    public float getCube() {
        return 1;
    }

    /**
     * This method return the cube of Location. The method is override by extending classes.
     *
     * @return return cube of Location
     */
    public float getHeating() {
        return 1;
    }

    /**
     * This method return the light of Location. The method is override by extending classes.
     *
     * @return return light of Location
     */
    public float getLight() {
        return 1;
    }
}
