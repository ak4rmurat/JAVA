package day24_inheritance;

public class C08_Child extends C07_Parent{

    String isim = "Child isim";
    String adres = "Child adres";
    int yas = 20;
    int boy = 180;
    int kilo = 50;

    public void method3(){
        System.out.println("child method3");
    }

    public void method1(){
        System.out.println("Child method1");
    }

    public  void method4(){
        String adres = "method adres";
        int yas = 40;

        method1();
        this.method1();
        super.method1();
        method2(); // Bu class'ta method2 var mı bakar yoksa Parent'a bakar
                    // ve varsa yazdırır => Parent method2 yazdırır.
        System.out.println("==========");
        this.method2(); // Class'a bakacak yoksa Parent class'a bakar varsa
                        // yazdırır. => Parent method2 yazdırır.

        super.method2(); // Direk parent'a gider varsa yazdırır.
                         // Parent method1 yazdırır.
        System.out.println("---------");
        method3(); // Child method3 yazdırır
        this.method3(); // Child method3 yazdırır.
        System.out.println("---------");
        super.method3(); // Parent'ta method3 olmadığı için CTE verir.
                        // Parent'ında GrandParent'i varsa onu kontrol eder
                         // Eğer direk parent'ta bulursa parent'takini
                        // Yoksa grandParent'ı kontrol eder.
        System.out.println("????????????????");
        System.out.println(boy); // 180
        System.out.println(this.boy); // 180
        System.out.println(super.boy); // 10

        System.out.println(kilo);  // 80
        System.out.println(this.kilo); // 80
        System.out.println(super.kilo); // 80


        System.out.println(yas); // 40
        System.out.println(this.yas); // 20
        System.out.println(super.yas); // 10

        System.out.println(adres); // "method adres"
        System.out.println(this.adres); // child adres
         // System.out.println(super.adres); CTE verir çünkü parent'ta yok
        System.out.println("?????????????????????");
        /*
            Java'da herhangi bir scope'da bir variable veya method kullanmak
            isterseniz Java aşağıdaki sıra ile o variable/method'u arar.
                1 - İçinde bulunduğu scope
                2 - Bağlı bulunduğu class
                3 - Extends edildiği parent class

            * Method için bağlı bulunduğu scope'tan değil Class'tan kontrole
              başlar.
         */

    }

    public static void main(String[] args) {
        C07_Parent obj = new C08_Child();
        System.out.println(obj.kilo);


    }
}
