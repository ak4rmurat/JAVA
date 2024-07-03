package day27_abstractClasses_interfaces;

public abstract class C04_AbstractParent extends C01_AbstractGP{

    

    // Abstract class'ların abstract child class'ları abstract method'ları override etmek
    // ZORUNDA DEĞİLDİR. İsterse override edebilir, istemezse dokunmaz.

    // Concrete bir class'ın concrete bir child'ı gibi davranır.






    public void method7(){
        System.out.println("Abstract parent method7");
    }


    C05_ChildOfAbstractParent araba = new C05_ChildOfAbstractParent() {

        @Override
        public void method1() {
            System.out.println("method1");
        }


        @Override
        public void method3() {

        }

        @Override
        public void method6() {

        }
    };

    public abstract void method6();




}
