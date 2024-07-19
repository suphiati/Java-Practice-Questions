package Questions;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");

        char harf= scanner.next().charAt(0);

        char harf1= (char) (harf+1);
        char harf2= (char) (harf+2);
        char harf3= (char) (harf+3);

        System.out.println(harf+"' inden sonraki 3 harf sırasıyla: "+harf1+", "+harf2+", "+harf3);
    }
}
