package pl.put.poznan.buildinginfo.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BuildingTestObiektyZastepcze {


    Building mock = mock(Building.class);
    Building mock2 = mock(Building.class);


    @BeforeEach
    void setUp(){

        when(mock.getArea()).thenReturn(5F);
        when(mock.getCube()).thenReturn(6F);
        when(mock.getHeating()).thenReturn(7F);
        when(mock.getLight()).thenReturn(8F);
        when(mock2.getLight()).thenReturn(9F);

    }

    @Test
    void getArea() {
        assertEquals(5F, mock.getArea());
    }

    @Test
    void getCube() {
        assertEquals(5F, mock.getArea());
    }

    @Test
    void getHeating() {
        assertEquals(5F, mock.getArea());
    }

    @Test
    void getLight() {
        assertEquals(5F, mock.getArea());
    }

    @Test
    void getLight2() {
        assertEquals(0F, mock2.getArea());
    }
}