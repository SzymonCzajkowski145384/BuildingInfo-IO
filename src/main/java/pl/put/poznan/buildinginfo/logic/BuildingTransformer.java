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

    public BuildingTransformer(List<Building> build) {

        List<Building> buildings = build;

        /*
        //Przykładowy bydynek
        Building B1 = new Building(1,"A");
        Floor F11 = new Floor(1,"A");
        Room R111 = new Room(1, "a",100,20,10,5);
        Room R112 = new Room(2, "a",60,20,10,5);
        F11.rooms.add(R111);
        F11.rooms.add(R112);
        B1.floors.add(F11);
        Floor F12 = new Floor(2,"B");
        Room R121 = new Room(1, "b",100,20,10,5);
        Room R122 = new Room(2, "b",60,20,10,5);
        F12.rooms.add(R121);
        F12.rooms.add(R122);
        B1.floors.add(F12);

        buildings.add(B1);
        */
    }

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

    public String getAreaOfBuilding(int id1) {
        for (int i=0; i < buildings.size(); i++){
            if(buildings.get(i).getId() == id1){
                return "Powierzchnia budynku wynosi: "+String.valueOf(buildings.get(i).getArea());
            }
        }
        return "Budynek o id: "+String.valueOf(id1)+" nie istnieje";
    }

    public String getAreaOfFloor(int id1, int id2) {
        for (int i=0; i < buildings.size(); i++){
            if(buildings.get(i).getId() == id1){
                for (int j=0; j < buildings.get(i).floors.size(); j++){
                    if(buildings.get(i).floors.get(j).getId() == id2){
                        return "Powierzchnia piętra wynosi: "+String.valueOf(buildings.get(i).floors.get(j).getArea());
                    }
                }
            }
        }
        return "Pięto o id: "+String.valueOf(id2)+" w budynku o id "+String.valueOf(id1)+ " nie istnieje";
    }

    public String getAreaOfRoom(int id1, int id2, int id3) {
        for (int i=0; i < buildings.size(); i++){
            if(buildings.get(i).getId() == id1){
                for (int j=0; j < buildings.get(i).floors.size(); j++){
                    if(buildings.get(i).floors.get(j).getId() == id2){
                        for (int k=0; k < buildings.get(i).floors.get(j).rooms.size(); k++){
                            if(buildings.get(i).floors.get(j).rooms.get(k).getId() == id3){
                                return "Powierzchnia okoju wynosi: "
                                        +String.valueOf(buildings.get(i).floors.get(j).rooms.get(k).getArea());
                            }
                        }
                    }
                }
            }
        }
        return "Pokój o id: "+String.valueOf(id3)+" na piętrze o id: "+String.valueOf(id2)+" w budynku o id: "
                +String.valueOf(id1)+" nie istnieje";
    }

    public String getCubeOfBuilding(int id1) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                return "Kubatura budynku wynosi: " + String.valueOf(buildings.get(i).getCube());
            }
        }
        return "Budynek o id: " + String.valueOf(id1) + " nie istnieje";
    }

    public String getCubeOfFloor(int id1, int id2) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                    if (buildings.get(i).floors.get(j).getId() == id2) {
                        return "Kubatura piętra wynosi: " + String.valueOf(buildings.get(i).floors.get(j).getCube());
                    }
                }
            }
        }
        return "Piętro o id: " + String.valueOf(id2) + " w budynku o id " + String.valueOf(id1) + " nie istnieje";
    }

    public String getCubeOfRoom(int id1, int id2, int id3) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                    if (buildings.get(i).floors.get(j).getId() == id2) {
                        for (int k = 0; k < buildings.get(i).floors.get(j).rooms.size(); k++) {
                            if (buildings.get(i).floors.get(j).rooms.get(k).getId() == id3) {
                                return "Kubatura pokoju wynosi: "
                                        + String.valueOf(buildings.get(i).floors.get(j).rooms.get(k).getCube());
                            }
                        }
                    }
                }
            }
        }
        return "Pokój o id: " + String.valueOf(id3) + " na piętrze o id: " + String.valueOf(id2) + " w budynku o id: "
                + String.valueOf(id1) + " nie istnieje";

    }

    public String getLightOfBuilding(int id1) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                return "Oświetlenie budynku na m^2 wynosi: "
                        + String.valueOf(buildings.get(i).getLight()/buildings.get(i).getArea());
            }
        }
        return "Budynek o id: " + String.valueOf(id1) + " nie istnieje";
    }

    public String getLightOfFloor(int id1, int id2) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                    if (buildings.get(i).floors.get(j).getId() == id2) {
                        return "Oświetlenie piętra na m^2 wynosi: "
                                + String.valueOf(buildings.get(i).floors.get(j).getLight()/buildings.get(i).floors.get(j).getArea());
                    }
                }
            }
        }
        return "Piętro o id: " + String.valueOf(id2) + " w budynku o id " + String.valueOf(id1) + " nie istnieje";
    }

    public String getLightOfRoom(int id1, int id2, int id3) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                    if (buildings.get(i).floors.get(j).getId() == id2) {
                        for (int k = 0; k < buildings.get(i).floors.get(j).rooms.size(); k++) {
                            if (buildings.get(i).floors.get(j).rooms.get(k).getId() == id3) {
                                return "Oświetlenie pokoju na m^2 wynosi: "
                                        + String.valueOf(buildings.get(i).floors.get(j).rooms.get(k).getLight() /
                                            buildings.get(i).floors.get(j).rooms.get(k).getArea());
                            }
                        }
                    }
                }
            }
        }
        return "Pokój o id: " + String.valueOf(id3) + " na piętrze o id: " + String.valueOf(id2) + " w budynku o id: "
                + String.valueOf(id1) + " nie istnieje";
    }

    public String getHeatingOfBuilding(int id1) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                return "Zużycie energii na m^3 w budynku wynosi " + String.valueOf(buildings.get(i).getHeating()/buildings.get(i).getCube());
            }
        }
        return "Budynek o id: " + String.valueOf(id1) + " nie istnieje";
    }

    public String getHeatingOfFloor(int id1, int id2) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                    if (buildings.get(i).floors.get(j).getId() == id2) {
                        return "Zużycie energii na m^3 na piętrze wynosi " + String.valueOf(buildings.get(i).floors.get(j).getHeating()/buildings.get(i).floors.get(j).getCube());
                    }
                }
            }
        }
        return "Piętro o id: " + String.valueOf(id2) + " w budynku o id " + String.valueOf(id1) + " nie istnieje";
    }

    public String getHeatingOfRoom(int id1, int id2, int id3) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getId() == id1) {
                for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                    if (buildings.get(i).floors.get(j).getId() == id2) {
                        for (int k = 0; k < buildings.get(i).floors.get(j).rooms.size(); k++) {
                            if (buildings.get(i).floors.get(j).rooms.get(k).getId() == id3) {
                                return "Zużycie energii na m^3 wynosi w pomieszczeniu " + String.valueOf(buildings.get(i).floors.get(j).rooms.get(k).getHeating()/buildings.get(i).floors.get(j).rooms.get(k).getCube());
                            }
                        }
                    }
                }
            }
        }
        return "Pokój o id: " + String.valueOf(id3) + " na piętrze o id: " + String.valueOf(id2) + " w budynku o id: "
                + String.valueOf(id1) + " nie istnieje";
    }

    public String getWrongRooms(float norm) {
        String s = "";
        for (int i = 0; i < buildings.size(); i++) {
            for (int j = 0; j < buildings.get(i).floors.size(); j++) {
                for (int k = 0; k < buildings.get(i).floors.get(j).rooms.size(); k++) {
                    if(buildings.get(i).floors.get(j).rooms.get(k).getHeating()/buildings.get(i).floors.get(j).rooms.get(k).getCube() > norm)
                        s += "Budynek o id " + String.valueOf(buildings.get(i).getId()) + ", piętro o id "+ String.valueOf(buildings.get(i).floors.get(j).getId())
                                + ", pomieszczenie o id " + String.valueOf(buildings.get(i).floors.get(j).rooms.get(k).getId())+"\n";
                }
            }
        }
        if (s.length()==0)
            return "Wszystkie pomieszczenia spełniają normę";
        return "Pomieszczenia nie spełniające normy:\n" + s;
    }

    public String getAll() {
        String s = "";
        if (buildings.size()==0)
            return "Brak informacji do wyświetlenia";
        s += "Ilość budynków: " + buildings.size() + "\n";
        for (int i = 0; i < buildings.size(); i++) {

            int x = 0;

            s += "\nBudynek nr." + (i +1) + ":\n";
            s += "Id: " + buildings.get(i).getId() + "\n";
            s += "Name: " + buildings.get(i).getName() + "\n";
            s += "Ilość pięter: " + buildings.get(i).floors.size() + "\n";
            for(int j = 0; j < buildings.get(i).floors.size(); j ++){
                x += buildings.get(i).floors.get(j).rooms.size();
            }
            s += "Ilość pokoi: " + x + "\n";
            s += "Powierzchnia budynku: " + buildings.get(i).getArea() + "\n";
            s += "Kubatura budynku: " + buildings.get(i).getCube() + "\n";
            s += "Zużycie energii na m^3 w budynku: " + buildings.get(i).getHeating() + "\n";
            s += "Oświetlenie budynku na m^2: " + buildings.get(i).getLight() + "\n";

        }
        return s;
    }

}
