public class TestaVetor {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adicionar("aff1");
            vetor.adicionar("aff2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());

        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca(1));

        System.out.println(vetor.busca(3));



    }
}
