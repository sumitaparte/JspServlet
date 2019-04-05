package com.capgemini.appl.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.appl.dao.Application;
import com.capgemini.appl.exception.UniversityAdmissionException;
import com.capgemini.appl.service.UniversityService;
import com.capgemini.appl.service.UniversityServiceImpl;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher requestDispatcher;
	private String nextJspString;
	String msg = null;
	private ServletContext ctxContext;
	
	UniversityService universityService;

	public FrontController() throws UniversityAdmissionException {
		universityService= new UniversityServiceImpl();
	}

	public void init() throws ServletException {
		
	}
	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String command = request.getServletPath();
		switch (command) {
		case "/showDetails.do": {}
		break;
		
		case "/statusReport.do" : {
			Date startdate1 = null;
			Date endDate1 = null;
			String status=request.getParameter("status");
			String startdate=request.getParameter("startdate");
			String enddate=request.getParameter("enddate");
			
			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat formatter2=new SimpleDateFormat("dd/MM/yyyy");
			try {
				 startdate1=(Date) formatter1.parse(startdate);
				System.out.println("startdate:"+startdate1);
				
				 endDate1=(Date) formatter1.parse(enddate);
				System.out.println("enddate:"+endDate1);
							
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List<Application> myList=null;
			try {
				myList=universityService.showApplicantInfo(status,startdate1,endDate1);
				System.out.println("In Controller"+myList);
				request.setAttribute("applicantinfo", myList);
				RequestDispatcher reqs = request.getRequestDispatcher("candidateInfo.jsp");
				reqs.forward(request,response);
			} catch (UniversityAdmissionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
			
		}
		}
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	public void destroy() {
	}


}
