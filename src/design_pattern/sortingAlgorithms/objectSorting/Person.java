package design_pattern.sortingAlgorithms.objectSorting;

/**
 * 
 * @author venka
 * 
 * This class Is-a comparable for a Person. It provides the ability to 
 * sort Person data based on age and name.
 * It sorts based on age and if the age is similar then sorts base on
 * name. Both are ascending and alphabetically respectively
 *   
 */
public class Person implements Comparable<Person> {

	private String name;

	private int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {

		int ret = Integer.compare(this.getAge(), o.getAge());

		if (ret == 0) {
			return this.getName().compareTo(o.getName());
		}

		return ret;
	}

	@Override
	public String toString() {
		return new String("Name: " + this.name + " Age: " + this.age);
	}

}
