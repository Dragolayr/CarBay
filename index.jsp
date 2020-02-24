<%@page import="com.servlet.HomePage" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body { 
  
  background-image: url(https://cache.desktopnexus.com/thumbseg/582/582557-bigthumbnail.jpg);
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: bottom center;
  
  
}
</style>
</head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="mystyles.css">
<title>CarBay!</title>
<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand">Welcome</h3>
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link active" href="Application.jsp">Add Cars</a> <!-- make sure you put in the jsp link after href= -->
        <a class="nav-link active" href="NewVehicleList.jsp">New</a>
        <a class="nav-link active" href="UsedVehicleList.jsp">Used</a>
        <a class="nav-link active" href="PurchasedVehicleList.jsp">Purchased Vehicles</a>
      </nav>
    </div>
  </header>

  <main role="main" class="inner cover">
    <h1 class="cover-heading">Lets get you rolling.</h1>
    <p class="lead">Our selection of vehicles ranges from new, to used, to cars that you can bid on.</p>
    <p class="lead">
      
    </p>
  </main>
</div>
	

</body>

</head>

</html>