package Questions;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi= scanner.nextInt();

        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }
        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }
    }
}
