// ============================================================
// Exercício 5: Conversor de Temperatura
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Converte uma temperatura de Celsius para
//            Fahrenheit usando a fórmula F = (C * 9/5) + 32.
// ============================================================

#include <iostream>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
double celsius_para_fahrenheit(double celsius) {
    return (celsius * 9.0 / 5.0) + 32.0;
}

int main() {
    cout << "\n>>> EXERCÍCIO 5: Conversor de Temperatura <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;

    double celsius;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite a temperatura em Celsius: ";
        cin >> celsius;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        cout << celsius << "°C = " << fahrenheit << "°F" << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite a temperatura em Celsius: ";
        cin >> celsius;
        double fahrenheit = celsius_para_fahrenheit(celsius);
        cout << celsius << "°C = " << fahrenheit << "°F" << endl;
    }

    return 0;
}
