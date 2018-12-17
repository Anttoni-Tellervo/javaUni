package lekce2;

public class Mocnina {

	public static void main(String[] args) {
		int i = 1;
		String cisla = "";
		while(true) {
			if(i*i > 100) {
				break;
			}
			cisla +=  Integer.toString(i) +", ";
			i++;
		}
		cisla = cisla + " ";
		cisla = cisla.replace(",  ", ".");
		System.out.println(cisla);

	}

}
