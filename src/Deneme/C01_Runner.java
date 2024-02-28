package Deneme;

public class C01_Runner {

    public static void main(String[] args) {

        // isim variable sadece okunabilsin
        // yapilanSatisa değer atanabilsin
        // toplam satış sadece yazdırılabilsin

        C01_Veriler obj = new C01_Veriler();

        System.out.println(obj.getIsim());

        obj.setYapilanSatis(10);
        obj.setYapilanSatis(25);
        obj.setYapilanSatis(30);

        System.out.println(obj.getYapilanToplamSatis());
    }



}
