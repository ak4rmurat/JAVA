package Inglizce;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ingilzce {

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        words.put("Prepare", "Hazırlamak");
        words.put("Home", "Ev");
        words.put("Fire", "Ateş");
        words.put("Next", "İleri");
        words.put("Cry", "Ağlamak");
        words.put("Offer", "Talep");

        // Diğer kelimeleri ekle
        Random random = new Random();
        Object[] keys = words.keySet().toArray();
        Scanner scanner = new Scanner(System.in);
        int dogruSayisi = 0;
        while (dogruSayisi < keys.length) {
            String randomWord;
            do {
                randomWord = (String) keys[random.nextInt(keys.length)];
            } while (!words.containsKey(randomWord));  // Doğru bilinenleri tekrar sorma
            System.out.println("İngilizce kelimeyi Türkçe olarak yazınız: " + randomWord);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(words.get(randomWord))) {
                System.out.println("Doğru!");
                dogruSayisi++;
                words.remove(randomWord);  // Doğru bilindi, listeden kaldır
            }
            System.out.println("Doğru: " + dogruSayisi);
        }
        scanner.close();
    }
}
