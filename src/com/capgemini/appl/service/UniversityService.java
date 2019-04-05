package com.capgemini.appl.service;

import java.sql.Date;
import java.util.List;

import com.capgemini.appl.dao.Application;
import com.capgemini.appl.exception.UniversityAdmissionException;

public interface UniversityService {

	
	public List<Application> showApplicantInfo(String status,Date startdate1,Date endDate1) throws UniversityAdmissionException;
	
}
