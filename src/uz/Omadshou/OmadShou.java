package uz.Omadshou;

import java.util.Random;

public class OmadShou {
    public static void main(String[] args) {
        Random random = new Random();

        String kod[] = {"33","88","90","91","93","94","95","97","99"};
        int a = kod.length;
        int b = random.nextInt(a);

        int s = random.nextInt(9);
        int d = random.nextInt(9);
        int f = random.nextInt(9);
        int g = random.nextInt(9);
        int h = random.nextInt(9);
        int j = random.nextInt(9);
        int k = random.nextInt(9);

        System.out.println("Keyingi uyinda +998"+kod[b]+s+d+f+g+h+j+k+" raqam egasi ishtirok etadi ✅");
    }
}
