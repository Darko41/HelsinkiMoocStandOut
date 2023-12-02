package phoneSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonDirectory {
	
	private List<Person> people = new ArrayList<>();
	private Map<String, Person> names = new HashMap<>();
	private Map<Set<String>, Person> numbers = new HashMap<>();
	private Map<String, Person> addresses = new HashMap<>();
	
	public void addPerson(Person p) {
		this.people.add(p);
		this.names.put(p.getName(), p);
		this.numbers.put(p.getNumbers(), p);
		this.addresses.put(p.getAddress(), p);
	}
	
	public void addNumber(String name, String number) {
		if (this.names.containsKey(name)) {
			Person p = getPersonByName(name);
			p.addNumber(number);
			this.numbers.put(p.getNumbers(), p);
		}
		else {
			Person p = new Person(name);
			p.addNumber(number);
			this.addPerson(p);
		}
	}
	
	public void addAddress(String name, String street, String city) {
		if (this.names.containsKey(name)) {
			Person p = getPersonByName(name);
			p.addAddress(street, city);
			this.addresses.put(p.getAddress(), p);
		}
		else {
			Person p = new Person(name);
			p.addAddress(street, city);
			this.addPerson(p);
		}
	}
	
	public boolean containsPersonByName(String name) {
		return this.names.containsKey(name);
	}
	
	public boolean containsPersonByNumber(String number) {
		for (Set<String> s : this.numbers.keySet()) {
			if (s.contains(number)) {
				return true;
			}
		}
		return false;
	}
	
	public Person getPersonByName(String name) {
		return this.names.get(name);
	}
	
	public String getNameByNumber(String number) {
		for (Person p : this.people) {
			if (p.getNumbers().contains(number)) {
				return p.getName();
			}
		}
		return "not found";
	}
	
	public void deleteInfoByName(String name) {
		Person p = getPersonByName(name);
		
		this.addresses.remove(p.getAddress());
		this.names.remove(p.getName());
		this.numbers.remove(p.getNumbers());
		this.people.remove(p);
	}
	
	public List<Person> searchPersonByKeyword(String keyword) {
		List<Person> persons = new ArrayList<>();
		
		if (keyword.isEmpty()) {
			return this.people;
		}
		
		for (Person p : this.people) {
			if (p.getName().contains(keyword) || p.getAddress().contains(keyword)) {
				persons.add(p);
			}
			else {
				for (String s : p.getNumbers()) {
					if (s.contains(keyword)) {
						persons.add(p);
					}
				}
			}
		}
		return persons;
	}

}