package pl.put.poznan.buildinginfo.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.buildinginfo.classes.Building;
import pl.put.poznan.buildinginfo.logic.BuildingTransformer;

import java.util.Arrays;
import java.util.List;


@RestController
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    private BuildingTransformer transformer = new BuildingTransformer();


    @RequestMapping("/buildings")
    public List<Building> getAllBuildings(){
        return transformer.getAllBuildings();
    }

    @RequestMapping(method=RequestMethod.POST, value="/buildings")
    public void addBuildings(@RequestBody List<Building> newBuildings) {
        transformer.addBuildings(newBuildings);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/buildings")
    public void deleteAllBuildings() {transformer.deleteAllBuildings();}

    @RequestMapping("/area/{id1}")
    public String getAreaOfBuilding(@PathVariable int id1){
        return transformer.getAreaOfBuilding(id1);
    }

    @RequestMapping("/area/{id1}/{id2}")
    public String getAreaOfFloor(@PathVariable int id1, @PathVariable int id2){
        return transformer.getAreaOfFloor(id1, id2);
    }

    @RequestMapping("/area/{id1}/{id2}/{id3}")
    public String getAreaOfRoom(@PathVariable int id1, @PathVariable int id2, @PathVariable int id3){
        return transformer.getAreaOfRoom(id1, id2, id3);
    }

}


