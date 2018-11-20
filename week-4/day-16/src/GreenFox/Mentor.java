package GreenFox;

public class Mentor extends Person{
    private String level;


    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        level = "Intermediate";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age +" year old " + gender + " " + level + " mentor.");
    }



    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

}
