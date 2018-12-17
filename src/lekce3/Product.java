package lekce3;

public class Product {
	private int id;
	private String name;
	private int volume;
	private String volumeUnit;
	private float price;
	
	Product(){
		this.id = 10;
	}
	
	Product(int id){
		this.id = id;
	}
	
	
	public Product(int id, String name, int volume, String volumeUnit, float price) {
		super();
		this.id = id;
		this.name = name;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.price = price;
	}
	
	public void printInfoAboutTotalPrice(float totalPrice) {
		System.out.println("Celková cena "+totalPrice);
	}
	
	public float countTotalPrice(int amount) {
		return amount * this.price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getVolumeUnit() {
		return volumeUnit;
	}
	public void setVolumeUnit(String volumeUnit) {
		this.volumeUnit = volumeUnit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}