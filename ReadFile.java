package com.servlet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
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





@WebServlet("/ReadFile")
public class ReadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ReadFile() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);


		ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>)session.getAttribute("vehicles");
		
		
		
		
		
		

		
		
//		session.setAttribute("vehicles", vehicles);
//		public static Vehicle readFromFile(String VIN) {  
//			String fileName = path+VIN+".txt";  //this line is to indicate where and what file to read from; as created above already
		if(vehicles == null) {
			vehicles=new ArrayList<>();

			
		try {
			final String path = "C:\\Users\\Dragolayr\\Documents\\cardatabase.txt";
			File file = new File(path);
			Scanner scanner = new Scanner(file); //the scanner scans a different location now, different from system.in, because its scanning a file now.
			String line = path.toString(); //designate what the variable will be getting.
			
			while(scanner.hasNextLine()) {
				

			String parsedLine = scanner.nextLine();
		
			
			String [] details = parsedLine.split("\n"); //gets whole list of cars 
			for(int i = 0; i < details.length; i ++) {
				String vehicle = details[i];
				String [] car = vehicle.split(", "); //this breaks up the individual line
				String make = car[0];
				String model = car[1];
				String year = car[2];
				String MPG = car[3];
				String price = car[4];
				String numOfDoors = car[5];
				String condition = car[6];
				String VIN1 = car[7];
			
			
				Vehicle newVehicle = new Vehicle();

		
				newVehicle.setVIN(VIN1);
				newVehicle.setYear(year);
				newVehicle.setMake(make);
				newVehicle.setModel(model);
				newVehicle.setMPG(MPG);
				newVehicle.setNumOfDoors(numOfDoors);
				newVehicle.setPrice(price);
				newVehicle.setCondition(condition);
			
			
				vehicles.add(newVehicle);
			} // this curly brace ends the for loop 
			System.out.println(vehicles);
			}  // this curly brace ends the while loop method
				
				
			
			
			
			
			session.setAttribute("vehicles", vehicles);
			
		} // this curly brace ends the try statement
		
		catch(FileNotFoundException e) {
			System.out.println("ERROR READING FROM FILE");
	
		} // this curly brace ends the File Not Found Exception e
		
		
		catch (IOException e) {
			
			e.printStackTrace();
		} // this curly brace ends the IO Exception statement
		
		} //this curly brace ends the if statement



				

			RequestDispatcher rs=request.getRequestDispatcher("NewVehicleList.jsp"); //this takes you to the location.jsp
			rs.forward(request, response);
		
		
	} //this curly brace starts at the start of the method


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

} // this curly brace ends the entire method starting from public class ReadFile extends HttpServlet
