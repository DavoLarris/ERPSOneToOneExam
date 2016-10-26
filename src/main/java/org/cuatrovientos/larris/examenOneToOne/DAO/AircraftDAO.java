package org.cuatrovientos.larris.examenOneToOne.DAO;

import java.util.List;

import org.cuatrovientos.larris.examenOneToOne.HibernateSession;
import org.cuatrovientos.larris.examenOneToOne.DAOInteface.AircraftDAOInterface;
import org.cuatrovientos.larris.examenOneToOne.models.Aircraft;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AircraftDAO implements AircraftDAOInterface{

	public List<Aircraft> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Aircraft> aircrafts = session.createCriteria(Aircraft.class).list();
		
		session.close();
		return aircrafts;
	}

	public void insert(Aircraft aircraft) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(aircraft);
	         
	    session.getTransaction().commit();
	    session.close();
	}

}
