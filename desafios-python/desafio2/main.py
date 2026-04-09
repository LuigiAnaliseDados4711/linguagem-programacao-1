# ============================================================
# Desafio 2: Calculadora de Área
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Calcula a área de um retângulo a partir da
#            base e da altura fornecidas pelo usuário.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    """Calcula a área do retângulo de forma sequencial."""
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    base = float(input("Digite a base do retângulo: "))
    altura = float(input("Digite a altura do retângulo: "))

    area = base * altura

    print(f"\nÁrea do retângulo: {area:.2f}")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def calcular_area_retangulo(base, altura):
    """
    Calcula e retorna a área de um retângulo.

    Parâmetros:
        base (float): Comprimento da base.
        altura (float): Altura do retângulo.

    Retorno:
        float: Área calculada (base × altura).
    """
    return base * altura


def versao_modular():
    """Lê os dados e usa a função para calcular a área."""
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    base = float(input("Digite a base do retângulo: "))
    altura = float(input("Digite a altura do retângulo: "))

    area = calcular_area_retangulo(base, altura)

    print(f"\nÁrea do retângulo: {area:.2f}")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> DESAFIO 2: Calculadora de Área <<<\n")

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
