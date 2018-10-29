public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double massPerHeight = (massInKg / heightInM);

        double BMI = (massPerHeight / heightInM);

        System.out.println(BMI);

        // Print the Body mass index (BMI) based on these values
    }
}