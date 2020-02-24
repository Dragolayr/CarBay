package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UpdateRecord")
public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateRecord() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		

		ArrayList<Vehicle> vehicles =  (ArrayList<Vehicle>)session.getAttribute("vehicles");

		if(vehicles == null) {
			vehicles=new ArrayList<>();

		}
		
		Vehicle newVehicle = new Vehicle();
		
		for(Vehicle car: vehicles) {
			if(request.getParameter("vehicleVIN").equals(newVehicle.getVIN()));
				newVehicle.getYear();
				newVehicle.getMake();
				newVehicle.getModel();
				newVehicle.getNumOfDoors();
				newVehicle.getMPG();
				newVehicle.getPrice();
				newVehicle.getVIN();
				newVehicle.getCondition();
				
				session.setAttribute("car", car);
			}
		
		
		
		RequestDispatcher rs=request.getRequestDispatcher("UpdateRecord.jsp");
		rs.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		doGet(request, response);
	}

}
