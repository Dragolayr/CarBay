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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

@WebServlet("/PurchasedVehicleList")
public class PurchasedVehicleList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PurchasedVehicleList() {
        super();

    }
//THIS IS SUPPOSED TO READ THE TEXT FILE FOR PURCHASED VEHICLES

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);


		ArrayList<Vehicle> purchasedVs =  (ArrayList<Vehicle>)session.getAttribute("purchasedVs");
		
		if(purchasedVs == null) {
			purchasedVs=new ArrayList<>();
		}
		
		
		try {
			final String path = "C:\\Users\\Dragolayr\\Documents\\UpdatedVehicleList.txt";
			File file = new File(path);
			Scanner scanner = new Scanner(file); //the scanner scans a different location now, different from system.in, because its scanning a file now.
			String line = path.toString(); //designate what the variable will be getting.
			
			while(scanner.hasNextLine()) {
				
			String parsedLine = scanner.nextLine();
		
			
			String [] details = parsedLine.split("\n"); //gets whole list of cars 
			for(int i = 0; i < details.length; i ++) {
	    		 
	    		 String vehicle = details[i];
	    		 String [] car = vehicle.split(", ");
	    		 
	    	 String make= car[0];
	    	 String model= car[1];
	    	 String year= car[2];
	    	 String MPG= car[3];
	    	 String price= car[4];
	    	 String numOfDoors= car[5];
	    	 String condition= car[6];
	    	 String VIN= car[7];
	    	 
	    	 Vehicle purchasedVes = new Vehicle();
	 		
	 		purchasedVes.setMake(make);
	 		purchasedVes.setModel(model);
	 		purchasedVes.setYear(year);
	 		purchasedVes.setMPG(MPG);
	 		purchasedVes.setPrice(price);
	 		purchasedVes.setNumOfDoors(numOfDoors);
	 		purchasedVes.setCondition(condition);
	 		purchasedVes.setVIN(VIN);
	 		
	 		purchasedVs.add(purchasedVes);
	 		
	 		session.setAttribute("purchasedVs", purchasedVs);
	    	 
			}

	    	 }			
		
			
		}
			
		
		catch(FileNotFoundException e) {
			System.out.println("ERROR READING FROM FILE");
			
		
		}
		
		session.setAttribute("purchasedVs", purchasedVs);
		
		RequestDispatcher rs=request.getRequestDispatcher("PurchasedVehicleList.jsp"); //this takes you to the location.jsp
			rs.forward(request, response);
		
		
		
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
}


