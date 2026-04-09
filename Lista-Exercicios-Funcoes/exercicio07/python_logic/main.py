# ============================================================
# Exercício 7: Classificador de Notas
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Lê uma nota (0-100) e classifica em A, B, C, D ou E.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    nota = float(input("Digite a nota (0 a 100): "))

    if nota >= 90:
        print(f"Nota {nota} => Conceito: A")
    elif nota >= 80:
        print(f"Nota {nota} => Conceito: B")
    elif nota >= 70:
        print(f"Nota {nota} => Conceito: C")
    elif nota >= 60:
        print(f"Nota {nota} => Conceito: D")
    else:
        print(f"Nota {nota} => Conceito: E")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def classificar_nota(nota):
    """
    Recebe uma nota e retorna a letra do conceito correspondente.

    Parâmetros:
        nota (float): Valor entre 0 e 100.

    Retorno:
        str: 'A', 'B', 'C', 'D' ou 'E'.
    """
    if nota >= 90:
        return "A"
    elif nota >= 80:
        return "B"
    elif nota >= 70:
        return "C"
    elif nota >= 60:
        return "D"
    else:
        return "E"


def versao_modular():
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    nota = float(input("Digite a nota (0 a 100): "))
    conceito = classificar_nota(nota)
    print(f"Nota {nota} => Conceito: {conceito}")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> EXERCÍCIO 7: Classificador de Notas <<<\n")
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
