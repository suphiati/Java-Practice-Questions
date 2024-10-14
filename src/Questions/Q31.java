package Questions;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        
        //Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scanner.nextInt();
        
        if (sayi%2!=0){
            if (sayi>=0){
                System.out.println("Girilen sayi pozitif tek sayi");
            }else {
                System.out.println("Girilen sayi negatif tek sayi");
            }
        } else if (sayi%2==0) {
            if (sayi%10==0){
                System.out.println("Girilen sayi 10'un tam kati");
            }else {
                System.out.println("Girilen sayi 10'un tam kati degil");
            }
        }else {
            System.out.println("Yanlis giris yaptinis. Lütfen bir sayi giriniz");
            
        }
    }
}
