// ============================================================
// Desafio 1: Verificador de Números
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Verifica se um número inteiro é par ou ímpar.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Função Auxiliar
    // ----------------------------
    public static void verificarParidade(int numero) {
        if (numero % 2 == 0)
            System.out.println("O numero " + numero + " e PAR.");
        else
            System.out.println("O numero " + numero + " e IMPAR.");
    }

    // ----------------------------
    // VERSÃO 1: Procedural
    // ----------------------------
    public static void versaoProcedural(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 1 - Procedural");
        System.out.println("========================================");

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0)
            System.out.println("O numero " + numero + " e PAR.");
        else
            System.out.println("O numero " + numero + " e IMPAR.");
    }

    // ----------------------------
    // VERSÃO 2: Modular com Funções
    // ----------------------------
    public static void versaoModular(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 2 - Modular com Funcoes");
        System.out.println("========================================");

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        verificarParidade(numero);
    }

    // ----------------------------
    // Programa Principal
    // ----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> DESAFIO 1: Verificador de Numeros <<<\n");
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
