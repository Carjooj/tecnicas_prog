public class Fracao {
    double dbn1;
    double dbn2;
    double dbn3;

    public Fracao() {
    }

    public Fracao(double dbn1, double dnb2, double dbn3) {
        this.dbn1 = dbn1;
        this.dbn2 = dnb2;
        this.dbn3 = dbn3;
    }

    boolean verificacao() {
        return dbn1 > dbn2 + dbn3;
    }

    String retorno() {
        if (verificacao()) {
            return "O primeiro é maior que a soma dos dois ultimos";
        }
        else {
            return "O primeiro não é maior que a soma dos dois ultimos";
        }
    }

}
