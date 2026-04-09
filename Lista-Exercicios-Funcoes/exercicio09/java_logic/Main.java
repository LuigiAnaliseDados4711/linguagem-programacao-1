// ============================================================
// Exercício 9: Contador de Vogais
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê uma palavra ou frase e conta o total de
//            vogais (a, e, i, o, u), ignorando maiúsculas.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static int contarVogais(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 9: Contador de Vogais <<<\n");
        System.out.println("Qual versão deseja executar?");
        System.out.println("  1 - Procedural");
        System.out.println("  2 - Modular com Funções");
        System.out.print("Escolha (1 ou 2): ");
        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            // ---- VERSÃO 1: Procedural ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 1 — Procedural");
            System.out.println("========================================");
            System.out.print("Digite uma palavra ou frase: ");
            String texto = sc.nextLine();
            int contador = 0;
            for (char c : texto.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contador++;
                }
            }
            System.out.println("Total de vogais encontradas: " + contador);

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite uma palavra ou frase: ");
            String texto = sc.nextLine();
            int total = contarVogais(texto);
            System.out.println("Total de vogais encontradas: " + total);
        }

        sc.close();
    }
}
