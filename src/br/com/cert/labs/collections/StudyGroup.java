package br.com.cert.labs.collections;

import java.util.TreeSet;

class Person {
	
	private String interest;

	public Person(String interest) {
		this.setInterest(interest);
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
}

class OtherPerson implements Comparable<OtherPerson> {
	
	private String interest;

	public OtherPerson(String interest) {
		this.setInterest(interest);
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public int compareTo(OtherPerson o) {
		return 0;
	}
}

public class StudyGroup {

	String name = "MATH";
	TreeSet<Person> set = new TreeSet<Person>();
	TreeSet<OtherPerson> setO = new TreeSet<OtherPerson>();
	
	public void add(Person p) {
		if (p.getInterest().equals(name)) set.add(p);
	}
	
	public void add(OtherPerson p) {
		if (p.getInterest().equals(name)) setO.add(p);
	}

	public static void main(String[] args) {
		StudyGroup mathGroup1 = new StudyGroup();
		mathGroup1.add(new OtherPerson("MATH"));
		
		StudyGroup mathGroup2 = new StudyGroup();
		mathGroup2.add(new Person("MATH"));
	}
	
}
