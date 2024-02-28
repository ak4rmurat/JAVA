package day27_abstractClasses_interfaces;

public class C07_ChildOfInterface implements C06_Interface{

    /*
        Bir class'ı bir interface'e child yapmak istersen EXTENDS yerine IMPLEMENTS kullanmalıyız.

     */
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public int method5() {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(sayi);

        // sayi = 20; ==> Cannot assign a value to final variable 'sayi'
        // final variable'a daha sonradan değer atanamaz. Değiştirilmesi istenmeyen variable için kullanılır.

        System.out.println(Math.PI); // değiştirilemeyen yani final variable'lar buyuk harfle yazılır.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
