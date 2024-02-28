package Deneme;

public class kelebek {

    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, k, n;

        System.out.print("n sayısını giriniz : ");
        n = kb.nextInt();

        for (i = 1; i <= n; i++){
            if ( i == (n+1)/2)
                for ( k = 1; k <= n; k++)
                    System.out.print("*");
            else if (i <= n/2) {
                for (k = 1; k <= i; k++)
                    System.out.print("*");
                for (k = 1; k <= n - 2*i; k++)
                    System.out.print(" ");
                for ( k = 1; k <= i; k++)
                    System.out.print("*");
            }
            else {
                for (k = 1; k <= n - i + 1; k++)
                    System.out.print("*");
                for ( k = 1; k <= 2 * i - n - 2; k++)
                    System.out.print(" ");
                for (k = 1; k <= n - i + 1; k++)
                    System.out.print("*");
            }

            System.out.println();

        }

    }
}
