package day10_Lists_Exceptions;

public class D01_deneme2 {

    public static void main(String[] args) {

        System.out.println(tuzluk2("Java candir geriside heycandir"));
    }

    public static int tuzluk2(String str) {
        int uzunluk=0;

        String [] strARR=str.split("");

        if (str.equalsIgnoreCase("")){

            uzunluk=0;


        } else {

            for (String eachkarakter : strARR) {

               uzunluk++;

            }
        }
        return uzunluk;
    }
}
