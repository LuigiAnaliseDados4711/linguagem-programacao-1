// ============================================================
// Desafio 4: Gerador de Boas-Vindas Personalizadas
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê o nome e a idade do usuário e imprime
//            uma mensagem de boas-vindas personalizada.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Função Auxiliar
    // ----------------------------
    public static String gerarMensagemBoasVindas(String nome, int idade) {
        String complemento;
        if (idade < 18)
            complemento = "Voce e jovem - aproveite cada momento!";
        else if (idade < 60)
            complemento = "Fase produtiva - continue aprendendo sempre!";
        else
            complemento = "Experiencia e o maior patrimonio - compartilhe seu conhecimento!";

        return "\nOla, " + nome + "! Seja bem-vindo(a)!\n" +
               "Voce tem " + idade + " anos.\n" + complemento;
    }

    // ----------------------------
    // VERSÃO 1: Procedural
    // ----------------------------
    public static void versaoProcedural(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 1 - Procedural");
        System.out.println("========================================");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("\nOla, " + nome + "! Seja bem-vindo(a)!");
        System.out.println("Voce tem " + idade + " anos.");

        if (idade < 18)
            System.out.println("Voce e jovem - aproveite cada momento!");
        else if (idade < 60)
            System.out.println("Fase produtiva - continue aprendendo sempre!");
        else
            System.out.println("Experiencia e o maior patrimonio - compartilhe seu conhecimento!");
    }

    // ----------------------------
    // VERSÃO 2: Modular com Funções
    // ----------------------------
    public static void versaoModular(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 2 - Modular com Funcoes");
        System.out.println("========================================");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println(gerarMensagemBoasVindas(nome, idade));
    }

    // ----------------------------
    // Programa Principal
    // ----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> DESAFIO 4: Gerador de Boas-Vindas <<<\n");
        System.out.println("Qual versao deseja executar?");
        System.out.println("  1 - Procedural");
        System.out.println("  2 - Modular com Funcoes");
        System.out.print("Escolha (1 ou 2): ");

        int escolha = sc.nextInt();
        sc.nextLine(); // limpa o buffer antes do nextLine

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
