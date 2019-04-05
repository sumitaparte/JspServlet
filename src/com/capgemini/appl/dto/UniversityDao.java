package com.capgemini.appl.dto;

import java.sql.Date;
import java.util.List;

import com.capgemini.appl.dao.Application;
import com.capgemini.appl.exception.UniversityAdmissionException;

public interface UniversityDao {
	
	public List<Application> showApplicantInfo(String status,Date startdate1,Date endDate1) throws UniversityAdmissionException;

}
