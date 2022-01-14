package com.xworkz.assign.dao;

import java.util.List;

import com.xworkz.assign.entity.AirportEntity;

public interface AirportInterf {
	
public void put(AirportEntity entity);
public void putAll(List <AirportEntity> airEntity);

}
