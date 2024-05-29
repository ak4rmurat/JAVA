package day24_inheritance;

public class C05_P extends C04_GP{
    C05_P(){
        super("ali");
        System.out.println("P parametresiz constructor çalıştı");
    }
    C05_P(String s){

        System.out.println("P String parametreli Constructor çalıştı");
    }

    C05_P(int a){

        System.out.println("P İnt parametreli Constructor çalıştı");
    }
}
