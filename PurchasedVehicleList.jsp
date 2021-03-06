 <%@page import="com.servlet.Vehicle" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
Vehicle newVehicle = (Vehicle) session.getAttribute("newVehicle");
%>    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<link rel="stylesheet" type="text/css" href="mystyles.css">
<meta charset="ISO-8859-1">
<title>Purchased Vehicles</title>
</head>
<body>
<div class="jumbotron"></div>
<h1>Purchased Vehicles</h1>
<h2>This is a list of cars that have been purchased</h2>

<br/><br/>

<table>
		<c:if test="${purchasedVs != null}"> <!-- this ties into the if statement beneath the array list on the connected servlet -->
  <tr>
    <th>YEAR</th>
    <th>MAKE</th> 
    <th>MODEL</th>
    <th>NUMBER OF DOORS</th>
    <th>MPG</th>
    <th>PRICE</th>
    <th>VIN</th>
    <th>CONDITION</th>
    

  </tr>
  
  <c:forEach var="vehicle" items="${purchasedVs}">
  		<tr>

		 
 		
    <td><c:out value="${vehicle.year}"/></td>
    <td><c:out value="${vehicle.make}"/></td>
    <td><c:out value="${vehicle.model}"/></td>
    <td><c:out value="${vehicle.numOfDoors}"/></td>
    <td><c:out value="${vehicle.MPG}"/></td>
    <td><c:out value="${vehicle.price}"/></td>
    <td><c:out value="${vehicle.VIN}"/></td>
    <td><c:out value="${vehicle.condition}"/></td>
    
    
    
   </tr>
   </c:forEach> 
   </c:if>
    
    </table>
    
    <br>
<br>




<br/><br/>
<br/><br/>

<h4>Click here to go back home</h4>
<form method="post" action="index.jsp">
    <button type="submit">Home</button>
</form>
</body>
</html>