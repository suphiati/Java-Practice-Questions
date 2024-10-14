package Questions;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        // Kullanicidan artik yil olup olmadigini kontrol
        //etmek icin yil girmesini isteyin.
        //Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        //Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        //Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
        // sadece 400’un kati olan yillar artik yildir

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz");
        int yil= scanner.nextInt();

        if (yil%4!=0){
            System.out.println("Girilen "+yil+" yili artık yil degil");
        } else if (yil%100!=0) {
            System.out.println("Girilen "+yil+" yili artık yil");

        } else if (yil%400==0) {
            System.out.println("Girilen "+yil+" yili artık yil");
        }else {
            System.out.println("Girilen "+yil+" yili artık yil degil");
        }
    }
}
