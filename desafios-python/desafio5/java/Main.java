// ============================================================
// Desafio 5: Conversor de Temperatura
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Converte uma temperatura de Celsius para
//            Fahrenheit usando a fórmula F = (C × 9/5) + 32
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Função Auxiliar
    // ----------------------------
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // ----------------------------
    // VERSÃO 1: Procedural
    // ----------------------------
    public static void versaoProcedural(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 1 - Procedural");
        System.out.println("========================================");

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.printf("%n%.1f°C  ->  %.1f°F%n", celsius, fahrenheit);
    }

    // ----------------------------
    // VERSÃO 2: Modular com Funções
    // ----------------------------
    public static void versaoModular(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 2 - Modular com Funcoes");
        System.out.println("========================================");

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsiusParaFahrenheit(celsius);

        System.out.printf("%n%.1f°C  ->  %.1f°F%n", celsius, fahrenheit);
    }

    // ----------------------------
    // Programa Principal
    // ----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> DESAFIO 5: Conversor de Temperatura <<<\n");
        System.out.println("Qual versao deseja executar?");
        System.out.println("  1 - Procedural");
        System.out.println("  2 - Modular com Funcoes");
        System.out.print("Escolha (1 ou 2): ");

        int escolha = sc.nextInt();

        if (escolha == 1)
            versaoProcedural(sc);
        else if (escolha == 2)
            versaoModular(sc);
        else {
            System.out.println("Opcao invalida. Executando versao modular por padrao.");
            versaoModular(sc);
        }

        sc.close();
    }
}
