# Desafio 6 — Calculadora de Desconto

## 📋 Descrição do Problema

Criar um programa que calcule o **valor final de um produto** após a aplicação de uma porcentagem de desconto. O programa recebe o preço original e o percentual de desconto.

Resolvido em duas versões:

- **Versão 1 (Procedural):** cálculo sequencial direto.
- **Versão 2 (Modular):** função `aplicar_desconto()` que recebe preço e percentual e **retorna** o valor final.

---

## 🧠 Explicação da Solução

### Fórmula

```
valor_desconto = valor_original × (porcentagem / 100)
valor_final    = valor_original − valor_desconto
```

Exemplo: produto de **R$ 200,00** com **15% de desconto**:

```
valor_desconto = 200 × (15 / 100) = 30,00
valor_final    = 200 − 30         = 170,00
```

### Versão Modular

```python
def aplicar_desconto(valor_produto, porcentagem_desconto):
    if porcentagem_desconto < 0 or porcentagem_desconto > 100:
        return None  # desconto inválido
    valor_desconto = valor_produto * (porcentagem_desconto / 100)
    return valor_produto - valor_desconto

valor_original = float(input("Valor do produto (R$): "))
desconto_pct   = float(input("Desconto (%): "))

valor_final = aplicar_desconto(valor_original, desconto_pct)

if valor_final is None:
    print("Porcentagem inválida.")
else:
    print(f"Valor final: R$ {valor_final:.2f}")
```

### Validação de entrada

O programa verifica se a porcentagem está entre **0 e 100**, evitando resultados sem sentido (como desconto negativo ou acima de 100%).

Isso é um exemplo de **validação de dados** — prática essencial em ciência de dados e desenvolvimento.

### O que é `None`?

`None` é o valor Python para "ausência de resultado". Usar `return None` para sinalizar erro é um padrão comum — quem chamou a função verifica com `if resultado is None`.

---

## ▶️ Como Executar

```bash
cd desafio6
python main.py
```

---

## 💡 O que você aprende aqui

- Cálculo percentual aplicado a preços
- Validação de dados de entrada
- Uso de `None` para sinalizar ausência de resultado
- Formatação monetária com `:.2f`
- Separação entre cálculo e exibição
