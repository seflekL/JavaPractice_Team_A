package day10_Lists_Exceptions;

public class D01_deneme3 {
    public static void main(String[] args) {

        System.out.println(tuzluk3("Duzum guru yanim huru seneredesin gupgupru"));
    }

    public static int tuzluk3(String str) {

        int uzunluk=0;

        String [] strARR=str.split("");
        if (str.equalsIgnoreCase("")){

            uzunluk=0;

        } else {

            for (String eachChracter : strARR) {

                uzunluk++;

            }
        }
        return uzunluk;


    }

}
