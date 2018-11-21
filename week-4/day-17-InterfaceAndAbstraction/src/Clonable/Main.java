package Clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Student john = new Student("John Doe", 20, "male", "BME");

        try {
            Student johnClone = (Student) john.clone();
            johnClone.introduce();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
