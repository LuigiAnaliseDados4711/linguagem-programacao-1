// ============================================================
// Exercício 6: Calculadora de Desconto
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula o valor final de um produto após a
//            aplicação de uma porcentagem de desconto.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static double aplicarDesconto(double valor, double percentual) {
        double desconto = valor * (percentual / 100.0);
        return valor - desconto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 6: Calculadora de Desconto <<<\n");
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
            System.out.print("Digite o valor original do produto: R$ ");
            double valor = sc.nextDouble();
            System.out.print("Digite o percentual de desconto (%): ");
            double percentual = sc.nextDouble();
            double desconto = valor * (percentual / 100.0);
            double valorFinal = valor - desconto;
            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite o valor original do produto: R$ ");
            double valor = sc.nextDouble();
            System.out.print("Digite o percentual de desconto (%): ");
            double percentual = sc.nextDouble();
            double valorFinal = aplicarDesconto(valor, percentual);
            System.out.printf("Desconto: R$ %.2f%n", (valor - valorFinal));
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        }

        sc.close();
    }
}
