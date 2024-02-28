package day27_abstractClasses_interfaces;

import java.util.ArrayList;
import java.util.List;

public class C13_ChildOfInterfaceIstisna implements C12_InterfaceIstisna{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    public static void main(String[] args) {

        /*
            implement ettiğiniz C12_InterfaceIstisna interface'ine sonradan eklediğimiz
            method4() ve method5()'in body'leri olduğu için override etme mecburiyeti yoktur.

            Interface içinde body'si olan istisnai method'lar oluşturmak için kullandığımız
            default ve static keyword'lerinin farkı o method'lara erişim yöntemindedir.

            Static keyword kullandığımız method'u ClassIsmi.methodIsmi ile çağırabilirken
            Default keyword kullandığımız method'u ise child class içine obje oluşturup
            ulaşabiliriz. Ayrıca C12 bir class olmadığı için interface olduğu için constructor'ı
            bulunmaz bundan dolayı objeyi class üzerinden oluşturmalıyız.

         */
        C12_InterfaceIstisna.method5(); // Interface içindeki static keyword'una sahip istinai method5
        C13_ChildOfInterfaceIstisna obj = new C13_ChildOfInterfaceIstisna();
        obj.method4(); // Interface içindeki default keyword'una sahip istinai method4

        List<String> isimler = new ArrayList<>();

    }
}
