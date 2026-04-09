// ============================================================
// Exercício 10: Gerador de Tabuada
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê um número inteiro e exibe sua tabuada de 1 a 10.
// ============================================================

#include <iostream>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
void gerar_tabuada(int numero) {
    cout << "\nTabuada do " << numero << ":" << endl;
    for (int i = 1; i <= 10; i++) {
        cout << "  " << numero << " x " << i << " = " << numero * i << endl;
    }
}

int main() {
    cout << "\n>>> EXERCÍCIO 10: Gerador de Tabuada <<<\n" << endl;
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
        cout << "\nTabuada do " << numero << ":" << endl;
        for (int i = 1; i <= 10; i++) {
            cout << "  " << numero << " x " << i << " = " << numero * i << endl;
        }

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite um número inteiro: ";
        cin >> numero;
        gerar_tabuada(numero);
    }

    return 0;
}
