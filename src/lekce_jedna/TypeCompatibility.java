package lekce_jedna;

public class TypeCompatibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deset = 10;
		int osm = 8;
		
		int vysledekJedna = deset / osm;
		float vysledekDva =  (float) deset /  osm; //1.25f - musim doplnit f, pokud chci float an e double
		double vysledekTri =  (double) deset / osm;
		
		System.out.println(vysledekJedna);
		System.out.println(vysledekDva);
		System.out.println(vysledekTri);

	}

}
