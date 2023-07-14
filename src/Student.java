public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }


    void showStudentInfo() {
        showPersonInfo();
        System.out.println("Student score: " + score);
    }
}
