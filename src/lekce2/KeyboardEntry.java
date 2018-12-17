package lekce2;

import java.io.IOException;

public class KeyboardEntry {

	public static void main(String[] args) throws IOException {
		System.out.println("Press key and enter ");
		char keyboardEntry = (char) System.in.read();
		System.out.println("you have entered " + keyboardEntry);
	}

}
