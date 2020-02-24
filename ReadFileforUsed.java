package com.servlet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ReadFileforUsed")
public class ReadFileforUsed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ReadFileforUsed() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);


		ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>)session.getAttribute("vehicles");
		
		
		
		if(vehicles == null) {
			vehicles=new ArrayList<>();

		}
		try {
			final String path = "C:\\Users\\Dragolayr\\Documents\\cardatabase.txt";
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader); //the scanner scans a different location now, different from system.in, because its scanning a file now.
			String line = path.toString(); //designate what the variable will be getting.
			String parsedLine = bufferedReader.readLine();
		
			
			String [] details = parsedLine.split("newnew"); //gets whole list of cars 
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
				
				
				
				
			}
			
//			System.out.println(vehicles);
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("ERROR READING FROM FILE");
		} catch (IOException e) {
			
			e.printStackTrace();
		}




				

			RequestDispatcher rs=request.getRequestDispatcher("UsedVehicleList.jsp"); //this takes you to the location.jsp
			rs.forward(request, response);
		
		
	}
	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
