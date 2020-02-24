<%@page import="com.servlet.Vehicle" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
Vehicle newVehicle = (Vehicle) session.getAttribute("newVehicle");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang "en">
<head>
<meta charset="ISO-8859-1">
<title>Update Record</title>
</head>
<body>

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
  <c:forEach var="vehicle" items="${car}">
  		<tr>

		 
 	<c:if test="${vehicle.condition == 'NEW'}" >	
    <td><c:out value="${vehicle.getYear}"/></td>
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





<h2>Update information</h2>
<form class = "container"  action="UpdateRecord" method="post">
<div class = "form group">
<label for = "addVehicle">Vehicle Make</label>
<input type = "text" class="form-control" name = "vehicleMake" id = "vehicleMake" placeholder="Vehicle Make">
</div>
<br/><br/>
<div class = "form group">
<label for = "addVehicle">Vehicle Model</label>
<input type = "text" class="form-control" name = "vehicleModel" id = "vehicleModel" placeholder="Vehicle Model">
</div>
<br/><br/>
<div class = "form group">
<label for = "addVehicle">Vehicle Year</label>
<input type = "text" class="form-control" name = "vehicleYear" id = "vehicleYear" placeholder="Vehicle Year">
</div>
<br/><br/>

</form>

</body>
</html>