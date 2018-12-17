package lekce2;

public class Delitel {

	public static void main(String[] args) {
		String answer;
		for(int i = 2; i<= 100;i++) {
			answer = i + " have: ";
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					answer +=  j + " ";
				}		
			}
			System.out.println(answer);
		}
	}

}
