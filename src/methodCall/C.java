package methodCall;

public class C extends p1{

    public void method1(){
        System.out.println("C method1 çalıştı.");
    }


    public static void main(String[] args) {
        p2 obj = new p2();
        obj.islem(5, 6.4);


    }

    public void islem(int a, double b){
        System.out.println(a*b);
    }
}
