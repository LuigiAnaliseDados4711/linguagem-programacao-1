// ============================================================
// Exercício 5: Conversor de Temperatura
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Converte uma temperatura de Celsius para
//            Fahrenheit usando a fórmula F = (C * 9/5) + 32.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 5: Conversor de Temperatura <<<\n");
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
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        }

        sc.close();
    }
}
