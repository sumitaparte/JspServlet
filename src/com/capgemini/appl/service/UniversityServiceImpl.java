package com.capgemini.appl.service;

import java.sql.Date;

import java.util.List;

import com.capgemini.appl.dao.Application;
import com.capgemini.appl.dto.UniversityDao;
import com.capgemini.appl.dto.UniversityDaoImpl;
import com.capgemini.appl.exception.UniversityAdmissionException;

public class UniversityServiceImpl implements UniversityService {

	UniversityDao universityDao;
	public UniversityServiceImpl() throws UniversityAdmissionException {
		
		universityDao = new UniversityDaoImpl();
		
	}

	@Override
	public List<Application> showApplicantInfo(String status,Date startdate1,Date endDate1)
			throws UniversityAdmissionException {
		
		return universityDao.showApplicantInfo(status,startdate1,endDate1);
	}

}
