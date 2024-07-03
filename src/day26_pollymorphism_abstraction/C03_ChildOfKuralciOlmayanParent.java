package day26_pollymorphism_abstraction;

public class C03_ChildOfKuralciOlmayanParent extends C02_KuralciOlmayanParent{
    /*
        Normal bir parent-child ilişkisinde
        KRAL Child Class'ıdır.
        Chlid Class, Parent class'daki method'lardan
            - istediğini direk parent class'dan kullanır.
            - istediğini override eder yani güncelleyip kullanır.
            - isterse de parent class'da olmayan yeni methodlar ekleyebilir.

     */

    @Override
    protected void method1() {
        System.out.println("method1");
    }
    protected void method2(){
        method1();
    }

    public static void main(String[] args) {




    }

    public static void method4(){

    }

}
