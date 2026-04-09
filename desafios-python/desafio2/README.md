# Desafio 2 — Calculadora de Área

## 📋 Descrição do Problema

Criar um programa que calcule a **área de um retângulo** a partir dos valores de **base** e **altura** fornecidos pelo usuário.

Resolvido em duas versões:

- **Versão 1 (Procedural):** cálculo direto, sem funções.
- **Versão 2 (Modular):** função `calcular_area_retangulo()` que recebe os parâmetros e **retorna** o resultado.

---

## 🧠 Explicação da Solução

### Fórmula

```
Área = base × altura
```

### Versão Procedural

```python
base   = float(input("Digite a base: "))
altura = float(input("Digite a altura: "))

area = base * altura
print(f"Área: {area:.2f}")
```

### Versão Modular

```python
def calcular_area_retangulo(base, altura):
    return base * altura

base   = float(input("Digite a base: "))
altura = float(input("Digite a altura: "))

area = calcular_area_retangulo(base, altura)
print(f"Área: {area:.2f}")
```

### Por que `float`?

Usamos `float` em vez de `int` para aceitar valores decimais como `3.5` ou `12.75`, tornando o programa mais realista.

### Diferença entre `print` e `return`

| Conceito | O que faz |
|----------|-----------|
| `print`  | Exibe na tela — não guarda o valor |
| `return` | Devolve o valor para quem chamou a função |

Com `return`, podemos usar o resultado em outros cálculos futuramente.

---

## ▶️ Como Executar

```bash
cd desafio2
python main.py
```

---

## 💡 O que você aprende aqui

- Uso de `float` para entrada de dados decimais
- Diferença entre `print` e `return` em funções
- Formatação de saída com `:.2f` (duas casas decimais)
- Funções que **retornam valores**
