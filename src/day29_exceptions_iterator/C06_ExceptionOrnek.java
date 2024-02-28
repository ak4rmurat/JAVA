package day29_exceptions_iterator;

import java.util.Scanner;

public class C06_ExceptionOrnek {

    public static void main(String[] args) {

        // Kullanıcıdan notunu isteyip geçtin veya kaldın yazıdırın.Kullanıcı geçersiz bir not girerse
        // IllegalArgumentException fırlatın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");
        double not = scanner.nextDouble();

        if (not < 0 || not >100){
            throw new RuntimeException("Geçersiz not");
        } else if (not < 50) {
            System.out.println("Kaldın");
        }else {
            System.out.println("Geçtin");
        }
    }
}
