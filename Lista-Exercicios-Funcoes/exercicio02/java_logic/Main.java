// ============================================================
// Exercício 2: Calculadora de Área
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula a área de um retângulo a partir da
//            base e da altura fornecidas pelo usuário.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 2: Calculadora de Área <<<\n");
        System.out.println("Qual versão deseja executar?");
        System.out.println("  1 - Procedural");
        System.out.println("  2 - Modular com Funções");
        System.out.print("Escolha (1 ou 2): ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            // ---- VERSÃO 1: Procedural ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 1 — Procedural");
            System.out.println("========================================");
            System.out.print("Digite a base: ");
            double base = sc.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();
            double area = base * altura;
            System.out.printf("Área do retângulo: %.2f%n", area);

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite a base: ");
            double base = sc.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();
            double area = calcularAreaRetangulo(base, altura);
            System.out.printf("Área do retângulo: %.2f%n", area);
        }

        sc.close();
    }
}
