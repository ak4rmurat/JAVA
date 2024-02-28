package Deneme;

public class testtt {
    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] str2=str.split(" ");
        System.out.println();
        int dolarToplam=0;
        int poundToplam=0;
        //System.out.println(Arrays.toString(str2));
        for (int i = 0; i <str2.length ; i++) {
            if (str2[i].startsWith("$")){
                str2[i]= str2[i].substring(1);
                dolarToplam+=Integer.parseInt(str2[i]);

            } else if (str2[i].startsWith("£")) {
                str2[i]= str2[i].substring(1);
                poundToplam+=Integer.parseInt(str2[i]);
            }
        }
        System.out.println("$ : "+dolarToplam);
        System.out.println("£ : "+poundToplam);

    }
}
