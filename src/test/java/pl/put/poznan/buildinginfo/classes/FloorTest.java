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


    private Floor floor2;
    private Room room4,room5,room6;
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

        room4 = new Room(997,"room",10,10,1,99);
        room5 = new Room(997,"room",20,20,2,99);
        room6 = new Room(997,"room",30,30,3,99);

        floor2 = new Floor(997,"floor2");
        floor2.rooms.add(room4);
        floor2.rooms.add(room5);
        floor2.rooms.add(room6);
    }

    /**
     * This method tests floor.getCube.
     *
     */
    @Test
    public void testFloorGetCube(){
        assertEquals(6,floor.getCube(),"testFloorGetCube");

    }
    @Test
    public void testFloorGetCube2(){
        assertEquals(60,floor2.getCube(),"testFloorGetCube");

    }

    /**
     * This method tests floor.getHeating.
     *
     */
    @Test
    public void testFloorGetHeating(){
        assertEquals(6,floor.getHeating(),"testFloorGetHeaing");
    }
    @Test
    public void testFloorGetHeating2(){
        assertEquals(6,floor2.getHeating(),"testFloorGetHeaing");
    }

    /**
     * This method tests floor.getArea.
     *
     */
    @Test
    public void testFloorGetArea(){
        assertEquals(6,floor.getArea(),"testFloorGetArea");
    }
    @Test
    public void testFloorGetArea2(){
        assertEquals(60,floor2.getArea(),"testFloorGetArea");
    }
    /**
     * This method tests floor.getLight.
     *
     */
    @Test
    public void testFloorGetLight(){
        assertEquals(6,floor.getLight(),"testFloorGetLight");

    }
    @Test
    public void testFloorGetLight2(){
        assertEquals(297,floor2.getLight(),"testFloorGetLight");

    }

}