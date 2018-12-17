package ukol3;

public class Main {

	public static void main(String[] args) {
		House house = new House("Prvního pluku 12");
		house.addRoom("Kanceláø");
		house.changeOwnerName("Vojtìch Komenda");
		house.printInfoAboutHouse();
		
		Person vojta = new Person("Vojtìch Komenda");
		
		Room room = house.getRoomByName("Kanceláø");
		room.addPersonInRoom(vojta);
		room.changeOfStateOfRoom();
		
		Person honza = new Person("Jan Beneš");
		
		room.addPersonInRoom(honza);
		room.removePersonInRoom(vojta);
		room.printRoom();
		room.changeOfStateOfRoom();
		room.addPersonInRoom(honza);
		room.removePersonInRoom(vojta);
		room.printRoom();
		
		Furniture chair = new Furniture("Chair", 11011010);
		chair.makeSeatable();
		chair.printFurnitureInfo();
		
		Person klara = new Person("Klára Stehlíková");
		klara.setGender('F');
		klara.setRandomAge();
		klara.printPersonalInfo();
		
		honza.setRandomAge();
		honza.printPersonalInfo();
		
		vojta.setRandomAge();
		vojta.printPersonalInfo();
		
	}

}
