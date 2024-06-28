package day10_Lists_Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D02_deneme {

    public static void main(String[] args) {
        
        
        isimdondurmeMethod();
        
    }

    public static List<String> isimdondurmeMethod() {

        List<String>isimler=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        String isim="";
        do{

            System.out.println("Lutfen Listeye ekenelecek Ismi giriniz");
            isim= scan.nextLine();
            if (!isim.equalsIgnoreCase("q")) {
                isimler.add(isim);

            }
        }while(!isim.equalsIgnoreCase("q") );

        System.out.println(isimler);

         return isimler;

    }
}
