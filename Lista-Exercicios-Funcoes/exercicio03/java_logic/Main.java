// ============================================================
// Exercício 3: Validador de Senha
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Solicita uma senha ao usuário repetidamente
//            até que ela tenha pelo menos 8 caracteres.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Método auxiliar
    // ----------------------------
    public static boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> EXERCÍCIO 3: Validador de Senha <<<\n");
        System.out.println("Qual versão deseja executar?");
        System.out.println("  1 - Procedural");
        System.out.println("  2 - Modular com Funções");
        System.out.print("Escolha (1 ou 2): ");
        int escolha = sc.nextInt();
        sc.nextLine(); // consumir newline

        if (escolha == 1) {
            // ---- VERSÃO 1: Procedural ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 1 — Procedural");
            System.out.println("========================================");
            String senha;
            while (true) {
                System.out.print("Digite uma senha (mínimo 8 caracteres): ");
                senha = sc.nextLine();
                if (senha.length() >= 8) {
                    System.out.println("Senha válida! Acesso concedido.");
                    break;
                } else {
                    System.out.println("Senha muito curta. Tente novamente.");
                }
            }

        } else {
            // ---- VERSÃO 2: Modular com Funções ----
            System.out.println("\n========================================");
            System.out.println("  VERSÃO 2 — Modular com Funções");
            System.out.println("========================================");
            String senha;
            while (true) {
                System.out.print("Digite uma senha (mínimo 8 caracteres): ");
                senha = sc.nextLine();
                if (validarSenha(senha)) {
                    System.out.println("Senha válida! Acesso concedido.");
                    break;
                } else {
                    System.out.println("Senha muito curta. Tente novamente.");
                }
            }
        }

        sc.close();
    }
}
