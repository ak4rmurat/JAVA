package inheritance;

public class C5 extends C4{


    String marka = "C5 marka";
    String model = "C5 model";


    C5(){
        System.out.println("C5 parametresiz");
    }
    C5(int a){
        System.out.println("C5 int parametreli");
    }
    C5(String b){
        System.out.println("C5 string parametreli");
    }

    public void method1(){
        System.out.println("C5 method1 calisti");
    }

    public void method3(){
        System.out.println("C5 method3 calisti");
    }

    public void method4(){
        System.out.println("C5 method4 calisti");
    }
}
