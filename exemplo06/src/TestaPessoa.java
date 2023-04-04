import javax.swing.*;

public class TestaPessoa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Fulano", "1234-5678", 125.40f);
        c1.setNome("Cliente1");
        c1.print();
        JOptionPane.showMessageDialog(null, "Juros: " + c1.calculaJuros(1.5f));

        Fornecedor f1 = new Fornecedor("Empresa LL", "7894-5612", 1500.89f);
        f1.calculaImposto(12.5f);
        f1.print();
    }
}
