package ukol3;

public class Main {

	public static void main(String[] args) {
		House house = new House("Prvn�ho pluku 12");
		house.addRoom("Kancel��");
		house.changeOwnerName("Vojt�ch Komenda");
		house.printInfoAboutHouse();
		
		Person vojta = new Person("Vojt�ch Komenda");
		
		Room room = house.getRoomByName("Kancel��");
		room.addPersonInRoom(vojta);
		room.changeOfStateOfRoom();
		
		Person honza = new Person("Jan Bene�");
		
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
		
		Person klara = new Person("Kl�ra Stehl�kov�");
		klara.setGender('F');
		klara.setRandomAge();
		klara.printPersonalInfo();
		
		honza.setRandomAge();
		honza.printPersonalInfo();
		
		vojta.setRandomAge();
		vojta.printPersonalInfo();
		
	}

}
