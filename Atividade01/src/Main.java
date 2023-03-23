import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculo calculo01 = new Calculo();
        double consumo;

        consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o consumo de energia em KWh"));

        JOptionPane.showMessageDialog(null, calculo01.calculo(consumo));


    }
}