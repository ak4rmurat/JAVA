package day24_inheritance;

public class C04_GP {
    C04_GP(){

        System.out.println("GP parametresiz constructor çalıştı");
    }
    C04_GP(String s){
       this();
        System.out.println("GP String parametreli Constructor çalıştı");
    }

    C04_GP(int a){

        System.out.println("GP İnt parametreli Constructor çalıştı");
    }
}
