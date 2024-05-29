package tekrar;

public class getsetdeneme {


    public static void main(String[] args) {

        getsetClass obj = new getsetClass();
        System.out.println(obj.getAB());
        obj.setA(10,2);
        System.out.println(obj.getAB());
        obj.setA(5,8);
        System.out.println(obj.getAB());
    }
}
