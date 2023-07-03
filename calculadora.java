import java.util.Scanner;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void exibirMenu() {
        System.out.println("===Calculadora===");
        System.out.println("Escolha a Operação");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Sair");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = entrada.nextDouble();
                    double resultadoSoma = somar(num1, num2);
                    System.out.println("Resultado: " + resultadoSoma);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double num3 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num4 = entrada.nextDouble();
                    double resultadoSubtrair = subtrair(num3, num4);
                    System.out.println("Resultado: " + resultadoSubtrair);
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    double num5 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num6 = entrada.nextDouble();
                    double resultadoMultiplicar = multiplicar(num5, num6);
                    System.out.println("Resultado: " + resultadoMultiplicar);
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    double num7 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num8 = entrada.nextDouble();
                    double resultadoDividir = dividir(num7, num8);
                    System.out.println("Resultado: " + resultadoDividir);
                    break;

                case 0:
                    sair = true;
                    System.out.println("Encerrar Calculadora.");
                    break;

                default:
                    System.out.println("Comando inválido. Tente novamente.");
                    break;
            }
        }

        entrada.close();
    }
}
