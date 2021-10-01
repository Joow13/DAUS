package set2.MenuExemple;

import java.util.Arrays;import java.util.Arrays;

public class JocDeDaus {
    Dau[] dau = new Dau[3];

    public JocDeDaus() {
        this.dau[0] = new Dau();
        this.dau[1] = new Dau();
        this.dau[2] = new Dau();
    }

    public boolean jugar() {
        int a = this.dau[0].tirar();
        int b = this.dau[1].tirar();
        int c = this.dau[2].tirar();
        return a == b && b == c;
    }

    public String toString() {
        return "JocDeDaus{dau=" + Arrays.toString(this.dau) + '}';
    }
}
