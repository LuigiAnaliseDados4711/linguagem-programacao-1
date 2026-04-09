// ============================================================
// Exercício 1: Verificador de Números
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Verifica se um número inteiro é par ou ímpar.
// ============================================================

#include <iostream>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
void verificar_paridade(int numero) {
    if (numero % 2 == 0)
        cout << "O número " << numero << " é PAR." << endl;
    else
        cout << "O número " << numero << " é ÍMPAR." << endl;
}

int main() {
    cout << "\n>>> EXERCÍCIO 1: Verificador de Números <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;

    int numero;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite um número inteiro: ";
        cin >> numero;
        if (numero % 2 == 0)
            cout << "O número " << numero << " é PAR." << endl;
        else
            cout << "O número " << numero << " é ÍMPAR." << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite um número inteiro: ";
        cin >> numero;
        verificar_paridade(numero);
    }

    return 0;
}
