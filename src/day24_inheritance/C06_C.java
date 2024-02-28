package day24_inheritance;

public class C06_C extends C05_P {
    C06_C(){

        System.out.println("C parametresiz constructor çalıştı");
    }
  C06_C(String s){

      System.out.println("C String parametreli Constructor çalıştı");
  }

    C06_C(int a){
        super();
        System.out.println("C İnt parametreli Constructor çalıştı");
    }

    public static void main(String[] args) {

         C06_C child2 = new C06_C(1);
        /*
        Ekrana
            C int parametreli
            P parametresiz
            GP string parametreli
            GP parametresiz

         */

        System.out.println("-----------");

        // C06_C child3 = new C06_C("Ali");
        /*
        Ekranda
            GP İnt parametreli Constructor çalıştı
            GP String parametreli Constructor çalıştı
            P İnt parametreli Constructor çalıştı
            C String parametreli Constructor çalıştı

         */


        /*
         1 - Extends keyword kullanan bir class'daki her constructor'un ilk
         satırında MUTLAKA CONSTRUCTOR CALL olmalıdır.

         2 - Eğer görünür bir CONSTRUCTOR CALL yoksa Java Default olarak
         Parametresiz super() [constructor call] koyar
         () ==>> CONSTRUCTOR CALL ANLAMINA GELİYOR.

         3 - Eğer kodu yazan kişi this(ilgiliParamtere) veya
         super(ilgiliParametre) kullanmışsa bir constructor'da sadece bir
         constructor call olacağı için

         */
    }
}
