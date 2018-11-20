package GreenFox;

public class Person {
    protected String name;
    protected int age;
    protected String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public void introduce() {

        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

//    public final void printGender() {
//        System.out.println(gender.name().toLowerCase());
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
}
