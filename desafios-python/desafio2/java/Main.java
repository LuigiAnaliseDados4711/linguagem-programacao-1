// ============================================================
// Desafio 2: Calculadora de Área
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula a área de um retângulo a partir da
//            base e da altura fornecidas pelo usuário.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Função Auxiliar
    // ----------------------------
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // ----------------------------
    // VERSÃO 1: Procedural
    // ----------------------------
    public static void versaoProcedural(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 1 - Procedural");
        System.out.println("========================================");

        System.out.print("Digite a base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("\nArea do retangulo: %.2f%n", area);
    }

    // ----------------------------
    // VERSÃO 2: Modular com Funções
    // ----------------------------
    public static void versaoModular(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 2 - Modular com Funcoes");
        System.out.println("========================================");

        System.out.print("Digite a base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = calcularAreaRetangulo(base, altura);

        System.out.printf("\nArea do retangulo: %.2f%n", area);
    }

    // ----------------------------
    // Programa Principal
    // ----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> DESAFIO 2: Calculadora de Area <<<\n");
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
