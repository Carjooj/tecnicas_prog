import javax.swing.*;

public class Atividade02 {
    public static void main(String[] args) {
        String[] dias = {"no Domingo", " na Segunda-feira", " na Terça-feira", " na Quarta-feira", " na Quinta-feira", "na Sexta-feira", "no Sábado"};
        float[] temp = new float[7];
        float media = 0, soma = 0;
        int diasAcima = 0, diasAbaixo = 0;

        for (int i = 0; i < temp.length; i++) {
            temp[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a temperatura " + dias[i]));

            soma += temp[i];
    }
        media = soma / temp.length;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > media) {
                diasAcima++;
            }
            if (temp[i] < media) {
                diasAbaixo++;
            }
        }
        JOptionPane.showMessageDialog(null, "A média das temperaturas é " + media + "°C");
        JOptionPane.showMessageDialog(null, "A quantidade de dias que a temperatura ficou acima da média é " + diasAcima);
        JOptionPane.showMessageDialog(null, "A quantidade de dias que a temperatura ficou abaixo da média é " + diasAbaixo);

    }
}
