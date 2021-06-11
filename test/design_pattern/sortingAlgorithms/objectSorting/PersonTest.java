package design_pattern.sortingAlgorithms.objectSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	List<Person> listPerson = new ArrayList<>();
	@Before
	public void setUp() throws Exception {
		Person p1 = new Person("P1", 20);
		Person p2 = new Person("P2", 21);
		Person p3 = new Person("P1", 20);
		Person p4 = new Person("P1", 18);
		Person p5 = new Person("P2", 20);

		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);
		listPerson.add(p4);
		listPerson.add(p5);
	}

	@Test
	public void test() {
		Collections.sort(listPerson);
		
		for(Person p : listPerson)
			System.out.println(p);
	}

}
