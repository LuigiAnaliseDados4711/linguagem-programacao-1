// ============================================================
// Exercício 7: Classificador de Notas
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê uma nota (0-100) e classifica em A, B, C, D ou E.
// ============================================================

#include <iostream>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
char classificar_nota(double nota) {
    if (nota >= 90) return 'A';
    else if (nota >= 80) return 'B';
    else if (nota >= 70) return 'C';
    else if (nota >= 60) return 'D';
    else return 'E';
}

int main() {
    cout << "\n>>> EXERCÍCIO 7: Classificador de Notas <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;

    double nota;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite a nota (0 a 100): ";
        cin >> nota;
        char conceito;
        if (nota >= 90) conceito = 'A';
        else if (nota >= 80) conceito = 'B';
        else if (nota >= 70) conceito = 'C';
        else if (nota >= 60) conceito = 'D';
        else conceito = 'E';
        cout << "Nota " << nota << " => Conceito: " << conceito << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite a nota (0 a 100): ";
        cin >> nota;
        char conceito = classificar_nota(nota);
        cout << "Nota " << nota << " => Conceito: " << conceito << endl;
    }

    return 0;
}
