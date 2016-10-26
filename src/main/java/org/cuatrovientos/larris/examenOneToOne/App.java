package org.cuatrovientos.larris.examenOneToOne;


import java.util.List;

import org.cuatrovientos.larris.examenOneToOne.DAO.AircraftDAO;
import org.cuatrovientos.larris.examenOneToOne.DAOInteface.AircraftDAOInterface;
import org.cuatrovientos.larris.examenOneToOne.models.Aircraft;
import org.cuatrovientos.larris.examenOneToOne.models.Pilot;


public class App 
{
    public static void main( String[] args )
    {
    	Aircraft aircraft1 = new Aircraft("AirForce 1", 1000f);
    	Aircraft aircraft2 = new Aircraft("AirForce 2", 500f);
    	Pilot pilot1 = new Pilot("Franco Generalísimo", 10);
    	Pilot pilot2 = new Pilot("Rintintin", 5);
    	
    	
    	aircraft1.setPilot(pilot1);
    	aircraft2.setPilot(pilot2);
    	
    	AircraftDAOInterface aircraftDAO = new AircraftDAO();
    	
    	aircraftDAO.insert(aircraft1);
    	aircraftDAO.insert(aircraft2);
    	
    	List<Aircraft> aircrafts = aircraftDAO.selectAll();
		System.out.println("--- Aircrafts ----- table contents	-----------");
		for (Aircraft aircraft : aircrafts) {
			System.out.println("Id: " + aircraft.getId());
			System.out.println(" - Model: " + aircraft.getModel());
			System.out.println(" - Autonomy: " + aircraft.getAutonomy());
			System.out.println(" - Pilot: " + aircraft.getPilot().toString());
			
		}
		
		System.out.println("Total aircrafts: " + aircrafts.size());
    	
    }
}
