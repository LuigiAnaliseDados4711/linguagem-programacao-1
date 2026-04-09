// ============================================================
// Exercício 7: Classificador de Notas
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê uma nota (0-100) e classifica em A, B, C, D ou E.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static char classificarNota(double nota) {
        if (nota >= 90) return 'A';
        else if (nota >= 80) return 'B';
        else if (nota >= 70) return 'C';
        else if (nota >= 60) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 7: Classificador de Notas <<<\n");
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
            System.out.print("Digite a nota (0 a 100): ");
            double nota = sc.nextDouble();
            char conceito;
            if (nota >= 90) conceito = 'A';
            else if (nota >= 80) conceito = 'B';
            else if (nota >= 70) conceito = 'C';
            else if (nota >= 60) conceito = 'D';
            else conceito = 'E';
            System.out.println("Nota " + nota + " => Conceito: " + conceito);

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite a nota (0 a 100): ");
            double nota = sc.nextDouble();
            char conceito = classificarNota(nota);
            System.out.println("Nota " + nota + " => Conceito: " + conceito);
        }

        sc.close();
    }
}
