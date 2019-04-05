package com.capgemini.appl.dao;

import java.sql.Date;

public class ProgramsScheduled {
	int scheduled_program_id;
	String ProgramName;
	String LocationID;
	java.sql.Date start_date;
	java.sql.Date end_date;
	int sessions_per_week;
	public ProgramsScheduled(int scheduled_program_id, String programName,
			String locationID, Date start_date, Date end_date,
			int sessions_per_week) {
		super();
		this.scheduled_program_id = scheduled_program_id;
		ProgramName = programName;
		LocationID = locationID;
		this.start_date = start_date;
		this.end_date = end_date;
		this.sessions_per_week = sessions_per_week;
	}
	public int getScheduled_program_id() {
		return scheduled_program_id;
	}
	public void setScheduled_program_id(int scheduled_program_id) {
		this.scheduled_program_id = scheduled_program_id;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public String getLocationID() {
		return LocationID;
	}
	public void setLocationID(String locationID) {
		LocationID = locationID;
	}
	public java.sql.Date getStart_date() {
		return start_date;
	}
	public void setStart_date(java.sql.Date start_date) {
		this.start_date = start_date;
	}
	public java.sql.Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(java.sql.Date end_date) {
		this.end_date = end_date;
	}
	public int getSessions_per_week() {
		return sessions_per_week;
	}
	public void setSessions_per_week(int sessions_per_week) {
		this.sessions_per_week = sessions_per_week;
	}
	@Override
	public String toString() {
		return "ProgramsScheduled [scheduled_program_id="
				+ scheduled_program_id + ", ProgramName=" + ProgramName
				+ ", LocationID=" + LocationID + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", sessions_per_week="
				+ sessions_per_week + "]";
	}
	
	

}
