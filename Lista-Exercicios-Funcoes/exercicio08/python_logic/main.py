# ============================================================
# Exercício 8: Classificador de Triângulos
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Lê três lados e classifica o triângulo em
#            Equilátero, Isósceles ou Escaleno.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    a = float(input("Digite o lado A: "))
    b = float(input("Digite o lado B: "))
    c = float(input("Digite o lado C: "))

    if a == b == c:
        print("Triângulo: Equilátero")
    elif a == b or b == c or a == c:
        print("Triângulo: Isósceles")
    else:
        print("Triângulo: Escaleno")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def classificar_triangulo(a, b, c):
    """
    Classifica um triângulo a partir dos comprimentos dos três lados.

    Parâmetros:
        a, b, c (float): Comprimentos dos lados.

    Retorno:
        str: 'Equilátero', 'Isósceles' ou 'Escaleno'.
    """
    if a == b == c:
        return "Equilátero"
    elif a == b or b == c or a == c:
        return "Isósceles"
    else:
        return "Escaleno"


def versao_modular():
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    a = float(input("Digite o lado A: "))
    b = float(input("Digite o lado B: "))
    c = float(input("Digite o lado C: "))
    resultado = classificar_triangulo(a, b, c)
    print(f"Triângulo: {resultado}")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> EXERCÍCIO 8: Classificador de Triângulos <<<\n")
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
