<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bought Car</title>
</head>
<body>
<h1>Congratulations you bought the car!</h1>


<h2>Please enter your information to add to record</h2>
<form class = "container"  action="ReceiptRecord" method="post">
<div class = "form group">
<label for = "addRecipients">Recipient First Name</label>
<input type = "text" class="form-control" name = "recipientsFirstName" id = "recipientsFirstName" placeholder="Recipient First Name"> <!-- ID IS WHAT YOU HAVE TO WRITE ON THE FRONT END C:OUT VALUE STATEMENT -->
</div>
<br/><br/>
<div class = "form group">
<label for = "addRecipients">Recipient Last Name</label>
<input type = "text" class="form-control" name = "recipientsLastName" id = "recipientsLastName" placeholder="Recipient Last Name">
</div>
<br/><br/>
<div class = "form group">
<label for = "addRecipients">Recipient Email</label>
<input type = "text" class="form-control" name = "recipientsEmail" id = "recipientsEmail" placeholder="Recipient Email">
</div>
<br/><br/>

<button type="submit" class="btn btn-default">Submit</button>









</form>







</body>
</html>