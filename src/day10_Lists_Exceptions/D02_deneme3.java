package day10_Lists_Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D02_deneme3 {

    public static void main(String[] args) {

        kirkir();
    }

    public static List<String> kirkir() {
        List<String> isimler=new ArrayList<>();
        String isim=null;
        do {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz cikmak icinde Q harfine basiniz");
        isim= scan.nextLine();

        if (!isim.equalsIgnoreCase("q")){
            isimler.add(isim);
        }
        }while (!isim.equalsIgnoreCase("q"));
        System.out.println(isimler);
    return isimler;
}
}