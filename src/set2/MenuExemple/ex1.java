package set2.MenuExemple;

import java.util.Scanner;

public class ex1 {
    public ex1() {
    }

    public static void main(String[] args) {
        int[] freq = new int[12];
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes vegades vols llançar els daus? ");
        int tirades = sc.nextInt();

        int d1;
        for(d1 = 0; d1 < 12; ++d1) {
            freq[d1] = 0;
        }

        System.out.println("Llançament...");

        int i;
        for(i = 0; i < tirades; ++i) {
            d1 = (int)(Math.random() * 6.0D) + 1;
            int d2 = (int)(Math.random() * 6.0D) + 1;
            ++freq[d1 + d2 - 1];
        }

        System.out.println("Resultat");

        for(i = 1; i < 12; ++i) {
            System.out.println(i + 1 + " -->\t" + freq[i] + " vegades");
        }

    }
}