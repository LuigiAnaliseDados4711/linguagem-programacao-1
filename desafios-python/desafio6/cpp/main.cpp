// ============================================================
// Desafio 6: Calculadora de Desconto
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula o valor final de um produto após a
//            aplicação de uma porcentagem de desconto.
// ============================================================

#include <iostream>
#include <iomanip>
using namespace std;

// ----------------------------
// VERSÃO 2: Função Auxiliar
// (retorna -1.0 para sinalizar entrada inválida)
// ----------------------------
double aplicarDesconto(double valorProduto, double porcentagemDesconto) {
    if (porcentagemDesconto < 0 || porcentagemDesconto > 100)
        return -1.0;

    double valorDesconto = valorProduto * (porcentagemDesconto / 100.0);
    return valorProduto - valorDesconto;
}

// ----------------------------
// VERSÃO 1: Procedural
// ----------------------------
void versaoProcedural() {
    cout << "========================================" << endl;
    cout << "  VERSAO 1 - Procedural" << endl;
    cout << "========================================" << endl;

    double valorOriginal, descontoPct;
    cout << "Digite o valor original do produto (R$): ";
    cin >> valorOriginal;
    cout << "Digite a porcentagem de desconto (%): ";
    cin >> descontoPct;

    if (descontoPct < 0 || descontoPct > 100) {
        cout << "  X Porcentagem invalida. Deve ser entre 0 e 100." << endl;
        return;
    }

    double valorDesconto = valorOriginal * (descontoPct / 100.0);
    double valorFinal    = valorOriginal - valorDesconto;

    cout << fixed << setprecision(2);
    cout << "\n  Valor original:  R$ " << valorOriginal << endl;
    cout << "  Desconto (" << (int)descontoPct << "%): R$ " << valorDesconto << endl;
    cout << "  Valor final:     R$ " << valorFinal << endl;
}

// ----------------------------
// VERSÃO 2: Modular com Funções
// ----------------------------
void versaoModular() {
    cout << "========================================" << endl;
    cout << "  VERSAO 2 - Modular com Funcoes" << endl;
    cout << "========================================" << endl;

    double valorOriginal, descontoPct;
    cout << "Digite o valor original do produto (R$): ";
    cin >> valorOriginal;
    cout << "Digite a porcentagem de desconto (%): ";
    cin >> descontoPct;

    double valorFinal = aplicarDesconto(valorOriginal, descontoPct);

    if (valorFinal < 0) {
        cout << "  X Porcentagem invalida. Deve ser entre 0 e 100." << endl;
        return;
    }

    double valorDesconto = valorOriginal - valorFinal;

    cout << fixed << setprecision(2);
    cout << "\n  Valor original:  R$ " << valorOriginal << endl;
    cout << "  Desconto (" << (int)descontoPct << "%): R$ " << valorDesconto << endl;
    cout << "  Valor final:     R$ " << valorFinal << endl;
}

// ----------------------------
// Programa Principal
// ----------------------------
int main() {
    cout << "\n>>> DESAFIO 6: Calculadora de Desconto <<<\n" << endl;

    cout << "Qual versao deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funcoes" << endl;
    cout << "Escolha (1 ou 2): ";

    int escolha;
    cin >> escolha;

    if (escolha == 1)
        versaoProcedural();
    else if (escolha == 2)
        versaoModular();
    else {
        cout << "Opcao invalida. Executando versao modular por padrao." << endl;
        versaoModular();
    }

    return 0;
}
