package pl.put.poznan.buildinginfo.logic;

import pl.put.poznan.buildinginfo.classes.Building;
import pl.put.poznan.buildinginfo.classes.Floor;
import pl.put.poznan.buildinginfo.classes.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class BuildingTransformer {

    public List<Building> buildings = new ArrayList<>();


    public BuildingTransformer() {
        /*
        //Przykładowy bydynek
        Building B1 = new Building(1,"A");
        Floor F11 = new Floor(1,"A");
        Room R111 = new Room(1, "a",100,20,10,5);
        Room R112 = new Room(2, "a",60,20,10,5);
        F11.rooms.add(R111);
        F11.rooms.add(R112);
        B1.floors.add(F11);
        B1.addFloor(F11);
        Floor F12 = new Floor(2,"B");
        Room R121 = new Room(1, "b",100,20,10,5);
        Room R122 = new Room(2, "b",60,20,10,5);
        F12.rooms.add(R121);
        F12.rooms.add(R122);
        B1.floors.add(F12);

        buildings.add(B1);
        */
    }

    public List<Building> getAllBuildings() {
        return buildings;
    }

    public void addBuildings(List<Building> newBuildings) {
        for (int i=0; i < newBuildings.size(); i++){
            buildings.add(newBuildings.get(i));
        }
    }

    public void deleteAllBuildings() {
        buildings = new ArrayList<>();
    }

}
