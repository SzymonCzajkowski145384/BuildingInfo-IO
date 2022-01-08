package pl.put.poznan.buildinginfo.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FloorTest {

    private Floor floor;
    private Room room1,room2,room3;

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

    @Test
    public void testFloorGetCube(){
        assertEquals(6,floor.getCube(),"testFloorGetCube");

    }

    @Test
    public void testFloorGetHeating(){
        assertEquals(6,floor.getHeating(),"testFloorGetHeaing");

    }
    @Test
    public void testFloorGetArea(){
        assertEquals(6,floor.getArea(),"testFloorGetArea");

    }
    @Test
    public void testFloorGetLight(){
        assertEquals(6,floor.getLight(),"testFloorGetLight");

    }

}