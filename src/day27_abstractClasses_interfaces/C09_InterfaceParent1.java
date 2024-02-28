package day27_abstractClasses_interfaces;

public interface C09_InterfaceParent1 {

    int sayi = 20;
    String isim = "Ali";

    void method1();

    void method2();

    public default void method4(){
        System.out.println("C09 interface parent1");

    }

}
