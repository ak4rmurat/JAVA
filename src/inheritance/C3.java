package inheritance;

public class C3 extends C2{

    // String marka = "C3 marka";
    String lastik = "C3 lastik";
    String renk = "C3 renk";

    C3(){
        System.out.println("C3 parametresiz");
    }
    C3(int a){
        System.out.println("C3 int parametreli");
    }
    C3(String b){
        System.out.println("C3 string parametreli");
    }

    public void method3(){
        System.out.println("C3 method3 calisti");
    }

    public void method2(){
        System.out.println("C3 method2 calisti");
    }


    public static void main(String[] args) {

        C1 obj = new C5();
        obj.method2();


    }
}
