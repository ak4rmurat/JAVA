package day27_abstractClasses_interfaces;

public class C11_ChildOfMultipleParents
        extends C08_Parent
        implements C09_InterfaceParent1, C10_InterfaceParent2{

    @Override
    public void method2() {
        System.out.println("Child class method2");

        // InterfaceParent1 "Mutlaka method2'in olmalı.
        // InterfaceParent2 "Mutlaka method2'in olmalı.

    }
    public void method4(){
        System.out.println("C11_ method4");
    }
    @Override
    public int method3() {

        return 0;
    }

    public static void main(String[] args) {

        C11_ChildOfMultipleParents obj = new C11_ChildOfMultipleParents();

        obj.method1(); // Parent class method1
        obj.method2(); // Child class method2
        // System.out.println(obj.method3()); // 0
        obj.method4();



        System.out.println(C09_InterfaceParent1.sayi); // 20
        System.out.println(C09_InterfaceParent1.sayi); // 30
        System.out.println(yas); // 40
        System.out.println(isim); // Ali


    }
}
