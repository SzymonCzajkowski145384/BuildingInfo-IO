package pl.put.poznan.buildinginfo.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is floor testing class.
 *
 * @author Igor Czudy
 * @version 0.5
 */
class FloorTest {

    private Floor floor;
    private Room room1,room2,room3;
    /**
     * This method is setUp method. It runs before each test.
     *
     */
    @BeforeEach
    public void setUp()  {
        room1 = new Room(123,"room",1,1,1,1);
        room2 = new Room(123,"room",2,2,2,2);
        room3 = new Room(123,"room",3,3,3,3);

        floor = new Floor(123,"floor");
        floor.rooms.add(room1);
        floor.rooms.add(room2);
        floor.rooms.add(room3);
    }

    /**
     * This method tests floor.getCube.
     *
     */
    @Test
    public void testFloorGetCube(){
        assertEquals(6,floor.getCube(),"testFloorGetCube");

    }

    /**
     * This method tests floor.getHeating.
     *
     */
    @Test
    public void testFloorGetHeating(){
        assertEquals(6,floor.getHeating(),"testFloorGetHeaing");

    }

    /**
     * This method tests floor.getArea.
     *
     */
    @Test
    public void testFloorGetArea(){
        assertEquals(6,floor.getArea(),"testFloorGetArea");

    }

    /**
     * This method tests floor.getLight.
     *
     */
    @Test
    public void testFloorGetLight(){
        assertEquals(6,floor.getLight(),"testFloorGetLight");

    }

}