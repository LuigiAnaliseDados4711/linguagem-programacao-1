# ============================================================
# Desafio 3: Validador de Senha
# Disciplina: Linguagem de Programação I - FATEC
# Descrição: Solicita uma senha ao usuário repetidamente
#            até que ela tenha pelo menos 8 caracteres.
# ============================================================


# ----------------------------
# VERSÃO 1: Procedural
# ----------------------------
def versao_procedural():
    """Valida a senha usando laço while diretamente, sem função auxiliar."""
    print("=" * 40)
    print("  VERSÃO 1 — Procedural")
    print("=" * 40)

    senha = input("Crie uma senha (mínimo 8 caracteres): ")

    # Continua pedindo enquanto a senha for curta demais
    while len(senha) < 8:
        print(f"  ❌ Senha muito curta ({len(senha)} caracteres). Tente novamente.")
        senha = input("Crie uma senha (mínimo 8 caracteres): ")

    print(f"  ✅ Senha aceita! ({len(senha)} caracteres)")


# ----------------------------
# VERSÃO 2: Modular com Funções
# ----------------------------
def validar_senha(senha):
    """
    Verifica se a senha atende ao critério mínimo de tamanho.

    Parâmetros:
        senha (str): A senha digitada pelo usuário.

    Retorno:
        bool: True se válida (>= 8 caracteres), False caso contrário.
    """
    return len(senha) >= 8


def versao_modular():
    """Usa a função validar_senha() para controlar o laço while."""
    print("=" * 40)
    print("  VERSÃO 2 — Modular com Funções")
    print("=" * 40)

    senha = input("Crie uma senha (mínimo 8 caracteres): ")

    # A função retorna True/False, controlando a repetição
    while not validar_senha(senha):
        print(f"  ❌ Senha muito curta ({len(senha)} caracteres). Tente novamente.")
        senha = input("Crie uma senha (mínimo 8 caracteres): ")

    print(f"  ✅ Senha aceita! ({len(senha)} caracteres)")


# ----------------------------
# Programa Principal
# ----------------------------
if __name__ == "__main__":
    print("\n>>> DESAFIO 3: Validador de Senha <<<\n")

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
