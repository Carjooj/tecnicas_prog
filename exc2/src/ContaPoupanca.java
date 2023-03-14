import javax.swing.*;

public class ContaPoupanca {
    //atributos
    String agencia;
    String numero;
    float saldo;
    float taxa;

    public ContaPoupanca() { }

    public ContaPoupanca(String agencia, String numero, float saldo, float taxa) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }

    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Dados da Conta Poupança: " +
                "\nAgência: " + agencia +
                "\nNúmero: " + numero +
                "\nSaldo: " + saldo +
                "\nTaxa: " + taxa);
    }

    void depositar(float valor){
        saldo += valor;
    }

    float calculaRendimento() {
        float rendimento;
        rendimento = saldo * taxa / 100;
        return rendimento;
    }
}
