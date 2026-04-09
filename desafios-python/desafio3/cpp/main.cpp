// ============================================================
// Desafio 3: Validador de Senha
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Solicita uma senha ao usuário repetidamente
//            até que ela tenha pelo menos 8 caracteres.
// ============================================================

#include <iostream>
#include <string>
using namespace std;

// ----------------------------
// VERSÃO 2: Função Auxiliar
// ----------------------------
bool validarSenha(const string& senha) {
    return senha.length() >= 8;
}

// ----------------------------
// VERSÃO 1: Procedural
// ----------------------------
void versaoProcedural() {
    cout << "========================================" << endl;
    cout << "  VERSAO 1 - Procedural" << endl;
    cout << "========================================" << endl;

    string senha;
    cout << "Crie uma senha (minimo 8 caracteres): ";
    cin >> senha;

    while (senha.length() < 8) {
        cout << "  X Senha muito curta (" << senha.length() << " caracteres). Tente novamente." << endl;
        cout << "Crie uma senha (minimo 8 caracteres): ";
        cin >> senha;
    }

    cout << "  OK Senha aceita! (" << senha.length() << " caracteres)" << endl;
}

// ----------------------------
// VERSÃO 2: Modular com Funções
// ----------------------------
void versaoModular() {
    cout << "========================================" << endl;
    cout << "  VERSAO 2 - Modular com Funcoes" << endl;
    cout << "========================================" << endl;

    string senha;
    cout << "Crie uma senha (minimo 8 caracteres): ";
    cin >> senha;

    while (!validarSenha(senha)) {
        cout << "  X Senha muito curta (" << senha.length() << " caracteres). Tente novamente." << endl;
        cout << "Crie uma senha (minimo 8 caracteres): ";
        cin >> senha;
    }

    cout << "  OK Senha aceita! (" << senha.length() << " caracteres)" << endl;
}

// ----------------------------
// Programa Principal
// ----------------------------
int main() {
    cout << "\n>>> DESAFIO 3: Validador de Senha <<<\n" << endl;

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
