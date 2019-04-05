package com.capgemini.appl.dto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.appl.dao.Application;
import com.capgemini.appl.exception.UniversityAdmissionException;
import com.capgemini.appl.util.JndiUtil;

public class UniversityDaoImpl  implements UniversityDao{

	private JndiUtil util;
	public UniversityDaoImpl() throws UniversityAdmissionException {
		util= new JndiUtil();
	}

	@Override
	public List<Application> showApplicantInfo(String status,Date startdate1,Date endDate1)
			throws UniversityAdmissionException {
		
		Connection conn=null;
		PreparedStatement pstm=null;
		Application appl = new Application();
		List<Application> applicantList = new ArrayList<Application>();
		
		String qry = "SELECT appl.Application_id,appl.full_name,appl.status,appl.Scheduled_program_id FROM Application appl JOIN Programs_Scheduled ps ON appl.Scheduled_program_id=ps.Scheduled_program_id WHERE((status=?)AND(start_date=? AND end_date=?))";
		try {
			conn = util.getConnection();
			pstm=conn.prepareStatement(qry);
			pstm.setString(1,status);
			pstm.setDate(2, startdate1);
			pstm.setDate(3, endDate1);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()){
				
				appl.setApplication_id(rs.getInt("Application_id"));
				appl.setFull_name(rs.getString("full_name"));
				appl.setStatus(rs.getString("status"));
				appl.setScheduled_program_id(rs.getString("Scheduled_program_id"));
				applicantList.add(appl);
				
			}
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UniversityAdmissionException("Problem occured while showing applicant Details",e);
		}
		finally{
			try{
				
				pstm.close();
				conn.close();
				
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();	
		}
		}
		
		return applicantList;
	}

}
