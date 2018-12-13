package Clonable;

public class Student extends Person implements Cloneable{
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student() {
        super();
        skippedDays = 0;
    }
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");

    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }



}
