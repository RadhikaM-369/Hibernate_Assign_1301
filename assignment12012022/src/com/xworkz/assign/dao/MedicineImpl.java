package com.xworkz.assign.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.assign.entity.MedicineEntity;
import com.xworkz.assign.util.EMFUtil;

public class MedicineImpl implements MedicineInterf {

	public void put(MedicineEntity entity) {
EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction trans=entityManager.getTransaction();
		
		trans.begin();
		entityManager.persist(entity);
		trans.commit();
		
		
	}

	@Override
	public void putAll(List<MedicineEntity> MedEntity) {
	EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		
		for(MedicineEntity medEntity:MedEntity) {
			manager.persist(medEntity);
			
			EntityTransaction trans=manager.getTransaction();
			trans.begin();
			int flushcount=0;
			
			try {
				for(int i=0;i<34;i++) {
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


