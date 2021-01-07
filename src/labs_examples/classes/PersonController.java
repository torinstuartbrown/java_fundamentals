package labs_examples.classes;

public class PersonController {

    public static void main(String[] args) {

        Person somePerson = new Person();
        Person someOtherPerson = new Person();

        somePerson.age = 36;
        somePerson.height = 75;
        somePerson.name = "Ryan";

        someOtherPerson.age = 33;
        someOtherPerson.height = 65;
        someOtherPerson.name = "Kim";

        System.out.println("The first person is named " + somePerson.name + "he is " + somePerson.height + " inches tall and " + somePerson.age + " years old");
        System.out.println("The secound person is named " + someOtherPerson.name + "she is " + someOtherPerson.height + " inches tall and " + someOtherPerson.age + " years old");

    }
}
