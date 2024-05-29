package day26_pollymorphism_abstraction;

public abstract class C04_KuralciAbstractParent {

    /*
        Java Parent class'lardan söz sahibi olması için abstraction'ı geliştirmiştir.

        Buradaki Temel Amaç;
            *   Bir class oluşturduğumuzda, bu class'ı parent edinmek isteyen child
            class'ların parent tarafından belirlenen bazı method'ları override etme
            mecburiyeti olmasını sağlamaktır.

            Buradaki temel amaç;
            Bir class oluşturuduğumuzda, bu class'ı parent edinmek isteyen chlid class'ların
            parent tarafından belirlenen bazı method'ları override etme mecburiyeti olmasını
            sağlamaktır.

            Abstract class'lar bir projede olmak zorunda değildir. Eğer obje oluşturmayacağımız
            ama child class'ların ortak özelliklerini belirleyecek class'lara ihtiyacımız olursa
            Abstract class oluştururuz.

            Abstract olmayan class ve method'ları belirtmek istediğimizde abstract olmayadan
            demek yerine CONCRETE diyebiliriz.

            Abstract aslında somut concrete ise soyut demek.

            Bir class'ın child class'ları belirlenen method'ları override etmeye
            MECBUR BIRAKMASI için;

            1 - Class'ımızı abstract keyword kullanarak abstract class yapmalıyız.

            2 - Child Class'ları override etmeye mecbur bırakacağımız method(lar)'ı
            da abstract keyword kullanarak

            3 - Abstract yapılan method'lar body'siz olurlar. Bu method'ları şu ana
            kadar kullandığımız method'lar gibi değil startları belirleyen bir kural
            cümlesi gibi düşünebiliriz.

            Abstract method'ların body'si olmadığından abstract class'lardan obje
            oluşturulamaz. Bunun yerine abstract method'lara body kazandıran child
            class'ların constructor'ları kullanılabilir.
     */


    // Bu class'ı parent edinenler, method1'i kendilerine uyarlamak zorunda olsun.
    protected abstract void method1();
    // 35. satır diyor ki : Bu class'ı (C04_KuralciAbstractParent)
    // child edinenler bu method'u override etmek zorunda
    protected abstract void method2();

    protected void method3(){

        System.out.println("Parent method3");
    }
}
