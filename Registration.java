package com.servlet;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private static final String MPG = null;

       

    public Registration() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		ArrayList<Vehicle> vehicles =  (ArrayList<Vehicle>)session.getAttribute("vehicles");

		if(vehicles == null) {
			vehicles=new ArrayList<>();

		}
		
		Vehicle newVehicle = new Vehicle();
		
		newVehicle.setMake(request.getParameter("vehicleMake"));
		newVehicle.setModel(request.getParameter("vehicleModel"));
		newVehicle.setYear(request.getParameter("vehicleYear"));
		newVehicle.setMPG(request.getParameter("vehicleMpg"));
		newVehicle.setPrice(request.getParameter("vehiclePrice"));
		newVehicle.setNumOfDoors(request.getParameter("vehicleNumOfDoors"));
		newVehicle.setCondition(request.getParameter("condition"));
		newVehicle.setVIN(request.getParameter("vehicleVIN"));
		
		
		
		vehicles.add(newVehicle);
		
		
		session.setAttribute("vehicles", vehicles);

		
		final String path = "C:\\Users\\Dragolayr\\Documents\\cardatabase.txt";
		
	
//			String fileName = path+VIN+".txt";  //location to save it, name of the file, and type of the file
			try {  // if
//				String list = Arrays.toString(vehicles.toArray()).replace("[", "").replace("]", "");
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
				for(int i = 0; i < vehicles.size(); i ++) {
				bw.write(newVehicle.formatData()); //writes data to the array list. dont add syntax to the logic that adds a new file, cause it will just make a new file for you
				}
				bw.close();
				
				//closes the writer after its done
			}catch (IOException e) {  //else
				System.out.println("ERROR WRITING TO FILE");
			}
		
		
		
		
		
		
		
		
		
		
		RequestDispatcher rs=request.getRequestDispatcher("vehiclerecord.jsp"); //this takes you to the location.jsp
		rs.forward(request, response);
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
