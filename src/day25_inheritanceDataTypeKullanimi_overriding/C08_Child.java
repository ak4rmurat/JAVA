package day25_inheritanceDataTypeKullanimi_overriding;

import java.util.Arrays;

public class C08_Child extends C07_Parent {

    /*
        Biz aynı class'da aynı signature'e sahip iki method oluşturamayız
        Override edebilmek için ;
            - Methodların Child class'ta olması
            - Parent class'taki method ile aynı signature'e sahip olması
            gereklidir
     */

    public void method1(int a) { // method1 int

    }

    public void method2() {

        /*
            Overriding yaparken esas olan signature'in aynı olmasıdır.
            Ancak signature'e dahil olmayan returnType'ı ve access
            modifier için de kurallar vardır.

         */

    }

    @Override
    public void method3() {
       /*
         @Override notasyonunu kullanmak mecburi degildir
         Ancak kullanmak faydalidir
         @Override parent class'daki override edilen method'u takip eder
         ve method silinir veya siganature'i degistirilirse
         CTE verir
         Bu notasyon kullanilmadiysa,
         overriding method, overridden method'u takip etmez
         silinir veya signature'i degistirilirse
         override etmeden yoluna devam eder
        */
    }

    @Override
    public void method4() {
        super.method4();
       /*
        Normal sartlarda
        overriding method ve overridden method'dan sadece biri calisir
        Ama yazdigimiz kod geregi ikisinin de calismasini istersek
        child class'da super.method4(); yazabilirsiniz
        */
    }

    @Override
    protected void method13() {
        super.method13();
        System.out.println("child method13");
    }

    public static void method5() {
        /*
            Static method'lar override edilemez.Biz manuel olarak aynısını
            yazsaktda Java bunları Override olarak kabul etmez. Birbiriyle
            ilgisi olmayan iki farklı method olarak kabul eder
         */
    }

    public final void method6() {
        /*
        Override method is final;
        Final method, override edilemeyen method demektir.Signature'si
        aynı olan bir method yazsakda Java CTE verir ve final method
        override edilemez diye bizi uyarır.
         */
    }

    private void method7() {
        /*
            Parent class'da olsa Private class üyelerine başka class'dan
            ulaşmak mümkün olmadığı için biz aynı method'u child class'da
            oluştursak da bunları bağımsız method'lar kabul eder override
            olarak ilişkilendirilemez.
         */
    }

    public void method8() {
        /*
         Child class'daki overriding method'un acces modifier'ı parent
         class'daki overridden method'un acces modifier'ından daha
         kısıtlayıcı olamaz.
         Çocuk babayı kısıtlayamaz.

         Yani genel olarak parent class için methodun acces modifier'ı
         neyse child class'ın acces modifier'ı aynı veya daha geniş bir
         seçim olabilir
                 1 - Private
                 2 - Default
                 3 - Protected
                 4 - Public
          Overridden default acces modifier olduğundan child default,
          protected veya public olabilir.Fakat daha dar olan private
          olamaz CTE verir.

         */
    }

    public int method9() {
        /*
           Overridden method'un return type'ı primitive veya void ise
           overriding method'da aynı olmalıdır.

         */
        return 0;
    }

    public void method10() {

    }

    @Override
    public void method12() {
        super.method12();
        System.out.println("Child method12 çalıştı.");
    }

    public String method11() {
        
        /*
            Return type'ı non-primitive ise ;
            Child class'daki method return type'ı ya Parent class'daki
            methodun return type'ı ile aynı olmalıdır. Ya da Onun child'ı
            olmalıdır.

            Buna;
            COVARİANT DATA TÜRÜ denir.

            BU SADECE STRİNG'E AİT BİR DURUMDUR.
         */
        return "";
    }


    public static void main(String[] args) {
        C08_Child child = new C08_Child();

        child.method13();
    }
    public void method14(){

    }



}
