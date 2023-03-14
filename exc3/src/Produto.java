import javax.swing.*;

public class Produto {
    String marca;
    float valor;

    Produto() { }

    public Produto(String marca, float valor) {
        this.marca = marca;
        this.valor = valor;
    }

    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "A marca do produto é: "
                + marca + "\nE o valor do produto é: " + valor);
    }

    float calculoImposto(float p) {
        return valor * p / 100;
    }


}
