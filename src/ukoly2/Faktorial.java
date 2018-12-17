package ukoly2;

public class Faktorial {
	
	public long vypocti(int number) {
	        long vysledek = 1;
	        for (int factor = 2; factor <= number; factor++) {
	            vysledek *= factor;
	        }
	        return vysledek;
	    
	}
}
