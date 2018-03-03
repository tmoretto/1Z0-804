package br.com.cert.labs.collections;

import java.util.LinkedList;
import java.util.Queue;

class PersonH {
	private String name;

	public PersonH(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class Helper {

	public void helpPeople(Queue people, Queue helped) {
		do {
			PersonH p = (PersonH) people.poll();            
			System.out.println("Helped : " + p + " ");             
			helped.offer(p.getName());         
		} while (!people.isEmpty());     
	}      
	
	public static void main(String[] args) {         
		Queue<PersonH> q = new LinkedList<PersonH>();         
		q.offer(new PersonH("Pope"));         
		q.offer(new PersonH("John"));         
		System.out.println(q);
		Queue<PersonH> helpedQ = new LinkedList<PersonH>();        
		Helper h = new Helper();         
		h.helpPeople(q, helpedQ);     
	} 

}