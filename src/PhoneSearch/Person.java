package phoneSearch;

import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person> {
	
	private String name;
	private Set<String> numbers;
	private String address = "";
		
	public Person(String name) {
		this.name = name;
		this.numbers = new HashSet<>();
	}
	
	public void addNumber(String number) {
		this.numbers.add(number);
	}
	
	public void addAddress(String street, String city) {
		this.address = street + city;
	}

	public String getName() {
		return this.name;
	}

	public Set<String> getNumbers() {
		return this.numbers;
	}

	public String getAddress() {
		return this.address;
	}
	
	public void printNumbers() {
		for (String s : this.numbers) {
			System.out.println(" " + s);
		}
	}
	
	public void printDetails() {
		if (this.address.isEmpty()) {
			System.out.println("  address unknown");
		}
		else {
			System.out.println("  address: " + this.address);
		}
		if (this.numbers.isEmpty()) {
			System.out.println("  phone number not found");
		}
		else {
			System.out.println("  phone numbers:");
			for (String s : this.numbers) {
				System.out.println("   " + s);
			}
		}
	}
	
	public void printNameAndDetails() {
		System.out.println(" " + this.name);
		printDetails();
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareToIgnoreCase(o.getName());
	}

}
