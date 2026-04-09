# ============================================================
# Desafio 4: Gerador de Boas-Vindas Personalizadas
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Lê o nome e a idade do usuário e imprime
#            uma mensagem de boas-vindas personalizada.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    """Gera a mensagem de boas-vindas de forma sequencial."""
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    nome = input("Digite seu nome: ")
    idade = int(input("Digite sua idade: "))

    # Monta e exibe a mensagem diretamente
    print(f"\nOlá, {nome}! Seja bem-vindo(a)!")
    print(f"Você tem {idade} anos.")

    # Mensagem adicional baseada na faixa etária
    if idade < 18:
        print("Você é jovem — aproveite cada momento!")
    elif idade < 60:
        print("Fase produtiva — continue aprendendo sempre!")
    else:
        print("Experiência é o maior patrimônio — compartilhe seu conhecimento!")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def gerar_mensagem_boas_vindas(nome, idade):
    """
    Cria e retorna uma mensagem de boas-vindas personalizada.

    Parâmetros:
        nome  (str): Nome do usuário.
        idade (int): Idade do usuário.

    Retorno:
        str: Mensagem completa de boas-vindas.
    """
    if idade < 18:
        complemento = "Você é jovem — aproveite cada momento!"
    elif idade < 60:
        complemento = "Fase produtiva — continue aprendendo sempre!"
    else:
        complemento = "Experiência é o maior patrimônio — compartilhe seu conhecimento!"

    mensagem = (
        f"\nOlá, {nome}! Seja bem-vindo(a)!\n"
        f"Você tem {idade} anos.\n"
        f"{complemento}"
    )
    return mensagem


def versao_modular():
    """Captura os dados e usa a função para gerar a mensagem."""
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    nome = input("Digite seu nome: ")
    idade = int(input("Digite sua idade: "))

    mensagem = gerar_mensagem_boas_vindas(nome, idade)
    print(mensagem)


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> DESAFIO 4: Gerador de Boas-Vindas <<<\n")

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
