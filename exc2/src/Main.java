import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp;

        float valorDep, rend, saldo, taxa;
        String agencia, num;

        agencia = JOptionPane.showInputDialog(null, "Digite o número da agência");
        num = JOptionPane.showInputDialog(null, "Digite o número da conta poupança");
        saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o saldo"));
        taxa = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a taxa de juros"));

        cp = new ContaPoupanca(agencia, num, saldo, taxa);

        cp.imprimeDados();
        rend = cp.calculaRendimento();
        JOptionPane.showMessageDialog(null, "O rendimento é: " + rend);
        valorDep = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digite o valor a ser depositado"));
        cp.depositar(valorDep);
        cp.imprimeDados();
    }
}
