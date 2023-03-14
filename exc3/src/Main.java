import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Produto p;
        String marca;
        float valor, valorImp, porc;

        marca = JOptionPane.showInputDialog(null , "Digite a marca do produto");
        valor = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digie o valor do produto"));

        p = new Produto(marca, valor);

        p.imprimeDados();
        porc = Float.parseFloat
                (JOptionPane.showInputDialog(null, "Digite a porcentagem do imposto"));

        valorImp = p.calculoImposto(porc);
        JOptionPane.showMessageDialog(null, "Imposto a pagar: " + valorImp);


    }
}
