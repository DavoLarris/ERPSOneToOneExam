package org.cuatrovientos.larris.examenOneToOne.DAOInteface;

import java.util.List;

import org.cuatrovientos.larris.examenOneToOne.models.Aircraft;


public interface AircraftDAOInterface {
	public Aircraft selectById(Long id);
	public List<Aircraft> selectAll ();
	public void insert (Aircraft aircraft);
	public void update (Aircraft aircraft);
	public void delete (Aircraft aircraft);
}
