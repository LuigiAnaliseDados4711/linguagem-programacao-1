// ============================================================
// Desafio 2: Calculadora de Área
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula a área de um retângulo a partir da
//            base e da altura fornecidas pelo usuário.
// ============================================================

#include <iostream>
#include <iomanip>
using namespace std;

// ----------------------------
// VERSÃO 2: Função Auxiliar
// ----------------------------
double calcularAreaRetangulo(double base, double altura) {
    return base * altura;
}

// ----------------------------
// VERSÃO 1: Procedural
// ----------------------------
void versaoProcedural() {
    cout << "========================================" << endl;
    cout << "  VERSAO 1 - Procedural" << endl;
    cout << "========================================" << endl;

    double base, altura;
    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retangulo: ";
    cin >> altura;

    double area = base * altura;

    cout << fixed << setprecision(2);
    cout << "\nArea do retangulo: " << area << endl;
}

// ----------------------------
// VERSÃO 2: Modular com Funções
// ----------------------------
void versaoModular() {
    cout << "========================================" << endl;
    cout << "  VERSAO 2 - Modular com Funcoes" << endl;
    cout << "========================================" << endl;

    double base, altura;
    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retangulo: ";
    cin >> altura;

    double area = calcularAreaRetangulo(base, altura);

    cout << fixed << setprecision(2);
    cout << "\nArea do retangulo: " << area << endl;
}

// ----------------------------
// Programa Principal
// ----------------------------
int main() {
    cout << "\n>>> DESAFIO 2: Calculadora de Area <<<\n" << endl;

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
