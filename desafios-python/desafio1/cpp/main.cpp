// ============================================================
// Desafio 1: Verificador de Números
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Verifica se um número inteiro é par ou ímpar.
// ============================================================

#include <iostream>
using namespace std;

// ----------------------------
// VERSÃO 2: Função Auxiliar
// ----------------------------
void verificarParidade(int numero) {
    if (numero % 2 == 0)
        cout << "O numero " << numero << " e PAR." << endl;
    else
        cout << "O numero " << numero << " e IMPAR." << endl;
}

// ----------------------------
// VERSÃO 1: Procedural
// ----------------------------
void versaoProcedural() {
    cout << "========================================" << endl;
    cout << "  VERSAO 1 - Procedural" << endl;
    cout << "========================================" << endl;

    int numero;
    cout << "Digite um numero inteiro: ";
    cin >> numero;

    if (numero % 2 == 0)
        cout << "O numero " << numero << " e PAR." << endl;
    else
        cout << "O numero " << numero << " e IMPAR." << endl;
}

// ----------------------------
// VERSÃO 2: Modular com Funções
// ----------------------------
void versaoModular() {
    cout << "========================================" << endl;
    cout << "  VERSAO 2 - Modular com Funcoes" << endl;
    cout << "========================================" << endl;

    int numero;
    cout << "Digite um numero inteiro: ";
    cin >> numero;

    verificarParidade(numero);
}

// ----------------------------
// Programa Principal
// ----------------------------
int main() {
    cout << "\n>>> DESAFIO 1: Verificador de Numeros <<<\n" << endl;

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
