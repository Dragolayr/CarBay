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
<title>Used Vehicles</title>
</head>
<body>
<div class="jumbotron"></div>
<h1>Used cars in inventory</h1>
<h2>This is a display of all used cars in the inventory</h2>
<form action="ReadFileforUsed" method="get">
<button type="submit" class="btn btn-default">View List</button>


</form>

<table>
		<c:if test="${vehicles != null}">
  <tr>
    <th>YEAR</th>
    <th>MAKE</th> 
    <th>MODEL</th>
    <th>NUMBER OF DOORS</th>
    <th>MPG</th>
    <th>PRICE</th>
    <th>VIN</th>
    <th>NEW</th>
    <th>BUY??<th>

  </tr>
  <c:forEach var="vehicle" items="${vehicles}">
  		<tr>

		 
 	<c:if test="${vehicle.condition == 'USED'}" >	
    <td><c:out value="${vehicle.year}"/></td>
    <td><c:out value="${vehicle.make}"/></td>
    <td><c:out value="${vehicle.model}"/></td>
    <td><c:out value="${vehicle.numOfDoors}"/></td>
    <td><c:out value="${vehicle.MPG}"/></td>
    <td><c:out value="${vehicle.price}"/></td>
    <td><c:out value="${vehicle.VIN}"/></td>
    <td><c:out value="${vehicle.condition}"/></td>
    <td><form method="post" action="BuyButton"></form><button type="button">BUY!!</button></td>
    </c:if>
   </tr>
   </c:forEach> 
    </c:if>
    </table>
  <br/><br/>
  
  <form method="post" action="index.jsp">
    <button type="submit">Home</button>
</form>
  
  
  
</body>
</html>