import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Boletim aluno01 = new Boletim();

        aluno01.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1"));
        aluno01.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2"));

        aluno01.imprimeBoletim();

    }
}
