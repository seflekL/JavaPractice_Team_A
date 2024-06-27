package Day07_whileLoopMethod_Kullanim;

public class C02_UstHesaplamaMethodu {

    public static void main(String[] args) {

        //2-verilen bir sayi icin istenen us degerini hesaplyi yazdiran bir method olusturun

        usYazdir(3,4);
        usYazdir(2,5);
    }

    public static void usYazdir(int sayi,int us){

        int sonuc= 1;

        while (us > 0){

            sonuc *= sayi;

            us--;
        }

        System.out.println("islem sonucu"+" "+ sonuc);
    }
}
