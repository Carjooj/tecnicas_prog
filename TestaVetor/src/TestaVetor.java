import javax.swing.*;
public class TestaVetor {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        int indice;

        try {
            vetor.adicionar("aff0");
            vetor.adicionar("aff1");
            vetor.adicionar("aff2");
            vetor.adicionar("aff3");
            vetor.adicionar("aff4");
            vetor.adicionar("aff5");
            vetor.adicionar("aff6");
            vetor.adicionar("aff7");
            vetor.adicionar("aff8");
            vetor.adicionar("aff9");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());


        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca(1));

        System.out.println(vetor.busca1("Aff1"));
        System.out.println(vetor.busca1("Aff2"));

        int j = vetor.tamanho();
        for (int i = 0; i < j; i++) {
            vetor.remove(0);
        }

        char l = 65;
        System.out.println(l);
        System.out.println(vetor.toString());




    }
}
