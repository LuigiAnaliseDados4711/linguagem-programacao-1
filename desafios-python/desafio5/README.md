# Desafio 5 — Conversor de Temperatura

## 📋 Descrição do Problema

Criar um programa que converta uma temperatura de **Celsius para Fahrenheit** usando a fórmula matemática correta.

Resolvido em duas versões:

- **Versão 1 (Procedural):** cálculo direto na sequência do programa.
- **Versão 2 (Modular):** função `celsius_para_fahrenheit()` que recebe o valor e **retorna** o resultado convertido.

---

## 🧠 Explicação da Solução

### Fórmula de conversão

```
Fahrenheit = (Celsius × 9/5) + 32
```

Exemplos:

| Celsius | Fahrenheit |
|---------|-----------|
| 0°C     | 32°F      |
| 100°C   | 212°F     |
| -40°C   | -40°F     |
| 37°C    | 98.6°F    |

### Versão Modular

```python
def celsius_para_fahrenheit(celsius):
    return (celsius * 9 / 5) + 32

celsius    = float(input("Temperatura em Celsius: "))
fahrenheit = celsius_para_fahrenheit(celsius)

print(f"{celsius:.1f}°C → {fahrenheit:.1f}°F")
```

### Por que `9/5` e não `1.8`?

Ambos são equivalentes matematicamente (`9/5 = 1.8`). Usar `9/5` deixa a **fórmula original** mais visível no código, facilitando a leitura e manutenção.

### Separação de responsabilidades

- O `main` cuida da **interface** (entrada e exibição).
- A função cuida do **cálculo**.

Isso é o princípio **SRP (Single Responsibility Principle)** na prática.

---

## ▶️ Como Executar

```bash
cd desafio5
python main.py
```

---

## 💡 O que você aprende aqui

- Entrada de dados com `float` para aceitar decimais
- Aplicação de fórmulas matemáticas em código
- Formatação de saída com `:.1f` (uma casa decimal)
- Separação entre lógica de negócio e interface
