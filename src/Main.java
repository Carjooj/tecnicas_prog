public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.5f, 3f);
        float area = (t.base * t.altura)/2;
        System.out.println("Área: " + area);

        Data d1 = new Data(2, 9, 2015);
        Data d2 = new Data();
        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);

        ContaCorrente conta = new ContaCorrente("Clodowaldo", 12345.34f, 20000f, 'c');
        ContaCorrente conta1 = new ContaCorrente("Oswaldo", 50125.50f, 'p');
        System.out.println(conta.nome + " " + conta.saldo + " " + conta.limite + " " + conta.tipo);
        System.out.println(conta1.nome + " " + conta1.saldo + " " + conta1.limite + " " + conta1.tipo);
        //
    }
}