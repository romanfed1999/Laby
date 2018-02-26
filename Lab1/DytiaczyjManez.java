package org.lab1.sample;

public class DytiaczyjManez {
	
	private static int totalNumberOf;
	private int numberOf;
	private int price; //price in cents
	private int manufactoringYear;
	private int modelNumber;
	private String brand;
	
	public DytiaczyjManez(){	
	
	}
	
	public DytiaczyjManez(int price, int manufactoringYear, int modelNumber){
		this.setPrice(price);
		this.manufactoringYear = manufactoringYear;
		this.modelNumber = modelNumber;
	}

	public DytiaczyjManez(int price, int manufactoringYear, int modelNumber, int numberOf, String brand){
		this.setPrice(price);
		this.manufactoringYear = manufactoringYear;
		this.modelNumber = modelNumber;
		this.numberOf = numberOf;
		this.brand = brand;
		totalNumberOf += numberOf;
	}
	
	public String toString() {
		return "DytiaczyjManez [numberOf=" + numberOf + ", price=" + price
				+ ", manufactoringYear=" + manufactoringYear + ", modelNumber="
				+ modelNumber + ", brand=" + brand + "]";
	}
	
	public static void printStaticSum(){
		System.out.println("The total amount of all items is " + totalNumberOf + " .");
	}
	
	public void printSum(){
		System.out.println("The total amount of all items is " + totalNumberOf + " .");
	}
	
	public void resetValues(int price, int manufactoringYear, int modelNumber, int numberOf, String brand){
		this.setPrice(price);
		this.manufactoringYear = manufactoringYear;
		this.modelNumber = modelNumber;
		this.numberOf = numberOf;
		this.brand = brand;
	}
	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}

	public int getManufactoringYear() {
		return manufactoringYear;
	}

	public void setManufactoringYear(int manufactoringYear) {
		this.manufactoringYear = manufactoringYear;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
