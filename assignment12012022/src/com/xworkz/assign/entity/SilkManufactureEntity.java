package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="silkManufacture")
public class SilkManufactureEntity{
	@Id
	@Column(name="sm_Id")
	private int SMid;
	
	@Column(name="sm_Name")
	private String SMName;
	
	@Column(name="sm_Location")
	private String SMLocation;
	
	@Column(name="sm_Contact")
	private long SMcontact;
	
	@Column(name="sm_Website")
	private String SMWebsite;
	
	@Column(name="sm_Startyear")
	private int SMStartYear;
	
	@Column(name="sm_Turnover")
	private String SMyearlyturnOver;
	
	
	public SilkManufactureEntity() {
		super();
	}
	public SilkManufactureEntity(int sMid, String sMName, String sMLocation, long sMcontact, String sMWebsite,
			int sMStartYear, String sMyearlyturnOver) {
		super();
		SMid = sMid;
		SMName = sMName;
		SMLocation = sMLocation;
		SMcontact = sMcontact;
		SMWebsite = sMWebsite;
		SMStartYear = sMStartYear;
		SMyearlyturnOver = sMyearlyturnOver;
	}
	public int getSMid() {
		return SMid;
	}

	public void setSMid(int sMid) {
		SMid = sMid;
	}

	public String getSMName() {
		return SMName;
	}

	public void setSMName(String sMName) {
		SMName = sMName;
	}
	public String getSMLocation() {
		return SMLocation;
	}
	public void setSMLocation(String sMLocation) {
		SMLocation = sMLocation;
	}
	public long getSMcontact() {
		return SMcontact;
	}
	public void setSMcontact(long sMcontact) {
		SMcontact = sMcontact;
	}
	public String getSMWebsite() {
		return SMWebsite;
	}
	public void setSMWebsite(String sMWebsite) {
		SMWebsite = sMWebsite;
	}
	public int getSMStartYear() {
		return SMStartYear;
	}
	public void setSMStartYear(int sMStartYear) {
		SMStartYear = sMStartYear;
	}
	public String getSMyearlyturnOver() {
		return SMyearlyturnOver;
	}
	public void setSMyearlyturnOver(String sMyearlyturnOver) {
		SMyearlyturnOver = sMyearlyturnOver;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}
