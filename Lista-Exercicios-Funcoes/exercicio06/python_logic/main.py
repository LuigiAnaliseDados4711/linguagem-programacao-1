# ============================================================
# Desafio 6: Calculadora de Desconto
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Calcula o valor final de um produto após a
#            aplicação de uma porcentagem de desconto.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    """Calcula o desconto de forma sequencial."""
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    valor_original = float(input("Digite o valor original do produto (R$): "))
    desconto_pct = float(input("Digite a porcentagem de desconto (%): "))

    # Valida se o desconto está em um intervalo razoável
    if desconto_pct < 0 or desconto_pct > 100:
        print("  ❌ Porcentagem inválida. Deve ser entre 0 e 100.")
        return

    # Calcula o valor do desconto e o preço final
    valor_desconto = valor_original * (desconto_pct / 100)
    valor_final = valor_original - valor_desconto

    print(f"\n  Valor original:  R$ {valor_original:.2f}")
    print(f"  Desconto ({desconto_pct:.0f}%): R$ {valor_desconto:.2f}")
    print(f"  Valor final:     R$ {valor_final:.2f}")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def aplicar_desconto(valor_produto, porcentagem_desconto):
    """
    Calcula e retorna o valor final após aplicação do desconto.

    Parâmetros:
        valor_produto        (float): Preço original do produto.
        porcentagem_desconto (float): Percentual de desconto (0 a 100).

    Retorno:
        float: Valor final com desconto aplicado.
               Retorna None se a porcentagem for inválida.
    """
    if porcentagem_desconto < 0 or porcentagem_desconto > 100:
        return None  # Sinaliza erro para quem chamou a função

    valor_desconto = valor_produto * (porcentagem_desconto / 100)
    return valor_produto - valor_desconto


def versao_modular():
    """Lê os dados e usa a função para calcular o valor final."""
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    valor_original = float(input("Digite o valor original do produto (R$): "))
    desconto_pct = float(input("Digite a porcentagem de desconto (%): "))

    valor_final = aplicar_desconto(valor_original, desconto_pct)

    # Verifica se a função sinalizou erro (retornou None)
    if valor_final is None:
        print("  ❌ Porcentagem inválida. Deve ser entre 0 e 100.")
        return

    valor_desconto = valor_original - valor_final

    print(f"\n  Valor original:  R$ {valor_original:.2f}")
    print(f"  Desconto ({desconto_pct:.0f}%): R$ {valor_desconto:.2f}")
    print(f"  Valor final:     R$ {valor_final:.2f}")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> DESAFIO 6: Calculadora de Desconto <<<\n")

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
