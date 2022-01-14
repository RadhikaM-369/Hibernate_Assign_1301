package com.xworkz.assign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airport")
public class AirportEntity {
		@Id
	@Column(name="A_Id")
		private int AId;
		
		@Column(name="A_Name")
		private String AName ;
		
		@Column(name="A_location")
		private String Alocation;
		
		@Column(name="yearStart")
		private int startYear;
		
		@Column(name="A_Contact")
		private long AContact;
		
		@Column(name="A_Website")
		private String website;
		
		@Column(name="A_staff")
		private int noOfStaff;
		
		public AirportEntity() {
			super();
			
		}

		public AirportEntity(int aId, String aName, String alocation, int startYear, long aContact, String website,
				int noOfStaff) {
			super();
			this.AId = aId;
			this.AName = aName;
			this.Alocation = alocation;
			this.startYear = startYear;
			this.AContact = aContact;
			this.website = website;
			this.noOfStaff = noOfStaff;
		}

		public int getAId() {
			return AId;
		}

		public void setAId(int aId) {
			AId = aId;
		}

		public String getAName() {
			return AName;
		}

		public void setAName(String aName) {
			AName = aName;
		}

		public String getAlocation() {
			return Alocation;
		}

		public void setAlocation(String alocation) {
			Alocation = alocation;
		}

		public int getStartYear() {
			return startYear;
		}

		public void setStartYear(int startYear) {
			this.startYear = startYear;
		}

		public long getAContact() {
			return AContact;
		}

		public void setAContact(long aContact) {
			AContact = aContact;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public int getNoOfStaff() {
			return noOfStaff;
		}

		public void setNoOfStaff(int noOfStaff) {
			this.noOfStaff = noOfStaff;
		}
		
		@Override
		public String toString() {
			return "AirportEntity [AId=" + AId + ", AName=" + AName + ", Alocation=" + Alocation + ", startYear="
					+ startYear + ", AContact=" + AContact + ", website=" + website + ", noOfStaff=" + noOfStaff + "]";
		}

		@Override
		public int hashCode() {
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

			
		}

	
		
		

