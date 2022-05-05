

public class CalculadoraShow {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.soma(1,2);
        calc.soma(2.3, 2);

        calc.subtracao(1, 2.7);
        calc.subtracao(2, 2.7);

        calc.multiplicao(1, 5);
        calc.multiplicao(2.5, 2);

        calc.divisao(2,2);
        calc.divisao(10,2);
    }
}
