package com.capgemini.appl.dao;

public class ProgramsOffered {
	String ProgramName;
	String description;
	String applicant;
	int duration;
	String degree_certificate_offered;
	public ProgramsOffered(String programName, String description,
			String applicant, int duration, String degree_certificate_offered) {
		super();
		ProgramName = programName;
		this.description = description;
		this.applicant = applicant;
		this.duration = duration;
		this.degree_certificate_offered = degree_certificate_offered;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDegree_certificate_offered() {
		return degree_certificate_offered;
	}
	public void setDegree_certificate_offered(String degree_certificate_offered) {
		this.degree_certificate_offered = degree_certificate_offered;
	}
	@Override
	public String toString() {
		return "ProgramsOffered [ProgramName=" + ProgramName + ", description="
				+ description + ", applicant=" + applicant + ", duration="
				+ duration + ", degree_certificate_offered="
				+ degree_certificate_offered + "]";
	}
	

}
