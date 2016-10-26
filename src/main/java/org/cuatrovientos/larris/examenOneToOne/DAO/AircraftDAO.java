package org.cuatrovientos.larris.examenOneToOne.DAO;

import java.util.List;

import org.cuatrovientos.larris.examenOneToOne.HibernateSession;
import org.cuatrovientos.larris.examenOneToOne.DAOInteface.AircraftDAOInterface;
import org.cuatrovientos.larris.examenOneToOne.models.Aircraft;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AircraftDAO implements AircraftDAOInterface{

	public Aircraft selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Aircraft aircraft = (Aircraft) session.get(Aircraft.class, id);
	    
	    session.close();
	    return aircraft;
	}

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

	public void update(Aircraft aircraft) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	 
	    session.beginTransaction();
	 
	    session.merge(aircraft);
	 
	    session.getTransaction().commit();
	    session.close();
	}

	public void delete(Aircraft aircraft) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(aircraft);
	 
	    session.getTransaction().commit();
	    session.close();
		
	}

}
