package lekce2;

import java.io.IOException;

public class Game {

	public static void main(String[] args) throws IOException, InterruptedException {
		char spravna = 'k';
		boolean neniKonec = true;
		char keyboardEntry;
		while(neniKonec) {
			System.out.println("Gueas what I mean ");
			do {
			keyboardEntry = (char) System.in.read();
			} while (keyboardEntry == '\n' || keyboardEntry == '\r');
			if(keyboardEntry == spravna) {
				System.out.println("Yes, you got it. I was thinking about " + keyboardEntry);
				neniKonec = false;
			}else {
				System.out.println("No, no try again.");
			}
		}
	}

}