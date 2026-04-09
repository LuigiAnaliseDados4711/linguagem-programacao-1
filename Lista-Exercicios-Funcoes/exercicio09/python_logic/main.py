# ============================================================
# Exercício 9: Contador de Vogais
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Lê uma palavra ou frase e conta o total de
#            vogais (a, e, i, o, u), ignorando maiúsculas.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    texto = input("Digite uma palavra ou frase: ")
    contador = 0

    for caractere in texto.lower():
        if caractere in "aeiou":
            contador += 1

    print(f"Total de vogais encontradas: {contador}")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def contar_vogais(texto):
    """
    Conta o número total de vogais em uma string.

    Parâmetros:
        texto (str): A string a ser analisada.

    Retorno:
        int: Número total de vogais (case-insensitive).
    """
    contador = 0
    for caractere in texto.lower():
        if caractere in "aeiou":
            contador += 1
    return contador


def versao_modular():
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    texto = input("Digite uma palavra ou frase: ")
    total = contar_vogais(texto)
    print(f"Total de vogais encontradas: {total}")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> EXERCÍCIO 9: Contador de Vogais <<<\n")
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
