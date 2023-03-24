public class Calculo {

    double fatorIcms;

    double fatorCofins;

    double fatorPis;

    double consumo;






    String calculo(double c1) {
        consumo = c1;
        double forncecimento = consumo * 0.28172;
        if (c1 <= 200) {
            fatorIcms = 0.136363;
            fatorCofins = 0.0614722;
            fatorPis = 0.013346;

        }
        else {
            fatorIcms = 0.333333;
            fatorCofins = 0.0730751;
            fatorPis = 0.0158651;
        }
        double icms = fatorIcms * forncecimento;
        double cofins = fatorCofins * forncecimento;
        double pisPaesesp = fatorPis * forncecimento;
        double icms_pis = forncecimento * fatorIcms * fatorPis;
        double icms_cofins = forncecimento * fatorIcms * fatorCofins;
        double fatura = (forncecimento + icms + cofins + pisPaesesp + icms_cofins + icms_pis);

        return  "Fornecimento: " + forncecimento +
                "\nFator ICMS: " + fatorIcms +
                "\nFator COFINS: " + fatorCofins +
                "\nFator PIS/PASESP: " + fatorPis +
                "\nICMS: " + icms +
                "\nCOFINS: " + cofins +
                "\nPIS/PASESP: " + pisPaesesp +
                "\nICMS sobre PIS/PASESP: " + icms_pis +
                "\nICMS sobre COFINS: " + icms_cofins +
                "\nFatura: " + fatura;
    }
}
