package day27_abstractClasses_interfaces;

public abstract class C04_AbstractParent extends C01_AbstractGP{

    

    // Abstract class'ların abstract child class'ları abstract method'ları override etmek
    // ZORUNDA DEĞİLDİR. İsterse override edebilir, istemezse dokunmaz.

    // Concrete bir class'ın concrete bir child'ı gibi davranır.

    public abstract void method1();

    public void method2(){

        System.out.println("Abstract parent method2");
    }

    public abstract void method3();

    public abstract void method6();

    public void method7(){
        System.out.println("Abstract parent method7");
    }


    C04_AbstractParent araba = new C04_AbstractParent() {
        @Override
        public void method1() {

        }

        @Override
        public void method3() {

        }

        @Override
        public void method6() {

        }
    };
}
