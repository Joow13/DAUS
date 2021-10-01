package set2.MenuExemple;

import java.util.Scanner;

public class MainDaus {
    public static Scanner sc;

    public MainDaus() {
    }

    public static int menu() {
        System.out.println("1- Tirar daus");
        System.out.println("0- Acabar");
        System.out.println("Tria:> ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int tirades = 0;
        int guanyades = 0;
        JocDeDaus joc = new JocDeDaus();

        for(int op = menu(); op != 0; op = menu()) {
            ++tirades;
            boolean b = joc.jugar();
            System.out.println(joc);
            if (b) {
                System.out.println("Has guanyat!");
                ++guanyades;
            }
        }

        System.out.println("has guanyat " + guanyades + " partides");
    }

    static {
        sc = new Scanner(System.in);
    }
}
