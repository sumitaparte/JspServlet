<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1"cellspacing="5" cellpadding="6">

<tr>
<td>Applicant Id</td>
<td>Name</td>
<td>Applicant Status</td>
<td>Schedule Id</td>
</tr>
<fo:forEach var="appldata" items="${applicantinfo}">
<tr>
<td>${appldata.application_id }</td>
<td>${appldata.full_name }</td>
<td>${appldata.status }</td>
<td>${appldata.Scheduled_program_id }</td>
</tr>
</fo:forEach>
</table>
</body>
</html>