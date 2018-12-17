package ukol3;

public class Furniture {
	private String name;
	private boolean haveSpace;
	private boolean isSeatable;
	private int evidenceId;
	
	public Furniture(String name, int evidenceId) {
		this.evidenceId = evidenceId;
		this.name = name;
	}
	
	public void makeSeatable() {
		this.isSeatable = true;
	}
	
	public void makeSpaceous() {
		this.haveSpace = true;
	}
	
	public void printFurnitureInfo() {
		System.out.println("Furniture name is " + this.name + " and its evidence number is " + this.evidenceId);
	}
	
	public boolean isSeateble() {
		return this.isSeatable;
	}
	
	public boolean hasSpace() {
		return this.haveSpace;
	}
	
	
}
