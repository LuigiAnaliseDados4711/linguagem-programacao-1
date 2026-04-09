// ============================================================
// Desafio 4: Gerador de Boas-Vindas Personalizadas
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê o nome e a idade do usuário e imprime
//            uma mensagem de boas-vindas personalizada.
// ============================================================

#include <iostream>
#include <string>
using namespace std;

// ----------------------------
// VERSÃO 2: Função Auxiliar
// ----------------------------
string gerarMensagemBoasVindas(const string& nome, int idade) {
    string complemento;
    if (idade < 18)
        complemento = "Voce e jovem - aproveite cada momento!";
    else if (idade < 60)
        complemento = "Fase produtiva - continue aprendendo sempre!";
    else
        complemento = "Experiencia e o maior patrimonio - compartilhe seu conhecimento!";

    return "\nOla, " + nome + "! Seja bem-vindo(a)!\nVoce tem " +
           to_string(idade) + " anos.\n" + complemento;
}

// ----------------------------
// VERSÃO 1: Procedural
// ----------------------------
void versaoProcedural() {
    cout << "========================================" << endl;
    cout << "  VERSAO 1 - Procedural" << endl;
    cout << "========================================" << endl;

    string nome;
    int idade;
    cout << "Digite seu nome: ";
    getline(cin, nome);
    cout << "Digite sua idade: ";
    cin >> idade;

    cout << "\nOla, " << nome << "! Seja bem-vindo(a)!" << endl;
    cout << "Voce tem " << idade << " anos." << endl;

    if (idade < 18)
        cout << "Voce e jovem - aproveite cada momento!" << endl;
    else if (idade < 60)
        cout << "Fase produtiva - continue aprendendo sempre!" << endl;
    else
        cout << "Experiencia e o maior patrimonio - compartilhe seu conhecimento!" << endl;
}

// ----------------------------
// VERSÃO 2: Modular com Funções
// ----------------------------
void versaoModular() {
    cout << "========================================" << endl;
    cout << "  VERSAO 2 - Modular com Funcoes" << endl;
    cout << "========================================" << endl;

    string nome;
    int idade;
    cout << "Digite seu nome: ";
    getline(cin, nome);
    cout << "Digite sua idade: ";
    cin >> idade;

    cout << gerarMensagemBoasVindas(nome, idade) << endl;
}

// ----------------------------
// Programa Principal
// ----------------------------
int main() {
    cout << "\n>>> DESAFIO 4: Gerador de Boas-Vindas <<<\n" << endl;

    cout << "Qual versao deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funcoes" << endl;
    cout << "Escolha (1 ou 2): ";

    int escolha;
    cin >> escolha;
    cin.ignore(); // limpa o buffer antes do getline

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
