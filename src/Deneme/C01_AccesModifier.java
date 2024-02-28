package Deneme;

public class C01_AccesModifier {
    private int satis ;

    private int toplamSatis ;

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis += satis;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }
}
