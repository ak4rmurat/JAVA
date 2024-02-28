package Deneme;

public class C01_Veriler {

    private String isim = "Java Candir";
    private int yapilanSatis ;
    private int yapilanToplamSatis;

    public String getIsim() {
        return isim;
    }

    public int getYapilanToplamSatis() {
        return yapilanToplamSatis ;
    }

    public void setYapilanSatis(int yapilanSatis) {
        this.yapilanSatis =yapilanSatis ;
        yapilanToplamSatis += yapilanSatis;
    }



}
