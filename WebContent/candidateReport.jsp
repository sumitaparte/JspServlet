<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Candidate Information</h1>
	<form name="candreport" action="statusReport.do" method="post" >
		<table border="1" cellspacing="6"cellpadding="10">
		<tr>
			<td>
				<b>Applicant Status:</b><font color="red">*</font>
			</td>
			<td>
				<select name="status" required/>
					<option value="confirmed">Confirmed</option>
					<option value="accepted">Accepted </option>
					<option value="rejected">Rejected </option>
				</select>
			</td>
		</tr>
		<tr>
		<td><b>Time Period:</b><font color="red">*</font></td>
		<td colspan="2"><input type="date" name="startdate" required/>
			<input type="date" name="enddate" required/>
			</td>
			</tr>
		
		<tr>
		<td colspan="2"><center><input type="submit" value="submit"></center></td>
		</tr>
		</table>
		</form>
		</center>
</body>
</html>