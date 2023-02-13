package danov8;
import java.util.*;
import java.util.Scanner;

public class Building {

	private int height;
	private double area;
	private String address;
	private static ArrayList<Building> buildings = new ArrayList<>();
	
	public Building() {
		
	}
	
	public Building(int height, double area, String address) {
		this.height = height;
		this.area = area;
		this.address = address;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void createBuilding() {

		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to input more buildings? - ");
		String answer = s.nextLine();
		if (answer.equalsIgnoreCase("yes")) {

			System.out.println("Input building height : ");
			int buildingHeight = Integer.parseInt(s.nextLine());
			System.out.println("Input building area : ");
			double buildingArea = Double.parseDouble(s.nextLine());
			System.out.println("Input building address : ");
			String buildingAddress = s.nextLine();

			Building.buildings.add(new Building(buildingHeight, buildingArea, buildingAddress));
			
		} else {

		}

	}
	
}
