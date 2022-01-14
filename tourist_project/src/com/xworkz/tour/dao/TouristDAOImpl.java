package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tour.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO{

	public void put(TouristEntity entity) {
		
		
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
			
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction trans=entityManager.getTransaction();
		trans.begin();
		entityManager.persist(entity);
		trans.commit();
		
	}

	@Override
	public void putAll(List<TouristEntity> entity) {
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		
		for(TouristEntity tourEntity:entity) {
			manager.persist(tourEntity);
			
			EntityTransaction trans=manager.getTransaction();
			trans.begin();
			int flushcount=0;
			
			try {
				for(int i=0;i<54;i++) {
					if(flushcount==15) {
						manager.flush();
						flushcount=0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				trans.rollback();
			}
			
			trans.commit();
		}		
	}

}
