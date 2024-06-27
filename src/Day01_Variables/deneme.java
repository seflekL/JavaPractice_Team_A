package Day01_Variables;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        // 7- Kullanicidan sicakligi Fahrenheit olarak alip celcius karsiligini yazdirin.
        //	  formul :  c = (f-32) * 5 / 9


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen sicakligi  F girin sance C yapayim");

        int derece= scan.nextInt();

        int fdeger= (derece -32 * 5  / 9);

        System.out.println(fdeger+"F");
    }

    }
