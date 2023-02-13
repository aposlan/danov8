package danov8;

import java.util.*;

public class House extends Building {

	private int floors;
	private String ownerName;
	private String phoneNumber;
	private static List<House> houses = new ArrayList<>();

	public House() {

	}

	public House(int height, double area, String address, int floors, String ownerName, String phoneNumber) {
		super(height, area, address);
		this.floors = floors;
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
	}
	
	

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void createHouse() {

		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to input more houses? - ");
		String answer = s.nextLine();
		if (answer.equalsIgnoreCase("yes")) {

			System.out.println("Input house height : ");
			int houseHeight = Integer.parseInt(s.nextLine());
			System.out.println("Input house area : ");
			double houseArea = Double.parseDouble(s.nextLine());
			System.out.println("Input house address : ");
			String houseAddress = s.nextLine();
			System.out.println("Input house floors : ");
			int houseFloors = Integer.parseInt(s.nextLine());
			System.out.println("Input house owner's name : ");
			String houseOwner = s.nextLine();
			System.out.println("Input house owner's phone number : ");
			String houseOwnerPhoneNumber = s.nextLine();

			House.houses.add(new House(houseHeight, houseArea, houseAddress, houseFloors, houseOwner, houseOwnerPhoneNumber));
			
		} else {

		}

	}
	
	public void mostSpaciousHouse() {
		
		House houseCompare1 = new House(0, 0, null, 0, null, null);
		for(House houseCompare2 : House.houses) {
			if(houseCompare2.getFloors() > houseCompare1.getFloors()) {
				houseCompare1 = houseCompare2;
			}
		}
		
	}

}
