package set2.MenuExemple;

public class Dau {
        private int valor;

        public Dau() {
        }

        public int getValor() {
            return this.valor;
        }

        public int tirar() {
            this.valor = (int)(Math.random() * 6.0D) + 1;
            return this.valor;
        }

        public String toString() {
            return "Dau{valor=" + this.valor + '}';
        }
}
