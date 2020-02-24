package com.servlet;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;








@WebServlet("/BuyButton")
public class BuyButton extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BuyButton() {
        super();
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
//		ArrayList<Vehicle> vehicles =  (ArrayList<Vehicle>)session.getAttribute("vehicles");
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		

		/*
		 *  1. create an array (lot) thats filled with cars in inventory file
		 *  2. create a new array (toRemove) all cars except for car with vin that will be purchased
		 *  3. remove  all cars from lot that are in toRemove (use the .removeAll() method)
		 *  4. print car left in lot into file
		 * 
		 */
		
		
		
		
		try {
			final String path = "C:\\Users\\Dragolayr\\Documents\\cardatabase.txt";
			File file = new File(path);
			Scanner scanner = new Scanner(file);
			String line = path.toString();
			
			
			
			while(scanner.hasNextLine()) {
				
				String parsedLine = scanner.nextLine();
				
		    	 
		    	 String [] params = parsedLine.split("\n");
		    
		    	 for(int i = 0; i < params.length; i ++) {
		    		 
		    		 String vehicle = params[i];
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

		 		
		    	 purchasedVes.setVIN(VIN);
		    	 purchasedVes.setYear(year);
		    	 purchasedVes.setMake(make);
		    	 purchasedVes.setModel(model);
		    	 purchasedVes.setMPG(MPG);
		    	 purchasedVes.setNumOfDoors(numOfDoors);
		    	 purchasedVes.setPrice(price);
		    	 purchasedVes.setCondition(condition);
				
				
					vehicles.add(purchasedVes);
					
					
 String vvin = request.getParameter("vehicleVIN");
			    	 
					 for(int j = 0; j < vehicles.size(); j++) {
							Vehicle vehicle1 = vehicles.get(j); //at every position, im getting a vehicle
							if(!vehicle1.getVIN().equalsIgnoreCase(vvin)) { //
								vehicles.remove(j);
								
		//				break;
							}
			   
			    	 }
		    

		    }
			}
			
			
			
			}
		
			catch(FileNotFoundException e) {
				System.out.println("ERROR READING FROM FILE");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		
		    	 
		    	//THIS IS TO REMOVE A VEHICLE FROM THE ARRAY LIST AND FILE
		    
			
			
		
		
		
//**********************************************************************************
//***************************************************************************************
		
		
		

			
			final String path1 = "C:\\Users\\Dragolayr\\Documents\\UpdatedVehicleList.txt";
			
			
//			String fileName = path+VIN+".txt";  //location to save it, name of the file, and type of the file
			try {  // if
//				String list = Arrays.toString(vehicles.toArray()).replace("[", "").replace("]", "");
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(path1, true));
				bw.write(vehicles.toString()); //writes data to the array list. dont add syntax to the logic that adds a new file, cause it will just make a new file for you
				bw.close(); //closes the writer after its done
			}catch (IOException e) {  //else
				System.out.println("ERROR WRITING TO FILE");
			}
		
		
		 
		System.out.println("This is the list after removing vehicles except the purchased vehicle: "+"\n" +vehicles);
	
		
		
		session.setAttribute("vehicles", vehicles);
	
		RequestDispatcher rs=request.getRequestDispatcher("BoughtCar.jsp"); //this takes you to the location.jsp
		rs.forward(request, response);
		
		
	
	

		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
// System.out.println("This is the list after removal: "+"\n" +vehicles);
//Vehicle newVehicle = new Vehicle(make, model, year, mpg, price, numOfDoors, condition, vin);

//vehicles.add(newVehicle);

//System.out.println("This is the list before removal: "+"\n" +vehicles );
