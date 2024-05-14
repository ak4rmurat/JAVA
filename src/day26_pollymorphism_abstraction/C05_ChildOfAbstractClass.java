package day26_pollymorphism_abstraction;

import java.util.ArrayList;
import java.util.List;

public class C05_ChildOfAbstractClass extends C04_KuralciAbstractParent{

    @Override
    protected void method1() {

    }


    /*
    Class 'C05_ChildOfAbstractClass' must either be declared abstract
    or implement abstract method 'method1()' in 'C04_KuralciAbstractParent'
     */

    public static void main(String[] args) {

        // C04_KuralciAbstractParent obj = new C04_KuralciAbstractParent();

        // C04_KuralciAbstractParent' is abstract; cannot be instantiated
        // Bu class abstracttır.Obje oluşturulamaz.



        /*
        Abstract class'ların constructları vardır ama obje oluşturulamaz.
        Obje oluşturmamız gerektiğinde constructor olarak child class
        construcları kullanılabilir.
         */

        C04_KuralciAbstractParent obj = new C05_ChildOfAbstractClass();

        List<String> isimler = new ArrayList<>();

    }
}
