package com.capgemini.appl.dao;

public class Participant {
	String Roll_no;
	String email_id;
	int Application_id;
	String Scheduled_program_id;
	public Participant(String roll_no, String email_id, int application_id,
			String scheduled_program_id) {
		super();
		Roll_no = roll_no;
		this.email_id = email_id;
		Application_id = application_id;
		Scheduled_program_id = scheduled_program_id;
	}
	public String getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(String roll_no) {
		Roll_no = roll_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getApplication_id() {
		return Application_id;
	}
	public void setApplication_id(int application_id) {
		Application_id = application_id;
	}
	public String getScheduled_program_id() {
		return Scheduled_program_id;
	}
	public void setScheduled_program_id(String scheduled_program_id) {
		Scheduled_program_id = scheduled_program_id;
	}
	@Override
	public String toString() {
		return "Participant [Roll_no=" + Roll_no + ", email_id=" + email_id
				+ ", Application_id=" + Application_id
				+ ", Scheduled_program_id=" + Scheduled_program_id + "]";
	}

}
