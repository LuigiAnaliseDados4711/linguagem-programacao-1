# Desafio 1 — Verificador de Números

## 📋 Descrição do Problema

Criar um programa que peça ao usuário um número inteiro e informe se ele é **par** ou **ímpar**.

O desafio é resolvido de duas formas:

- **Versão 1 (Procedural):** código escrito de forma sequencial, sem funções auxiliares.
- **Versão 2 (Modular):** a lógica de verificação é encapsulada em uma função `verificar_paridade()`.

---

## 🧠 Explicação da Solução

### Conceito-chave: operador módulo `%`

O operador `%` retorna o **resto da divisão**. Se um número dividido por 2 tem resto 0, ele é par. Caso contrário, é ímpar.

```
10 % 2 = 0  → PAR
7  % 2 = 1  → ÍMPAR
```

### Versão Procedural

```python
numero = int(input("Digite um número inteiro: "))

if numero % 2 == 0:
    print(f"O número {numero} é PAR.")
else:
    print(f"O número {numero} é ÍMPAR.")
```

### Versão Modular

```python
def verificar_paridade(numero):
    if numero % 2 == 0:
        print(f"O número {numero} é PAR.")
    else:
        print(f"O número {numero} é ÍMPAR.")

numero = int(input("Digite um número inteiro: "))
verificar_paridade(numero)
```

A versão modular é preferida em projetos reais: a função pode ser **reutilizada** em qualquer parte do código sem reescrita.

---

## ▶️ Como Executar

```bash
cd desafio1
python main.py
```

Siga as instruções no terminal: escolha a versão (1 ou 2) e digite um número inteiro.

---

## 💡 O que você aprende aqui

- Operador módulo `%`
- Estrutura condicional `if / else`
- Diferença entre programação procedural e modular
- Boas práticas: funções com nomes descritivos
