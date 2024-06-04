public class FormulasMatematicas {

    public static void main(String[] args) {
        // Supondo que as variáveis já foram declaradas e inicializadas
        double x = 10; // Exemplo de valor para x
        double y = 5;  // Exemplo de valor para y
        double z = 3;  // Exemplo de valor para z

        // a. a = √(x^5 - 6) / 4
        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;

        // b. b = x*y - 6*x
        double b = x * y - 6 * x;
        double s = 0;
        // c. c = 4*c^7 / (z^5) - (s^7)*x^2
        double c = 0;
        c = 4 * Math.pow(c, 7) / (Math.pow(z, 5)) - (Math.pow(s, 7)) * Math.pow(x, 2);

        // d. d = x^4 - (6*x - y^3)
        double d = Math.pow(x, 4) - (6 * x - Math.pow(y, 3));

        // e. e = 1 / (y - 1) / (x - 2*y)
        double e = 1 / (y - 1) / (x - 2 * y);

        // f. f = 7*(c^7*(5 - s^7*Math.sqrt(3*x) - 4))
        double f = 7 * (Math.pow(c, 7) * (5 - Math.pow(s, 7) * Math.sqrt(3 * x) - 4));

        // Exibir os resultados
        System.out.println("a. a = " + a);
        System.out.println("b. b = " + b);
        System.out.println("c. c = " + c);
        System.out.println("d. d = " + d);
        System.out.println("e. e = " + e);
        System.out.println("f. f = " + f);
    }
}