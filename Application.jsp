<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CarBay</title>
<link rel="stylesheet" href="mystyles.css">
</head>
<body>
<h1>Welcome to CarBay!</h1>

<h2>Enter vehicle information to add a car to the system</h2>
<form class = "container"  action="Registration" method="post">
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
<div class = "form group">
<label for = "addVehicle">Vehicle Mpg</label>
<input type = "text" class="form-control" name = "vehicleMpg" id = "vehicleMpg" placeholder="Vehicle Mpg">
</div>
<br/><br/>
<div class = "form group">
<label for = "addVehicle">Vehicle Price</label>
<input type = "text" class="form-control" name = "vehiclePrice" id = "vehiclePrice" placeholder="Vehicle Price">
</div>
<br/><br/>
<div class = "form group">
<label for = "addVehicle">Vehicle numOfDoors</label>
<input type = "text" class="form-control" name = "vehicleNumOfDoors" id = "vehicleNumOfDoors" placeholder="Vehicle NumOfDoors">
</div>
<br/><br/>
<div class = "form group">
<label for = "addVehicle">Vehicle VIN</label>
<input type = "text" class="form-control" name = "vehicleVIN" id = "vehicleVIN" placeholder="Vehicle VIN">
</div>
<br/><br/>

<!-- <div class="form group">
<h4>You can add photo here</h4>

<label for = "addVehicle">Vehicle Picture</label>
<input id="image" type="file" name="vehiclePhoto" placeholder="Photo">
</div>
<br/><br/> -->





<div class="newused-selector">
<input type="checkbox" name="condition" value="NEW" id="condition" class="newused"/>
<label for="newused-new">NEW</label>
<input type="checkbox" name="condition" value="USED" id="condition" class="newused"/>
<label for="newused-new">USED</label>
</div>

<button type="submit" class="btn btn-default">Submit</button>

<br/><br/>
</form>

<form method="post" action="index.jsp">
    <button type="submit">Home</button>
</form>







<form class="container" action="UpdateRecord.jsp" method="get">
<h5>Type VIN number to update a vehicle record</h5>
<div class = "form group">
<label for = "addVehicle">Vehicle VIN</label>
<input type = "text" class="form-control" name = "vehicleVIN" id = "vehicleVIN" placeholder="Vehicle VIN">
</div>
<button type="submit" class="btn btn-default">Submit</button>
<br/><br/>
</form>









</body>
</html>