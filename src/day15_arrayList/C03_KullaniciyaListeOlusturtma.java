package day15_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        //        bir method olusturun.

        // System.out.println(isimListesiOlustur());
        // System.out.println(isimDondur());

        for (int i = 3; i < 12 ; i++) {
            if (14 % i == 0){
                break;
            }
            System.out.println("adet");
        }


    }


    public static List<String> isimListesiOlustur(){

        Scanner scanner = new Scanner(System.in);
        List<String> isimlerListesi = new ArrayList<>();
        String girilenIsim = "";

        while (! girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklenmek icin isim girin, bitirmek icin Q'ya basin");
            girilenIsim = scanner.nextLine();

          if (!girilenIsim.equalsIgnoreCase("Q")){
              isimlerListesi.add(girilenIsim);
          }


        }


        return isimlerListesi;

    }

    //Soru 2- Kullanicidan istedigi kadar isim alip,
    //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
    //        bir method olusturun.

    public static List<String> isimDondur(){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true){
            System.out.println("Lütfen listeye eklenmesini istediğiniz ismi girin / Çıkmak için Q'a basın");
            String eklenecekIsim = scanner.nextLine();
            if (eklenecekIsim.equalsIgnoreCase("q")){
                break;
            }else {
                break;
            }
        }
        return list;
    }



















}
