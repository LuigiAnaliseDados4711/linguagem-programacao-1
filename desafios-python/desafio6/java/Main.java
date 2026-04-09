// ============================================================
// Desafio 6: Calculadora de Desconto
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula o valor final de um produto após a
//            aplicação de uma porcentagem de desconto.
// ============================================================

import java.util.Scanner;

public class Main {

    // ----------------------------
    // VERSÃO 2: Função Auxiliar
    // (retorna -1.0 para sinalizar entrada inválida)
    // ----------------------------
    public static double aplicarDesconto(double valorProduto, double porcentagemDesconto) {
        if (porcentagemDesconto < 0 || porcentagemDesconto > 100)
            return -1.0;

        double valorDesconto = valorProduto * (porcentagemDesconto / 100.0);
        return valorProduto - valorDesconto;
    }

    // ----------------------------
    // VERSÃO 1: Procedural
    // ----------------------------
    public static void versaoProcedural(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 1 - Procedural");
        System.out.println("========================================");

        System.out.print("Digite o valor original do produto (R$): ");
        double valorOriginal = sc.nextDouble();
        System.out.print("Digite a porcentagem de desconto (%): ");
        double descontoPct = sc.nextDouble();

        if (descontoPct < 0 || descontoPct > 100) {
            System.out.println("  X Porcentagem invalida. Deve ser entre 0 e 100.");
            return;
        }

        double valorDesconto = valorOriginal * (descontoPct / 100.0);
        double valorFinal    = valorOriginal - valorDesconto;

        System.out.printf("%n  Valor original:  R$ %.2f%n", valorOriginal);
        System.out.printf("  Desconto (%.0f%%): R$ %.2f%n", descontoPct, valorDesconto);
        System.out.printf("  Valor final:     R$ %.2f%n", valorFinal);
    }

    // ----------------------------
    // VERSÃO 2: Modular com Funções
    // ----------------------------
    public static void versaoModular(Scanner sc) {
        System.out.println("========================================");
        System.out.println("  VERSAO 2 - Modular com Funcoes");
        System.out.println("========================================");

        System.out.print("Digite o valor original do produto (R$): ");
        double valorOriginal = sc.nextDouble();
        System.out.print("Digite a porcentagem de desconto (%): ");
        double descontoPct = sc.nextDouble();

        double valorFinal = aplicarDesconto(valorOriginal, descontoPct);

        if (valorFinal < 0) {
            System.out.println("  X Porcentagem invalida. Deve ser entre 0 e 100.");
            return;
        }

        double valorDesconto = valorOriginal - valorFinal;

        System.out.printf("%n  Valor original:  R$ %.2f%n", valorOriginal);
        System.out.printf("  Desconto (%.0f%%): R$ %.2f%n", descontoPct, valorDesconto);
        System.out.printf("  Valor final:     R$ %.2f%n", valorFinal);
    }

    // ----------------------------
    // Programa Principal
    // ----------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>> DESAFIO 6: Calculadora de Desconto <<<\n");
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
