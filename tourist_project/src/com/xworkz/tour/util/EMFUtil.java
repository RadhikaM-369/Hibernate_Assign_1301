package com.xworkz.tour.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
private static EntityManagerFactory entityManagerFactory;

public static EntityManagerFactory getEntityManagerFactory() {
	return entityManagerFactory;
	
}

static {
	
		System.out.println("persistence file");
		entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz.tour");
		
		System.out.println("Data adding");
}
}
