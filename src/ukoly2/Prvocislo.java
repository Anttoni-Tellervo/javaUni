package ukoly2;

public class Prvocislo {
	
	public void jePrvocislo(int number) {
		Boolean procislo = true;
		String pravda;
		for(int delitel = 2; delitel <= number / 2; delitel++) {
		    if (number % delitel == 0) {
		        procislo = false;
		        break;
		    }
		}
		if(procislo) {
			pravda = "je";
		}else {
			pravda = "neni";
		}
		System.out.println( number +" "+ pravda + " prvoèíslem");
	}
}
