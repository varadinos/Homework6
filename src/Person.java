public class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }


    void showPersonInfo() {
        System.out.println("Name: " + name + ", age: " + age + ", is this person male: " + isMan);
    }
}
