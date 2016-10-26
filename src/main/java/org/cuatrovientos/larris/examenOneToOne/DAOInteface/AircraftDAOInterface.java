package org.cuatrovientos.larris.examenOneToOne.DAOInteface;

import java.util.List;

import org.cuatrovientos.larris.examenOneToOne.models.Aircraft;


public interface AircraftDAOInterface {
	
	public List<Aircraft> selectAll ();
	public void insert (Aircraft aircraft);
}
