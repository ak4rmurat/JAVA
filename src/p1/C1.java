package p1;

public class C1 {

   private int satis;
   protected int toplamSatis;

    public void setSatis(int satis) {
        this.satis = satis;
        this.toplamSatis += satis;
    }

   public int getToplamSatis() {

        return toplamSatis;
    }
    public void yazi(){
        System.out.println("ali");
    }

    public static void main(String[] args) {

    }


}
