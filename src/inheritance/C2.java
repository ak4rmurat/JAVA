package inheritance;

public class C2 extends C1{

    // String marka = "C2 marka";
    String yakit = "C2 yakit";
    String model = "C2 model";
    String yil = "C2 yil";

    C2(){
        System.out.println("C2 parametresiz");
    }
    C2(int a){
        System.out.println("C2 int parametreli");
    }
    C2(String b){
        System.out.println("C2 string parametreli");
    }

    public void method1(){
        System.out.println("C2 method1 calisti");
    }

    public void method6(){
        System.out.println("C2 method6 calisti");
    }

    // public void method2(){
    //     System.out.println("C2 method2 calisti");
    // }

    public void method7(){
        System.out.println("C2 method7 calisti");
    }
}
