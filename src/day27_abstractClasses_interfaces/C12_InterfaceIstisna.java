package day27_abstractClasses_interfaces;

public interface C12_InterfaceIstisna {
    /*
        Devam eden projelerde
        Interface'lere sonradan müdahale etmemiz gerektiğinde o interfacfe'i daha önceden kullanan
        Class'larda ciddi problemlere sebep olabilir.

        Java8 ile bu konudaki taleplere istisnai bir çözüm üretmiştir.

        Sonradan eklenen bir method'un
        Child class'lar tarafından implement edilme ZORUNLULUĞU olmaması için
        interface içindeki istisnai method'ların body'li oluşturulabilmesine imkan
        tanıyan 2 keyword tanımlanmıştır.
     */

    void method1();

    void method2();

    int method3();

    public default void method4(){
        // Buradaki default access modifier değildir. Access modifier public'tir. Ve
        // 2 si beraber kullanılamaz.

        // Buradaki kullanım default keyword'un farklı bir kullanımıdır.

        System.out.println("Interface içindeki default keyword'una sahip istinai method4");

    }
    public static void method5(){
        System.out.println("Interface içindeki static keyword'una sahip istinai method5");
    }

}
