package Questions;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ilk kenar uzunlugunu giriniz:");
        double kenar1= scanner.nextDouble();
        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz:");
        double kenar2= scanner.nextDouble();
        System.out.println("Lütfen ucuncu kenar uzunlugunu giriniz:");
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){

            System.out.println("Eskenar ucgen");
        }
    }
}
