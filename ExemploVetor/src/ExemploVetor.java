import javax.swing.*;

public class ExemploVetor {
    public static void main(String[] args) {
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        float[] temp = new float[7];
        float media = 0, soma = 0, diasAcima, diasAbaixo;

        for (int i = 0; i < temp.length; i++) {
            temp[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a temperatura na " + dias[i]));

            soma += temp[i];
    }
        media = soma / temp.length;

        for (int i = 0; i < temp.length; i++) {

        }

        /*float[] nota = new float[10];
        String[] nome = new String[10];
        float soma = 0, media;

        for (int i = 0; i < 10; i++) {
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do " + (i+1) + "° aluno");

            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome[i]));

            soma += nota[i];
        }
        media = soma / 10;
        for (int i = 0; i < 10; i++) {
            if (nota[i] > media) {
                System.out.println("Parabéns " + nome[i]);
            }
        }*/

/*
        final int tamanho = 30;
        int vetorNumeros[] = new int [tamanho];

        for (int indice = 0; indice < tamanho; indice++) {
            vetorNumeros[indice] = indice + 10;

            if (vetorNumeros[indice] % 2 == 0) {
                switch (vetorNumeros[indice]) {
                    case 20:
                        System.out.println("Vinte");
                        break;
                    case 30:
                        System.out.println("Trinta");
                        break;
                    default:
                        System.out.println(vetorNumeros[indice] + " ");
                        break;
                }
            }
        }
*/
    }
}
