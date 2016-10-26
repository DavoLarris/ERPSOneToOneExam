package org.cuatrovientos.larris.examenOneToOne.DAO;

import java.util.List;

import org.cuatrovientos.larris.examenOneToOne.HibernateSession;
import org.cuatrovientos.larris.examenOneToOne.DAOInteface.PilotDAOInterface;
import org.cuatrovientos.larris.examenOneToOne.models.Pilot;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PilotDAO implements PilotDAOInterface{

	public List<Pilot> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Pilot> pilots = session.createCriteria(Pilot.class).list();
		
		session.close();
		return pilots;
	}

	public void insert(Pilot pilot) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(pilot);
	         
	    session.getTransaction().commit();
	    session.close();
	}


}
