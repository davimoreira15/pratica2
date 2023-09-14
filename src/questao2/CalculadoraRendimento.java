package questao2;

import java.util.Scanner;

public class CalculadoraRendimento {

    private double investimentoInicial;
    private double taxaMensal;
    private int numeroMeses;


    public CalculadoraRendimento(double investimentoInicial, double taxaMensal, int numeroMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal;
        this.numeroMeses = numeroMeses;
    }


    public void calcularRendimento() {
        double rendimento = investimentoInicial * Math.pow(1 + taxaMensal, numeroMeses) - investimentoInicial;
        System.out.println("O rendimento após " + numeroMeses + " meses será de: " + rendimento);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o investimento inicial: ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de rendimento mensal (em decimal): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Digite o número de meses: ");
        int numeroMeses = scanner.nextInt();


        CalculadoraRendimento calculadora = new CalculadoraRendimento(investimentoInicial, taxaMensal, numeroMeses);


        calculadora.calcularRendimento();


        scanner.close();
    }
}

