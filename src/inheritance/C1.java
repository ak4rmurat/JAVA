package inheritance;

public class C1 {

    String marka = "C1 marka";
    String lastik = "C1 lastik";
    String sunroof = "C1 sunroof";
    C1(){
        System.out.println("C1 parametresiz");
    }
    C1(int a){
        System.out.println("C1 int parametreli");
    }
    C1(String b){
        System.out.println("C1 string parametreli");
    }

    public void method5(){
        System.out.println("C1 method5 calisti");
    }

    public void method6(){
        System.out.println("C1 method6 calisti");
    }

    public void method3(){
        System.out.println("C1 method3 calisti");
    }

    public void method1(){
        System.out.println("C1 method1 calisti");
    }

    public void method8(){
        System.out.println("C1 method8 calisti");
    }

    public void method2(){
        System.out.println("C1 method2 calisti");
    }
}
