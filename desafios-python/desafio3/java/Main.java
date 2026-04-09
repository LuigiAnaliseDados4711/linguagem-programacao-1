// ============================================================
// Desafio 3: Validador de Senha
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Solicita uma senha ao usuário repetidamente
//            até que ela tenha pelo menos 8 caracteres.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Função Auxiliar
    // ----------------------------
    public static boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }

    // ----------------------------
    // VERSÃO 1: Procedural
    // ----------------------------
    public static void versaoProcedural(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 1 - Procedural");
        System.out.println("========================================");

        System.out.print("Crie uma senha (minimo 8 caracteres): ");
        String senha = sc.next();

        while (senha.length() < 8) {
            System.out.println("  X Senha muito curta (" + senha.length() + " caracteres). Tente novamente.");
            System.out.print("Crie uma senha (minimo 8 caracteres): ");
            senha = sc.next();
        }

        System.out.println("  OK Senha aceita! (" + senha.length() + " caracteres)");
    }

    // ----------------------------
    // VERSÃO 2: Modular com Funções
    // ----------------------------
    public static void versaoModular(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 2 - Modular com Funcoes");
        System.out.println("========================================");

        System.out.print("Crie uma senha (minimo 8 caracteres): ");
        String senha = sc.next();

        while (!validarSenha(senha)) {
            System.out.println("  X Senha muito curta (" + senha.length() + " caracteres). Tente novamente.");
            System.out.print("Crie uma senha (minimo 8 caracteres): ");
            senha = sc.next();
        }

        System.out.println("  OK Senha aceita! (" + senha.length() + " caracteres)");
    }

    // ----------------------------
    // Programa Principal
    // ----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> DESAFIO 3: Validador de Senha <<<\n");
        System.out.println("Qual versao deseja executar?");
        System.out.println("  1 - Procedural");
        System.out.println("  2 - Modular com Funcoes");
        System.out.print("Escolha (1 ou 2): ");

        int escolha = sc.nextInt();

        if (escolha == 1)
            versaoProcedural(sc);
        else if (escolha == 2)
            versaoModular(sc);
        else {
            System.out.println("Opcao invalida. Executando versao modular por padrao.");
            versaoModular(sc);
        }

        sc.close();
    }
}
