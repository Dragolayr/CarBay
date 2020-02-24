package com.servlet;
public class Vehicle {


	private String make;
	private String model;
	private String year;
	private String MPG;
	private String price;
	private String numOfDoors;
	private String picture;
	private String condition;
	private String pictureCondition;
	private String VIN;
	
	
	public Vehicle() {
		
	}
	
	
	

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}
	public String getPictureCondition() {
		return pictureCondition;
	}
	public void setPictureCondition(String pictureCondition) {
		this.pictureCondition = pictureCondition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMPG() {
		return MPG;
	}


	public void setMPG(String MPG) {
		this.MPG = MPG;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getNumOfDoors() {
		return numOfDoors;
	}


	public void setNumOfDoors(String numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	@Override
public String toString() {
	return make+", "+ model +", "+ year +", "+ MPG +", "+ price+", "+ numOfDoors +", "+ condition +", "+ VIN +"\n";
			
}
	public String formatData() {
		return make+", "+ model +", "+ year +", "+ MPG +", "+ price+", "+ numOfDoors +", "+ condition +", "+ VIN +"\n";
				
	} //







	


	
	
	
}
