import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double consumo;

        consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o consumo de energia em KWh"));

        EnergiaEletrica e01 = new EnergiaEletrica(consumo);
        e01.calcularFornecimento(consumo);


    }
}