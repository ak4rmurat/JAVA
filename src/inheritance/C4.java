package inheritance;

public class C4 extends C3{

    String uretimYili = "C4 uretim yili";
    String yakit = "C4 yakit";

    C4(){
        System.out.println("C4 parametresiz");
    }
    C4(int a){
        System.out.println("C4 int parametreli");
    }
    C4(String b){
        System.out.println("C4 string parametreli");
    }

   // public void method2(){
   //     System.out.println("C4 method2 calisti");
   // }

   public void method5(){
       System.out.println("C4 method5 calisti");
   }
}
