package ukoly2;

public class Pyramidy {
	private String zaklad = "                 ";
	
	public void nakresli(int type) {
		for(int i=1;i<=9;i++) {
			StringBuilder radek =  new StringBuilder(this.zaklad);
			for(int j=0;j<i*2;j+=2) {
				switch (type) {
					case 1:
						radek.setCharAt(9-i+j, (char)(i + '0'));
					break;
					case 2:
						radek.setCharAt(9-i+j, (char)(j/2 + 1 + '0'));
					break;
					default:
						radek.setCharAt(9-i+j, '*');
					break;
				}
			}
			System.out.println(radek);
		}
	}
	
}
