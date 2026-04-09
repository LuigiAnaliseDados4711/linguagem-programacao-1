// ============================================================
// Exercício 10: Gerador de Tabuada
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê um número inteiro e exibe sua tabuada de 1 a 10.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static void gerarTabuada(int numero) {
        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println("  " + numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 10: Gerador de Tabuada <<<\n");
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
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println("  " + numero + " x " + i + " = " + (numero * i));
            }

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            gerarTabuada(numero);
        }

        sc.close();
    }
}
