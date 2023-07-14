public class Demo {
    public static void main(String[] args) {

        Person[] people = new Person[10];

        Person person1 = new Person("Ivan", 24, true);
        Person person2 = new Person("Maria", 25, false);

        Employee employee1 = new Employee("Petko", 18, true, 80);
        Employee employee2 = new Employee("Dimitur", 20, true, 150);

        Student student1 = new Student("Lidiya", 24, false, 6.0);
        Student student2 = new Student("Greta", 25, false, 5.49);

        people[0] = person1;
        people[1] = person2;
        people[2] = employee1;
        people[3] = employee2;
        people[4] = student1;
        people[5] = student2;

        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            if (p instanceof Employee) {
                ((Employee) p).showEmployeeInfo();
            } else if (p instanceof Student) {
                ((Student) p).showStudentInfo();
            } else if (p instanceof Person) {
                p.showPersonInfo();
            } else if (p == null) {
                break;
            }
        }

            for (int j = 0; j < people.length; j++) {
                Person person = people[j];
                if (person instanceof Employee) {
                    ((Employee) person).calculateOvertime(2);
                }

            }
            
        }

    }

