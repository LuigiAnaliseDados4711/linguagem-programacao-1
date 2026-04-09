// ============================================================
// Exercício 4: Gerador de Boas-Vindas Personalizadas
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê o nome e a idade do usuário e imprime
//            uma mensagem de boas-vindas personalizada.
// ============================================================

#include <iostream>
#include <string>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
string gerar_mensagem_boas_vindas(const string& nome, int idade) {
    return "Olá, " + nome + "! Você tem " + to_string(idade) +
           " anos. Seja muito bem-vindo(a)!";
}

int main() {
    cout << "\n>>> EXERCÍCIO 4: Gerador de Boas-Vindas <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;
    cin.ignore();

    string nome;
    int idade;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite o seu nome: ";
        getline(cin, nome);
        cout << "Digite a sua idade: ";
        cin >> idade;
        cout << "Olá, " << nome << "! Você tem " << idade
             << " anos. Seja muito bem-vindo(a)!" << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite o seu nome: ";
        getline(cin, nome);
        cout << "Digite a sua idade: ";
        cin >> idade;
        string mensagem = gerar_mensagem_boas_vindas(nome, idade);
        cout << mensagem << endl;
    }

    return 0;
}
