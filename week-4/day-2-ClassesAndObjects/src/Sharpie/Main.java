package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie s1 = new Sharpie("Black" ,20);

        System.out.println(s1.inkAmount);

        s1.use();

        System.out.println(s1.inkAmount);








    }
}
