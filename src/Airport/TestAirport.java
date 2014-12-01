package Airport;

import java.util.*;

public class TestAirport {
    
    public static void main(String[] args) {
        Airport airport = new Airport();
        List<Airplane> airplanes = new ArrayList<>();
        airplanes.add(new Airplane(airport));
        airplanes.add(new Airplane(airport));
        airplanes.add(new Airplane(airport));
        airplanes.add(new Airplane(airport));
        
        for (Airplane a : airplanes) {
            Thread myThready = new Thread(a);
            myThready.setName(a.getName());
            myThready.start();
        }
        
    }
    
}
