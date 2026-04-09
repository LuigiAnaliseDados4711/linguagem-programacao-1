// ============================================================
// Exercício 2: Calculadora de Área
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula a área de um retângulo a partir da
//            base e da altura fornecidas pelo usuário.
// ============================================================

#include <iostream>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
double calcular_area_retangulo(double base, double altura) {
    return base * altura;
}

int main() {
    cout << "\n>>> EXERCÍCIO 2: Calculadora de Área <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;

    double base, altura;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite a base: ";
        cin >> base;
        cout << "Digite a altura: ";
        cin >> altura;
        double area = base * altura;
        cout << "Área do retângulo: " << area << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite a base: ";
        cin >> base;
        cout << "Digite a altura: ";
        cin >> altura;
        double area = calcular_area_retangulo(base, altura);
        cout << "Área do retângulo: " << area << endl;
    }

    return 0;
}
