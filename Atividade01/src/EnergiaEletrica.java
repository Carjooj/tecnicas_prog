import javax.swing.*;

public class EnergiaEletrica {
    private double consumo, forncecimento, icms, confins, pispasesp,
    icmscofins, icmspispasesp, fatura;

    public EnergiaEletrica (double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getForncecimento() {
        return forncecimento;
    }

    public void setForncecimento(double forncecimento) {
        this.forncecimento = forncecimento;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getConfins() {
        return confins;
    }

    public void setConfins(double confins) {
        this.confins = confins;
    }

    public double getPispasesp() {
        return pispasesp;
    }

    public void setPispasesp(double pispasesp) {
        this.pispasesp = pispasesp;
    }

    public double getIcmscofins() {
        return icmscofins;
    }

    public void setIcmscofins(double icmscofins) {
        this.icmscofins = icmscofins;
    }

    public double getIcmspispasesp() {
        return icmspispasesp;
    }

    public void setIcmspispasesp(double icmspispasesp) {
        this.icmspispasesp = icmspispasesp;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }

    public void calcularFornecimento (double consumo) {
        this.setForncecimento(consumo * 0.28172);

        if (consumo <= 200) {
            this.setIcms(forncecimento * 0.136363);
            this.setConfins(forncecimento * 0.0614722);
            this.setPispasesp(forncecimento * 0.013346);
            this.setIcmscofins(forncecimento * 0.0614722 * 0.0136363);
            this.setIcmspispasesp(forncecimento * 0.013346 * 0.0136363);
        }
        else {
            this.setIcms(forncecimento * 0.333333);
            this.setConfins(forncecimento * 0.0730751);
            this.setPispasesp(forncecimento * 0.0158651);
            this.setIcmscofins(forncecimento * 0.0730751 * 0.333333);
            this.setIcmspispasesp(forncecimento * 0.0158651 * 0.333333);
        }
        this.setFatura(forncecimento + icms + confins + pispasesp + icmscofins + icmspispasesp);

        String mensagem = "Fornecimento: " + getForncecimento() +
                "\nICMS: " + getIcms() +
                "\nCOFINS: " + getConfins() +
                "\nPIS/PASESP: " + getPispasesp() +
                "\nICMS sobre PIS/PASESP: " + getIcmspispasesp() +
                "\nICMS sobre COFINS: " + getIcmscofins() +
                "\nFatura: " + getFatura();
        JOptionPane.showMessageDialog(null, mensagem);
    }

    /*
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
*/
}
