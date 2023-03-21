import javax.swing.*;

public class Teste_switch_mes {
    public static void main(String[] args) {
        int mes;
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do mês"));

        switch (mes) {
            case 1:
                System.out.println("Você selecionou janeiro");
                break;
            case 2:
                System.out.println("Você selecionou fevereiro");
                break;
            case 3:
                System.out.println("Você selecionou março");
                break;
            case 4:
                System.out.println("Você selecionou abril");
                break;
            case 5:
                System.out.println("Você selecionou maio");
                break;
            case 6:
                System.out.println("Você selecionou junho");
                break;
            case 7:
                System.out.println("Você selecionou julho");
                break;
            case 8:
                System.out.println("Você selecionou agosto");
                break;
            case 9:
                System.out.println("Você selecionou setembro");
                break;
            case 10:
                System.out.println("Você selecionou outubro");
                break;
            case 11:
                System.out.println("Você selecionou novembro");
                break;
            case 12:
                System.out.println("Você selecionou Dezembro");
                break;
        }
    }
}
