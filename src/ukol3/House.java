package ukol3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class House {
	private String ownerName;
	private String address;
	private ArrayList<Room> rooms;
	private int houseNumber;
	private static final AtomicInteger nextId = new AtomicInteger(0);
	
	public House(String address) {
		this.address = address;
		this.houseNumber = nextId.incrementAndGet();
		rooms = new ArrayList<Room>();
	}
		
	public void changeOwnerName(String name) {
		this.ownerName = name;
	}
	
	public void addRoom(String name) {
		Room room = new Room(name);
		rooms.add(room);
	}
	
	public void printInfoAboutHouse() {
		System.out.println("House number "+ this.houseNumber +" address is " + this.address + " and owner is " + this.ownerName);
	}
	
	public Room getRoomByName(String name) {
		for (Room room : rooms) {
			if (room.getName().equals(name)) {
		        return room;
		    }
		}
		return null;
	}
	
}
