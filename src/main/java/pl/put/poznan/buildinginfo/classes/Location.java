package pl.put.poznan.buildinginfo.classes;

public abstract class Location {

    private int id;
    private String name;

    public Location(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
