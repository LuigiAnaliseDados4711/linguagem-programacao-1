// ============================================================
// Desafio 5: Conversor de Temperatura
// Disciplina: Linguagem de Programação I - FATEC
// Descrição: Converte uma temperatura de Celsius para
//            Fahrenheit usando a fórmula F = (C × 9/5) + 32
// ============================================================

#include <iostream>
#include <iomanip>
using namespace std;

// ----------------------------
// VERSÃO 2: Função Auxiliar
// ----------------------------
double celsiusParaFahrenheit(double celsius) {
    return (celsius * 9.0 / 5.0) + 32.0;
}

// ----------------------------
// VERSÃO 1: Procedural
// ----------------------------
void versaoProcedural() {
    cout << "========================================" << endl;
    cout << "  VERSAO 1 - Procedural" << endl;
    cout << "========================================" << endl;

    double celsius;
    cout << "Digite a temperatura em Celsius: ";
    cin >> celsius;

    double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

    cout << fixed << setprecision(1);
    cout << "\n" << celsius << "°C  ->  " << fahrenheit << "°F" << endl;
}

// ----------------------------
// VERSÃO 2: Modular com Funções
// ----------------------------
void versaoModular() {
    cout << "========================================" << endl;
    cout << "  VERSAO 2 - Modular com Funcoes" << endl;
    cout << "========================================" << endl;

    double celsius;
    cout << "Digite a temperatura em Celsius: ";
    cin >> celsius;

    double fahrenheit = celsiusParaFahrenheit(celsius);

    cout << fixed << setprecision(1);
    cout << "\n" << celsius << "°C  ->  " << fahrenheit << "°F" << endl;
}

// ----------------------------
// Programa Principal
// ----------------------------
int main() {
    cout << "\n>>> DESAFIO 5: Conversor de Temperatura <<<\n" << endl;

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
