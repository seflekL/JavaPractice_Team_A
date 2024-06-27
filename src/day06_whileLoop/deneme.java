package day06_whileLoop;

import java.util.Scanner;

public class deneme {
    // Kullanicadan poztif bir tam sayi
    //hesaplamk istedi us degerini alip soinucu yazdirin
    //sayi2,us2 use 2*2*2*2
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif sayi girniz ");
        int sayi = scan.nextInt();
        System.out.println("sayinin ustu ka olsun  ");
       int us=scan.nextInt();
         int sonuc=1;

        while (us>0){

            sonuc=sonuc*sayi;
            us--;
            System.out.println("sonucu goreleinm"+sonuc);
        }



    }
}




