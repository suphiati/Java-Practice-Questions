package Questions;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Cemberin yaricapini giriniz");
        double yaricap= scanner.nextDouble();
        double pi= 3.14;
        double cemberCevre= 2*pi*yaricap;
        double cemberAlan=pi*yaricap*yaricap;

        System.out.println("Cemberin Cevresi: "+cemberCevre);
        System.out.println("Cemberin Alani: "+cemberAlan);
    }
}
