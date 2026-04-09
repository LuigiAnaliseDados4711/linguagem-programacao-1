// ============================================================
// Exercício 1: Verificador de Números
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Verifica se um número inteiro é par ou ímpar.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static void verificarParidade(int numero) {
        if (numero % 2 == 0)
            System.out.println("O número " + numero + " é PAR.");
        else
            System.out.println("O número " + numero + " é ÍMPAR.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 1: Verificador de Números <<<\n");
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
            if (numero % 2 == 0)
                System.out.println("O número " + numero + " é PAR.");
            else
                System.out.println("O número " + numero + " é ÍMPAR.");

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            verificarParidade(numero);
        }

        sc.close();
    }
}
