// ============================================================
// Exercício 6: Calculadora de Desconto
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Calcula o valor final de um produto após a
//            aplicação de uma porcentagem de desconto.
// ============================================================

#include <iostream>
#include <iomanip>
using namespace std;

// ----------------------------
// VERSÃO 2: Função auxiliar
// ----------------------------
double aplicar_desconto(double valor, double percentual) {
    double desconto = valor * (percentual / 100.0);
    return valor - desconto;
}

int main() {
    cout << "\n>>> EXERCÍCIO 6: Calculadora de Desconto <<<\n" << endl;
    cout << "Qual versão deseja executar?" << endl;
    cout << "  1 - Procedural" << endl;
    cout << "  2 - Modular com Funções" << endl;
    cout << "Escolha (1 ou 2): ";
    int escolha;
    cin >> escolha;

    double valor, percentual;

    if (escolha == 1) {
        // ---- VERSÃO 1: Procedural ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 1 — Procedural" << endl;
        cout << "========================================" << endl;
        cout << "Digite o valor original do produto: R$ ";
        cin >> valor;
        cout << "Digite o percentual de desconto (%): ";
        cin >> percentual;
        double desconto = valor * (percentual / 100.0);
        double valor_final = valor - desconto;
        cout << fixed << setprecision(2);
        cout << "Desconto: R$ " << desconto << endl;
        cout << "Valor final: R$ " << valor_final << endl;

    } else {
        // ---- VERSÃO 2: Modular com Funções ----
        cout << "\n========================================" << endl;
        cout << "  VERSÃO 2 — Modular com Funções" << endl;
        cout << "========================================" << endl;
        cout << "Digite o valor original do produto: R$ ";
        cin >> valor;
        cout << "Digite o percentual de desconto (%): ";
        cin >> percentual;
        double valor_final = aplicar_desconto(valor, percentual);
        cout << fixed << setprecision(2);
        cout << "Desconto: R$ " << (valor - valor_final) << endl;
        cout << "Valor final: R$ " << valor_final << endl;
    }

    return 0;
}
