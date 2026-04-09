# ============================================================
# Desafio 5: Conversor de Temperatura
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Converte uma temperatura de Celsius para
#            Fahrenheit usando a fórmula F = (C × 9/5) + 32
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    """Converte temperatura de forma sequencial, sem funções auxiliares."""
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    celsius = float(input("Digite a temperatura em Celsius: "))

    # Aplica a fórmula diretamente
    fahrenheit = (celsius * 9 / 5) + 32

    print(f"\n{celsius:.1f}°C  →  {fahrenheit:.1f}°F")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def celsius_para_fahrenheit(celsius):
    """
    Converte uma temperatura de Celsius para Fahrenheit.

    Parâmetros:
        celsius (float): Temperatura em graus Celsius.

    Retorno:
        float: Temperatura equivalente em Fahrenheit.

    Fórmula:
        F = (C × 9/5) + 32
    """
    return (celsius * 9 / 5) + 32


def versao_modular():
    """Lê o valor e usa a função de conversão."""
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    celsius = float(input("Digite a temperatura em Celsius: "))

    fahrenheit = celsius_para_fahrenheit(celsius)

    print(f"\n{celsius:.1f}°C  →  {fahrenheit:.1f}°F")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> DESAFIO 5: Conversor de Temperatura <<<\n")

    print("Qual versão deseja executar?")
    print("  1 - Procedural")
    print("  2 - Modular com Funções")
    escolha = input("Escolha (1 ou 2): ").strip()

    if escolha == "1":
        versao_procedural()
    elif escolha == "2":
        versao_modular()
    else:
        print("Opção inválida. Executando versão modular por padrão.\n")
        versao_modular()
