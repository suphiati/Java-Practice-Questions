package Questions;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz:");
        double not= scanner.nextDouble();

        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else{
            System.out.println("Maalesef kaldin");
        }
    }
}
