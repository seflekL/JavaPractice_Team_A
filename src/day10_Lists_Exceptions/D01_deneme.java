package day10_Lists_Exceptions;

public class D01_deneme {

    public static void main(String[] args) {


        System.out.println(tuzluk("Java Candir gerisi heycandir"));

        String str = null;

        System.out.println(tuzluk(""));

        System.out.println(tuzluk("  "));

    }

    public static int tuzluk (String str){
        int tuzluk=0;

      String [] kelimearr=str.split("");
        if (str.equalsIgnoreCase("")){
            tuzluk=0;
        }else {
            for (String eachKarakter : kelimearr) {
                tuzluk++;
            }
        }
       return tuzluk;
    }
}
