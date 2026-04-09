// ============================================================
// Exercício 4: Gerador de Boas-Vindas Personalizadas
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê o nome e a idade do usuário e imprime
//            uma mensagem de boas-vindas personalizada.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static String gerarMensagemBoasVindas(String nome, int idade) {
        return "Olá, " + nome + "! Você tem " + idade +
               " anos. Seja muito bem-vindo(a)!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 4: Gerador de Boas-Vindas <<<\n");
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
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Olá, " + nome + "! Você tem " + idade +
                               " anos. Seja muito bem-vindo(a)!");

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();
            String mensagem = gerarMensagemBoasVindas(nome, idade);
            System.out.println(mensagem);
        }

        sc.close();
    }
}
