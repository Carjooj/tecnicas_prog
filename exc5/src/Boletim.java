import javax.swing.*;

public class Boletim {
    double n1;
    double n2;
    double media;

    public Boletim() {
    }

    public Boletim(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    void imprimeBoletim(){
        calculaMedia();
        JOptionPane.showMessageDialog(null, "Dados do boletim: " +
                "\nNota 1: " + n1 +
                "\nNota 2: " + n2 +
                "\nMedia: " + media +
                "\nConceito: " + verificaConceito());
    }

    void calculaMedia(){
        media = (n1 + n2) / 2;
    }

    String verificaConceito(){
        String conceito="";

        if (media >= 8 && media <= 10) {
                conceito = "A";
        }
        else if (media >= 6) {
            conceito = "B";

        }
        else if (media >= 4) {
            conceito = "C";

        }
        else {
            conceito = "D";
        }
        return conceito;
    }
}
