package lekce3;

public class Runner {

	public static void main(String[] args) {
		Product kofila = new Product();
		System.out.println(kofila.getId());
		
		Product tycinka = new Product(5, "Tyèinka",35,"g",10.9f);
		System.out.println(tycinka.getId());
		
		Product chleba = new Product(3, "Chleba",3500,"g",99.9f);
		System.out.println("Tvùj výrobek má id" +  chleba.getId() + " jméno " + chleba.getName() + " objem " + chleba.getVolume() + chleba.getVolumeUnit() + " za cenu " + chleba.getPrice());
		
		int pocet=5;
		
		float sum = chleba.countTotalPrice(pocet);
		System.out.println("Celková cena "+sum);
		
		chleba.printInfoAboutTotalPrice(chleba.countTotalPrice(pocet)); //takto radìji ne
		
		System.out.println(chleba);
		
		
	}

}
