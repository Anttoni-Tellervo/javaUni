package ukol3;

import java.util.ArrayList;

public class Room {
	
	private String typeOfRoom;
	private ArrayList<Person> people;
	private ArrayList<Furniture> furnitures;
	private boolean isOpen = true;
	
	public Room(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
		this.people = new ArrayList<Person>();
		this.furnitures = new ArrayList<Furniture>();
	}
	
	public void closeRoom() {
		this.isOpen = false;
	}
	
	public void openRoom() {
		this.isOpen = true;
	}
	
	public void changeOfStateOfRoom() {
		if (this.isOpen) {
			this.closeRoom();
		}else {
			this.openRoom();
		}
	}
	
	public void printRoom() {
		System.out.println("The room is " + this.typeOfRoom + " and it is " + (this.isOpen ? "open." : "closed."));
	}
	
	public void addPersonInRoom(Person person) {
		if(this.isOpen) {
			this.people.add(person);
		}else {
			System.out.println("The room is closed. Nobody can get in.");
		}	
	}
	
	public void removePersonInRoom(Person person) {
		if(this.isOpen) {
			this.people.remove(person);
		}else {
			System.out.println("The room is closed. Nobody can get out.");
		}	
	}
	
	public Person getPersonByName(String name) {
		for (Person person : people) {
			if (person.getName().equals(name)) {
		        return person;
		    }
		}
		return null;
	}
	
	public String getName() {
		return this.typeOfRoom;
	}
	
	public void addFurnitureInRoom(Furniture furniture) {
		this.furnitures.add(furniture);
	}
}
