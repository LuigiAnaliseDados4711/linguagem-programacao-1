# Desafio 4 — Gerador de Boas-Vindas Personalizadas

## 📋 Descrição do Problema

Criar um programa que leia o **nome** e a **idade** do usuário e exiba uma mensagem de boas-vindas personalizada com base nessas informações.

Resolvido em duas versões:

- **Versão 1 (Procedural):** monta e exibe a mensagem diretamente.
- **Versão 2 (Modular):** função `gerar_mensagem_boas_vindas()` que **retorna** a mensagem pronta.

---

## 🧠 Explicação da Solução

### Lógica de personalização

A mensagem varia de acordo com a faixa etária:

| Faixa etária | Mensagem complementar |
|--------------|-----------------------|
| Menos de 18  | Mensagem para jovens  |
| 18 a 59      | Mensagem para adultos |
| 60 ou mais   | Mensagem para idosos  |

### Versão Modular

```python
def gerar_mensagem_boas_vindas(nome, idade):
    if idade < 18:
        complemento = "Você é jovem — aproveite cada momento!"
    elif idade < 60:
        complemento = "Fase produtiva — continue aprendendo sempre!"
    else:
        complemento = "Experiência é o maior patrimônio!"

    return f"Olá, {nome}! Você tem {idade} anos.\n{complemento}"

nome  = input("Nome: ")
idade = int(input("Idade: "))
print(gerar_mensagem_boas_vindas(nome, idade))
```

### Vantagem de usar `return` aqui

A função devolve uma `str` pronta. Isso significa que o mesmo texto poderia ser:
- Exibido no terminal
- Salvo em um arquivo
- Enviado por e-mail

Tudo sem alterar a função. Isso é **reusabilidade**.

---

## ▶️ Como Executar

```bash
cd desafio4
python main.py
```

---

## 💡 O que você aprende aqui

- Leitura de múltiplos tipos de dados (`str` e `int`)
- Condicionais encadeados `if / elif / else`
- Funções que retornam strings formatadas com f-string
- Conceito de reusabilidade de código
