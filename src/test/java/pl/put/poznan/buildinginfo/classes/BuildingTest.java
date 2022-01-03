package pl.put.poznan.buildinginfo.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    private Building building;
    private Room[] roomArrey;
    private Floor[] floorArrey;

    @BeforeEach
    public void setUp(){
        building = new Building(123,"building");

        roomArrey = new Room[6];
        floorArrey = new Floor[3];

        for (int i = 0 ; i<3 ; i++){
            floorArrey[i] = new Floor(i,String.valueOf(i));
        }

        for (int i = 0 ; i<6 ; i++){
            floorArrey[i%3].rooms.add(new Room(i,String.valueOf(i),i,i,i,i));
        }

        for (int i =0; i <3 ; i++) {
            building.floors.add(floorArrey[i]);
        }
    }


    @Test
    void testGetArea() {
        assertEquals(15,building.getArea(),"testGetArea");

    }

    @Test
    void testGetCube() {
        assertEquals(15,building.getCube(),"testGetCube");
    }

    @Test
    void testGetHeating() {
        assertEquals(15,building.getHeating(),"testGetHeating");
    }

    @Test
    void testGetLight() {
        assertEquals(15,building.getLight(),"testGetLight");
    }
}