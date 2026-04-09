// ============================================================
// Exercício 8: Classificador de Triângulos
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Lê três lados e classifica o triângulo em
//            Equilátero, Isósceles ou Escaleno.
// ============================================================

#include <iostream>
#include <string>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
string classificar_triangulo(double a, double b, double c) {
    if (a == b && b == c)
        return "Equilátero";
    else if (a == b || b == c || a == c)
        return "Isósceles";
    else
        return "Escaleno";
}

int main() {
    cout << "\n>>> EXERCÍCIO 8: Classificador de Triângulos <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;

    double a, b, c;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite o lado A: "; cin >> a;
        cout << "Digite o lado B: "; cin >> b;
        cout << "Digite o lado C: "; cin >> c;
        string tipo;
        if (a == b && b == c) tipo = "Equilátero";
        else if (a == b || b == c || a == c) tipo = "Isósceles";
        else tipo = "Escaleno";
        cout << "Triângulo: " << tipo << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite o lado A: "; cin >> a;
        cout << "Digite o lado B: "; cin >> b;
        cout << "Digite o lado C: "; cin >> c;
        string tipo = classificar_triangulo(a, b, c);
        cout << "Triângulo: " << tipo << endl;
    }

    return 0;
}
