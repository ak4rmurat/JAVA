package Deneme;

public class Constructor {
    String isim = "John Doe";
    int yas = 40;
    public Constructor(){
        isim = "Seher";
        yas = 38;
    }
    public Constructor(String isim, int yas){
        this.isim = isim;
        yas = yas +2;
    }

    public static void main(String[] args) {

        Constructor obj1 = new Constructor();
        System.out.println("obj1'in ismi : " + obj1.isim + " obj1'nin yasi :" + obj1.yas);
        Constructor obj2 = new Constructor("Fatih", 35);

        System.out.println("obj2'in ismi : " + obj2.isim + " obj2'nin ismi :" + obj2.yas);

    }
    public  void method1(){
        yas++;
    }
    public  void method2(){
        yas+=5;
    }


}
