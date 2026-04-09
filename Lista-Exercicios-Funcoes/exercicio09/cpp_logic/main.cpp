// ============================================================
// Exercício 9: Contador de Vogais
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê uma palavra ou frase e conta o total de
//            vogais (a, e, i, o, u), ignorando maiúsculas.
// ============================================================

#include <iostream>
#include <string>
#include <cctype>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
int contar_vogais(const string& texto) {
    int contador = 0;
    for (char c : texto) {
        char lower = tolower(c);
        if (lower == 'a' || lower == 'e' || lower == 'i' ||
            lower == 'o' || lower == 'u') {
            contador++;
        }
    }
    return contador;
}

int main() {
    cout << "\n>>> EXERCÍCIO 9: Contador de Vogais <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;
    cin.ignore();

    string texto;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite uma palavra ou frase: ";
        getline(cin, texto);
        int contador = 0;
        for (char c : texto) {
            char lower = tolower(c);
            if (lower == 'a' || lower == 'e' || lower == 'i' ||
                lower == 'o' || lower == 'u') {
                contador++;
            }
        }
        cout << "Total de vogais encontradas: " << contador << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite uma palavra ou frase: ";
        getline(cin, texto);
        int total = contar_vogais(texto);
        cout << "Total de vogais encontradas: " << total << endl;
    }

    return 0;
}
