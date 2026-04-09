# Desafio 3 — Validador de Senha

## 📋 Descrição do Problema

Criar um programa que solicite uma senha ao usuário e continue pedindo até que ela tenha **pelo menos 8 caracteres**.

Resolvido em duas versões:

- **Versão 1 (Procedural):** usa `while` com `len()` diretamente.
- **Versão 2 (Modular):** função `validar_senha()` que retorna `True` ou `False`, controlando o laço.

---

## 🧠 Explicação da Solução

### Conceitos usados

| Conceito | Uso no desafio |
|----------|----------------|
| `len()`  | Conta o número de caracteres da string |
| `while`  | Repete enquanto a condição for verdadeira |
| `bool`   | A função retorna `True` ou `False` |

### Versão Procedural

```python
senha = input("Crie uma senha: ")

while len(senha) < 8:
    print("Senha muito curta. Tente novamente.")
    senha = input("Crie uma senha: ")

print("Senha aceita!")
```

### Versão Modular

```python
def validar_senha(senha):
    return len(senha) >= 8

senha = input("Crie uma senha: ")

while not validar_senha(senha):
    print("Senha muito curta. Tente novamente.")
    senha = input("Crie uma senha: ")

print("Senha aceita!")
```

### Por que a versão modular é melhor?

Com `validar_senha()` isolada, você pode **facilmente expandir** as regras no futuro sem alterar o laço:

```python
# Exemplo de expansão futura:
def validar_senha(senha):
    tem_tamanho = len(senha) >= 8
    tem_numero  = any(c.isdigit() for c in senha)
    return tem_tamanho and tem_numero
```

O `while` **não precisa mudar** — só a função interna muda.

---

## ▶️ Como Executar

```bash
cd desafio3
python main.py
```

---

## 💡 O que você aprende aqui

- Função `len()` para medir strings
- Laço `while` com condição de saída
- Funções que retornam `bool` (`True` / `False`)
- Princípio de responsabilidade única: cada função faz uma coisa
