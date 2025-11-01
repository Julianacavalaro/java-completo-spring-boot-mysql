# Java OO Fundamentals

Este módulo demonstra os fundamentos de Programação Orientada a Objetos em Java.

## Conceitos demonstrados

- **Encapsulamento**: Classe `Produto` mostra atributos privados com getters/setters
- **Herança**: Classes `ContaPoupanca` e `ContaEmpresa` herdam de `Conta`
- **Polimorfismo**: Métodos sobrescritos nas classes filhas
- **Abstração**: Classe abstrata `Conta`

## Executar

```bash
mvn clean compile
```

## Classes

### Produto
Classe simples demonstrando encapsulamento básico.

### Conta (Abstract)
Classe abstrata que representa uma conta bancária genérica.

### ContaPoupanca
Conta de poupança com juros.

### ContaEmpresa
Conta empresarial com limite de empréstimo.
