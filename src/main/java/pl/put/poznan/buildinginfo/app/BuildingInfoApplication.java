package pl.put.poznan.buildinginfo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main starter class of application
 *
 * @author Bartosz Cudziński, Szymon Czajkowski
 * @version 0.5
 */

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.buildinginfo.rest"})
public class BuildingInfoApplication {

    /**
     * Main method of application
     *
     * @param args extra arguments
     */

    public static void main(String[] args) {
        SpringApplication.run(BuildingInfoApplication.class, args);
    }
}
