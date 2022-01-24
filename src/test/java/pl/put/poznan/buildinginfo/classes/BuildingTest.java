package pl.put.poznan.buildinginfo.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is building testing class.
 *
 * @author Igor Czudy
 * @version 0.5
 */
class BuildingTest {

    private Building building;
    private Building building2;
    private Floor[] floorArrey;
    private Floor[] floorArrey2;
    /**
     * This method is setUp method. It runs before each test.
     *
     */
    @BeforeEach
    public void setUp(){
        building = new Building(123,"building");
        building2 = new Building(997,"building2");


        floorArrey = new Floor[3];
        floorArrey2 = new Floor[3];

        for (int i = 0 ; i<3 ; i++){
            floorArrey2[i] = new Floor(i,String.valueOf(i*i));
            floorArrey[i] = new Floor(i,String.valueOf(i));
        }

        for (int i = 0 ; i<6 ; i++){
            floorArrey2[i%3].rooms.add(new Room(i,String.valueOf(i),i*i,i*i,i*i,i*i));
            floorArrey[i%3].rooms.add(new Room(i,String.valueOf(i),i,i,i,i));
        }

        for (int i =0; i <3 ; i++) {
            building.floors.add(floorArrey[i]);
            building2.floors.add(floorArrey2[i]);
        }
    }

    /**
     * This method tests building.getArea.
     *
     */
    @Test
    void testGetArea() {
        assertEquals(15,building.getArea(),"testGetArea");

    }
    @Test
    void testGetArea2() {
        assertEquals(55,building2.getArea(),"testGetArea");

    }

    /**
     * This method tests building.GetCube.
     *
     */
    @Test
    void testGetCube() {
        assertEquals(15,building.getCube(),"testGetCube");
    }
    @Test
    void testGetCube2() {
        assertEquals(55,building2.getCube(),"testGetCube");
    }

    /**
     * This method tests building.GetHeating
     *
     */
    @Test
    void testGetHeating() {
        assertEquals(15,building.getHeating(),"testGetHeating");
    }
    @Test
    void testGetHeating2() {
        assertEquals(55,building2.getHeating(),"testGetHeating");
    }

    /**
     * This method tests building.GetLight.
     *
     */
    @Test
    void testGetLight() {
        assertEquals(15,building.getLight(),"testGetLight");
    }
    @Test
    void testGetLight2() {
        assertEquals(55,building2.getLight(),"testGetLight");
    }
}