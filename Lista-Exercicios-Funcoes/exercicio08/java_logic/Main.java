// ============================================================
// Exercício 8: Classificador de Triângulos
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê três lados e classifica o triângulo em
//            Equilátero, Isósceles ou Escaleno.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static String classificarTriangulo(double a, double b, double c) {
        if (a == b && b == c)
            return "Equilátero";
        else if (a == b || b == c || a == c)
            return "Isósceles";
        else
            return "Escaleno";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 8: Classificador de Triângulos <<<\n");
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
            System.out.print("Digite o lado A: ");
            double a = sc.nextDouble();
            System.out.print("Digite o lado B: ");
            double b = sc.nextDouble();
            System.out.print("Digite o lado C: ");
            double c = sc.nextDouble();
            String tipo;
            if (a == b && b == c) tipo = "Equilátero";
            else if (a == b || b == c || a == c) tipo = "Isósceles";
            else tipo = "Escaleno";
            System.out.println("Triângulo: " + tipo);

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite o lado A: ");
            double a = sc.nextDouble();
            System.out.print("Digite o lado B: ");
            double b = sc.nextDouble();
            System.out.print("Digite o lado C: ");
            double c = sc.nextDouble();
            String tipo = classificarTriangulo(a, b, c);
            System.out.println("Triângulo: " + tipo);
        }

        sc.close();
    }
}
