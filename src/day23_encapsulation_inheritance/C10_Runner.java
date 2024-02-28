package day23_encapsulation_inheritance;

public class C10_Runner {

    public static void main(String[] args) {

        C08_Toyota corolla1 = new C09_Corolla();

        System.out.println(corolla1.getKasa());

        System.out.println(corolla1.marka); // toyota
        System.out.println(corolla1.motor); // Toyota cevreci motor kullanir
        System.out.println(corolla1.guvenlik);  // Toyota guvenlik standardi uygulanir

        System.out.println(corolla1.model);  // Model belirtilmedi
        System.out.println(corolla1.sanzuman); // Sanzuman secilmed
        System.out.println(corolla1.lastik);  // toyota pirelli lastik kullanir
       //System.out.println(corolla1.uretimYeri);
       //System.out.println(corolla1.fren);
       //System.out.println(corolla1.aku);
    }
}
