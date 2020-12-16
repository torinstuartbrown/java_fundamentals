package labs_examples.datatypes_operators.examples.variables;

public class Person {

    String name;
    int age;
    static int numPersonsCreated;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", numPersonsCreate= " + numPersonsCreated +
                '}';



    }
}
