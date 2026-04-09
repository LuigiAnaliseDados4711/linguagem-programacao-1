# ============================================================
# Desafio 1: Verificador de Números
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Verifica se um número inteiro é par ou ímpar.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    """Resolve o problema de forma sequencial, sem funções auxiliares."""
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    numero = int(input("Digite um número inteiro: "))

    if numero % 2 == 0:
        print(f"O número {numero} é PAR.")
    else:
        print(f"O número {numero} é ÍMPAR.")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def verificar_paridade(numero):
    """
    Verifica e imprime se o número é par ou ímpar.

    Parâmetros:
        numero (int): O número a ser verificado.
    """
    if numero % 2 == 0:
        print(f"O número {numero} é PAR.")
    else:
        print(f"O número {numero} é ÍMPAR.")


def versao_modular():
    """Resolve o problema usando função auxiliar."""
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    numero = int(input("Digite um número inteiro: "))
    verificar_paridade(numero)


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> DESAFIO 1: Verificador de Números <<<\n")

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
