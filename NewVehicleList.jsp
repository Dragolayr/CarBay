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
<title>New Vehicles</title>
</head>
<body>
<div class="jumbotron"></div>
<h1>New cars in inventory</h1>
<h2>This is a display of all new cars in the inventory</h2>>

<form action="ReadFile" method="get">
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
  <h3>Enter a Vehicles VIN to buy the car</h3>
  <br/><br/>
  <form class = "container"  action="BuyButton" method="post">
<div class = "form group">
<label for = "enterVin">Vehicle VIN</label>
<input type = "text" class="form-control" name = "vehicleVIN" id = "vehicleVIN" placeholder="VehicleVIN">
</div>
<br/><br/>
<button type="submit" class="btn btn-default">BUY!!</button>
<br/><br/>
</form>
<br/><br/>
  
<form method="post" action="index.jsp">
    <button type="submit">Home</button>
</form>
  
  
</body>
</html>