# ============================================================
# Exercício 10: Gerador de Tabuada
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Lê um número inteiro e exibe sua tabuada de 1 a 10.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    numero = int(input("Digite um número inteiro: "))

    print(f"\nTabuada do {numero}:")
    for i in range(1, 11):
        print(f"  {numero} x {i} = {numero * i}")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def gerar_tabuada(numero):
    """
    Imprime a tabuada de um número de 1 a 10.

    Parâmetros:
        numero (int): O número cuja tabuada será gerada.
    """
    print(f"\nTabuada do {numero}:")
    for i in range(1, 11):
        print(f"  {numero} x {i} = {numero * i}")


def versao_modular():
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    numero = int(input("Digite um número inteiro: "))
    gerar_tabuada(numero)


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> EXERCÍCIO 10: Gerador de Tabuada <<<\n")
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
