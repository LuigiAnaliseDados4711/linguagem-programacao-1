// ============================================================
// Exercício 3: Validador de Senha
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Solicita uma senha ao usuário repetidamente
//            até que ela tenha pelo menos 8 caracteres.
// ============================================================

#include <iostream>
#include <string>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
bool validar_senha(const string& senha) {
    return senha.length() >= 8;
}

int main() {
    cout << "\n>>> EXERCÍCIO 3: Validador de Senha <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;
    cin.ignore();

    string senha;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        while (true) {
            cout << "Digite uma senha (mínimo 8 caracteres): ";
            getline(cin, senha);
            if (senha.length() >= 8) {
                cout << "Senha válida! Acesso concedido." << endl;
                break;
            } else {
                cout << "Senha muito curta. Tente novamente." << endl;
            }
        }

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        while (true) {
            cout << "Digite uma senha (mínimo 8 caracteres): ";
            getline(cin, senha);
            if (validar_senha(senha)) {
                cout << "Senha válida! Acesso concedido." << endl;
                break;
            } else {
                cout << "Senha muito curta. Tente novamente." << endl;
            }
        }
    }

    return 0;
}
