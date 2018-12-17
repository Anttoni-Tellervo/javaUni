package ukoly2;

import java.util.Scanner;

public class Spustit {

	public static void main(String[] args) {
		Boolean pokracuj = true;
		while(pokracuj) {
			System.out.println("Pøíkazy pro zobrazení úkolu: pyramida1, pyramida2, pyramida3, soucet, faktorial, prvocislo, posloupnost a exit pro ukonceni ");
			Scanner scanner = new Scanner(System. in);
			String inputString = scanner. nextLine();
			switch (inputString) {
			case "pyramida1":
				Pyramidy pyramida = new Pyramidy();
				pyramida.nakresli(1);
				break;
			case "pyramida2":
				Pyramidy pyramida2 = new Pyramidy();
				pyramida2.nakresli(2);
				break;
			case "pyramida3":
				Pyramidy pyramida3 = new Pyramidy();
				pyramida3.nakresli(5);
				break;
			case "soucet":
				while(!inputString.matches("-?\\d+")) {
					System.out.println("Zadej èíslo");
					inputString = scanner. nextLine();
				}
				Soucet soucet = new Soucet();
				soucet.secti(Integer.parseInt(inputString));
				break;
			case "faktorial":
				while(!inputString.matches("-?\\d+")) {
					System.out.println("Zadej èíslo");
					inputString = scanner. nextLine();
				}
				Faktorial faktorial = new Faktorial();
				System.out.println(faktorial.vypocti(Integer.parseInt(inputString)));
				break;
			case "prvocislo":
				while(!inputString.matches("-?\\d+")) {
					System.out.println("Zadej èíslo");
					inputString = scanner. nextLine();
				}
				Prvocislo prvocislo = new Prvocislo();
				prvocislo.jePrvocislo(Integer.parseInt(inputString));
				break;
			case "posloupnost":
				double max = 0;
				int base = 0;
				String vysledek ="";
				while(max <64) {
					max = Math.pow(2,base);
					vysledek += (int)max  + " ";
					base++;
				}
				System.out.println(vysledek);
				break;
			case "exit":
				pokracuj = false;
				break;
			default:
				System.out.println("Zadali jste neplatný pøíkaz, zkuste to znovu.");
				break;
			}
		
		}
	}

}
