public class Triangulo {
    float base;
    float altura;

    public Triangulo() { }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    float calculoArea() {
        return base * altura / 2;
    }

    String imprimeDados() {
        return "A base é: " + base + "\nE a altura é: " + altura;
    }
}
