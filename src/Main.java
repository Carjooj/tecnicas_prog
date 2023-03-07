import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float ftpreco = 0f;
        String strnome, strmarca = "", strfabricante = "", strcod_barras = "";
        Scanner in = new Scanner(System.in);
        Paciente paciente = new Paciente();


        System.out.println(paciente.nome + " " + paciente.rg + " " + paciente.endereco + " " + paciente.telefone + " " + paciente.dataNascimento + " " + paciente.profissao);

        System.out.println("Digite o nome do paciente");


        strnome = in.nextLine();

        Paciente paciente1 = new Paciente(strnome);

        System.out.println(paciente1.nome + " " + paciente1.rg + " " + paciente1.endereco + " " + paciente1.telefone + " " + paciente1.dataNascimento + " " + paciente1.profissao);


        System.out.println("Digite a marca do produto");
        strmarca = in.nextLine();

        System.out.println("Digite o fabricante");
        strfabricante = in.nextLine();

        System.out.println("Digite o código de barras");
        strcod_barras = in.nextLine();

        System.out.println("Digite o preço");
        ftpreco = in.nextFloat();

        Produto produto = new Produto(strmarca, strfabricante, strcod_barras, ftpreco);

        System.out.println(produto.marca + " " + produto.fabricante + " " + produto.cod_barras + " " + produto.preco);
        //

    }
}