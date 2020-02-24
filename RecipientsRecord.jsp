<%@page import="com.servlet.Recipients" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<% 
Recipients newRecipients = (Recipients) session.getAttribute("newRecipients");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang "en">
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<link rel="stylesheet" type="text/css" href="mystyles.css">
<meta charset="ISO-8859-1">
<title>Bought Vehicles Record</title>
</head>
<body>
<div class="jumbotron"></div>
<h1>Recipients Record</h1>
<p>This is a list of people that have bought cars</p>

<br/><br/>
<table>
		<c:if test="${recipients != null}">
  <tr>
    <th>First Name</th>
    <th>Last Name</th> 
    <th>Email</th>

  </tr>
  <c:forEach var="recipient" items="${recipients}">
  		<tr>
    <td><c:out value="${recipient.firstName}"/></td>
    <td><c:out value="${recipient.lastName}"/></td>
    <td><c:out value="${recipient.email}"/></td>
    	</tr>
    </c:forEach>
    </c:if>

    </table>
    
    <br>
<br>
<h2>Click the button to view the list of Purchased Vehicles</h2>
<form action="PurchasedVehicleList" method="get">
<button type="submit" class="btn btn-default">View Record</button>


</form>
<br/><br/>
<br/><br/>

<h4>Click here to go back home</h4>
<form method="post" action="index.jsp">
    <button type="submit">Home</button>
</form>
    
    
    
    
</body>
</html>