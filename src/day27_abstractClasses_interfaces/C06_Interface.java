package day27_abstractClasses_interfaces;

public interface C06_Interface {

    /*
        Interface bir class değildir.
        Full abstraction sağlamak amacıyla oluşturulduğu için tüm methodlar public ve abstract'tır.
        Bu durumda method oluştururken public abstract yazmaya gerek yoktur.

        Interface'lerin Constructor'ları yoktur. Bu yüzden interface'lerde obje oluşturulamaz.

        Tüm variable'lar ise public, static ve final'dir.Final variable değiştirilemeyen variable'dir.

     */

    // int yas;
    /*
        Yukarıdaki örnekte tum variabla'larda olduğu yas variable'ı final'dir. Ve bu variable'a sonradan
        değer atanamaz bundan dolayı CTE verir. Interface'deki butun variable'lara değer atanmaz zorundadır.
        Ayrıca static bir variable olduğu için obje oluşturmadan direkt ulaşılabilir. Çünkü class seviyesinde
        bir variable'dır.
     */

    public static final int sayi = 10; // Method'da olduğu gibi public static final her variable'da default'turç


    public void method1();
    // Modifier 'public' is redundant for interface members
    // Modifier 'abstract' is redundant for interface methods
    void method2();
    void method3();
    void method4();
    int method5();



}
