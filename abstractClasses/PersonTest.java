package abstractClasses;
/**
 * This program demonstrates abstract classes.
 * @version 1.01 
 * @author Gxl
*/

public class PersonTest
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];

		//file the people array with student and Employee objects
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");

		//print out name and descriptions of all person objects

		for(Person p: people)
			System.out.println(p.getName() + ", " + p.getDescription());
	}
}
