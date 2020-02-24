<%@page import="com.servlet.Vehicle" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- for the c out statements -->
  
<%
Vehicle newVehicle = (Vehicle) session.getAttribute("newVehicle");
%>
  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
    
<!DOCTYPE html>
<html lang"en">
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<link rel="stylesheet" type="text/css" href="mystyles.css">

<meta charset="ISO-8859-1">
<title>CarBay</title>
</head>
<body>
<div class="jumbotron"></div>
<h1>Display all cars in inventory</h1>
<p>This is a display of all cars in the inventory</p>

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


  </tr>
  <c:forEach var="vehicle" items="${vehicles}">
  		<tr>

		 
 	<c:if test="${vehicle.condition == 'NEW'}" >	
    <td><c:out value="${vehicle.year}"/></td>
    <td><c:out value="${vehicle.make}"/></td>
    <td><c:out value="${vehicle.model}"/></td>
    <td><c:out value="${vehicle.numOfDoors}"/></td>
    <td><c:out value="${vehicle.MPG}"/></td>
    <td><c:out value="${vehicle.price}"/></td>
    <td><c:out value="${vehicle.VIN}"/></td>
    <td><c:out value="${vehicle.condition}"/></td>
    
    </c:if>
   </tr>
   </c:forEach> 
    </c:if>
    </table>
    <br><br><br><br><br>
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
    <th>USED</th>
    

  </tr>
  <c:forEach var="vehicle" items="${vehicles}">
  		<tr>
  
 	<c:if test="${vehicle.condition == 'USED'}">
    <td><c:out value="${vehicle.year}"/></td>
    <td><c:out value="${vehicle.make}"/></td>
    <td><c:out value="${vehicle.model}"/></td>
    <td><c:out value="${vehicle.numOfDoors}"/></td>
    <td><c:out value="${vehicle.MPG}"/></td>
    <td><c:out value="${vehicle.price}"/></td>
    <td><c:out value="${vehicle.VIN}"/></td>
    <td><c:out value="${vehicle.condition}"/></td>
    
	</c:if>
 		</tr>
 		</c:forEach>
 		</c:if>
</table>
<br>
<br>
	
<form method="post" action="Application.jsp">
    <button type="submit">Add Another</button>
</form><br><br><br>
<form method="post" action="index.jsp">
    <button type="submit">Home</button>
</form>
</body>
</html>