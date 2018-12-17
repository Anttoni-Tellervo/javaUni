package ukol3;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Person {
	private int age;
	private char gender = 'M';
	private int personalId;
	private String name;
	private static final AtomicInteger nextId = new AtomicInteger(0);
	
	
	public Person(String name) {
		this.name = name;
		this.personalId = nextId.incrementAndGet();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRandomAge() {
		Random rand = new Random();
		this.age = rand.nextInt(40) + 20;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void printPersonalInfo() {
		System.out.println("Person with id " + this.personalId + " has name " + this.name + " his/her gender is " + this.gender + " and his/her age is " + this.age + "."); //jo, her/his by šlo udìlat pomocí ? :
	}
	
	
}
