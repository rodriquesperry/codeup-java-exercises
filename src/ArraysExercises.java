import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] peoplePlusOne = Arrays.copyOf(people, people.length + 1);
        peoplePlusOne[people.length] = new Person(person.getName());
        System.out.println("peoplePlusOne.length = " + peoplePlusOne.length);

        for (Person person1 : peoplePlusOne) {
            System.out.println("person1.getName() = " + person1.getName());
        }
        return peoplePlusOne;
    }

    public static void main(String[] args) {
//What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        //returns "[I@4617c264"- need to use toString in order to access the element

//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] people = new Person[3];
        people[0] = new Person("Rodriques");
        people[1] = new Person("Richard");
        people[2] = new Person("Logan");

        for (Person person : people) {
            System.out.println(person.getName());
        }

//Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        addPerson(people, new Person("Alejandro"));


    }
}
