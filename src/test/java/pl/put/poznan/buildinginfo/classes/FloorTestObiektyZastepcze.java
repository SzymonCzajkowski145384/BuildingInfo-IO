package pl.put.poznan.buildinginfo.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class FloorTestObiektyZastepcze {

    Floor mock = mock(Floor.class);
    Floor mock2 = mock(Floor.class);

    @BeforeEach
    void setUp(){
        when(mock.getArea()).thenReturn(10F);
        when(mock.getCube()).thenReturn(20F);
        when(mock.getHeating()).thenReturn(30F);
        when(mock.getLight()).thenReturn(40F);
        when(mock2.getLight()).thenReturn(4F);
    }

    @Test
    void getArea() {
        assertEquals(10F, mock.getArea());
    }

    @Test
    void getCube() {
        assertEquals(20F, mock.getCube());
    }

    @Test
    void getHeating() {
        assertEquals(30F, mock.getHeating());
    }

    @Test
    void getLight() {
        assertEquals(40F, mock.getLight());
    }
    @Test
    void getLight2() {
        assertEquals(4F, mock2.getLight());
    }

}