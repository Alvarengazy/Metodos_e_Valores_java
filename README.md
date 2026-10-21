 <div align="center">

# ☕ Java — Methods & Return Values

**Repeat less. Reuse more. Code with purpose.**

A practical guide to methods in Java: parameters, return values, conditional logic, and method composition.

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Documentation](https://img.shields.io/badge/Documentation-Bilingual-blue)

[English](#-english) · [Português](#-português) · [Roadmap](#-roadmap) · [Project Structure](#-project-structure)

</div>

---

<details open>
<summary><h2>🇺🇸 English</h2></summary>

## About the project

This project documents the fundamentals of methods in Java. Methods allow code to be organized into reusable blocks, receive information through parameters, return calculated values, and work together to solve problems.

## What you will find here

- **Methods with parameters** — receive information and use it inside a method.
- **Return values** — understand `return`, `void`, and return types.
- **Conditional logic** — combine `if/else` with methods that return `boolean`.
- **Method composition** — call one method from another and reuse existing logic.
- **Practical examples** — simple programs that can be compiled and tested.

## 1. Methods with parameters

Parameters allow a method to receive information when it is called.

```java
public static void dados(String nome, int idade, String cidade) {
    System.out.println(
        "Hello, " + nome +
        ". Your age is " + idade +
        " and your city is " + cidade
    );
}

public static void main(String[] args) {
    dados("João", 17, "Juiz de Fora");
    dados("Maria", 25, "Rio de Janeiro");
}
```

**How it works:**

1. `dados` declares three parameters: `nome`, `idade`, and `cidade`.
2. The method call supplies the corresponding arguments.
3. The method uses those values to display a personalized message.
4. The same method can be called multiple times with different arguments.

**Key distinction:** parameters are declared in the method definition; arguments are the actual values supplied when calling it.

## 2. Return values: `return` and `void`

A method declared with `void` does not return a value. A method declared with a type such as `int`, `double`, or `boolean` must return a compatible value.

### Using `void`

```java
public static void somarEExibir(int a, int b) {
    System.out.println(a + b);
}
```

This method performs an action: it calculates and displays the sum.

### Returning a value

```java
public static int somar(int a, int b) {
    return a + b;
}
```

This method returns the sum instead of displaying it.

The returned value can be displayed directly:

```java
System.out.println(somar(10, 5));
```

Output:

```text
15
```

It can also be stored for later use:

```java
int resultado = somar(10, 5);
System.out.println(resultado);
```

**Important principle:** an intermediate variable is optional. Use one when you need to reuse the result, perform further operations, or improve readability.

### Common return types

| Return type | Purpose |
|---|---|
| `int` | Returns an integer |
| `double` | Returns a decimal number |
| `boolean` | Returns `true` or `false` |
| `String` | Returns text |
| `void` | Does not return a value |

## 3. Conditional logic and return values

Methods can evaluate a condition and return a result based on it.

```java
public static boolean maioridade(int idade) {
    if (idade >= 18) {
        return true;
    } else {
        return false;
    }
}
```

Usage:

```java
System.out.println(maioridade(20));
System.out.println(maioridade(15));
```

Output:

```text
true
false
```

The condition can also be returned directly because the comparison itself produces a boolean value:

```java
public static boolean maioridade(int idade) {
    return idade >= 18;
}
```

Both implementations have the same behavior.

### Printing versus returning

Printing a message and returning a value are different operations.

```java
public static boolean aprovado(double media) {
    if (media >= 7) {
        System.out.println("Approved");
        return true;
    } else {
        System.out.println("Not approved");
        return false;
    }
}
```

- `System.out.println()` displays a message.
- `return` sends a value back to the caller.
- `boolean` specifies the type of value the method returns.

A method can perform both operations.

## 4. Calling methods from other methods

One method can call another method and use its return value. This allows existing logic to be reused instead of duplicated.

```java
public static int somar(int a, int b) {
    return a + b;
}

public static int dobrarSoma(int a, int b) {
    return somar(a, b) * 2;
}
```

Usage:

```java
System.out.println(dobrarSoma(3, 4));
```

Output:

```text
14
```

**Execution flow:**

1. `dobrarSoma(3, 4)` receives two arguments.
2. `somar(3, 4)` returns `7`.
3. The returned value is multiplied by `2`.
4. `dobrarSoma` returns `14`.
5. `System.out.println()` displays the result.

Notice that no intermediate variable is required.

### When should methods be separated?

A single method can sometimes perform the entire operation. Separating methods is useful when it improves reuse, readability, or maintainability.

For example, if several parts of a program need the same calculation, keeping that calculation in one method prevents duplicated logic.

**The goal is not to create as many methods as possible. It is to give each method a useful responsibility.**

## Choosing the right approach

| Approach | Best used when |
|---|---|
| `void` method | Performing an action without returning a value |
| Method with a return type | Producing a value that another part of the program can use |
| Conditional return | Making a decision and returning its result |
| Calling another method | Reusing existing logic and separating responsibilities |

## Important principles

- Choose a return type that matches the value the method must produce.
- A method with a non-`void` return type must return a compatible value on every possible normal execution path.
- Parameters define what information a method receives.
- Return values allow methods to communicate results.
- Avoid unnecessary duplication, but do not split simple code into methods without a good reason.
- In Java, method names conventionally begin with a lowercase letter, such as `calcularMedia` or `maioridade`.

</details>

---

<details>
<summary><h2>🇧🇷 Português</h2></summary>

## Sobre o projeto

Este projeto documenta os fundamentos dos métodos em Java. Métodos permitem organizar o código em blocos reutilizáveis, receber informações por parâmetros, retornar valores calculados e trabalhar em conjunto para resolver problemas.

## O que você encontrará aqui

- **Métodos com parâmetros** — recebem informações e as utilizam dentro do método.
- **Valores de retorno** — entendem o funcionamento de `return`, `void` e os tipos de retorno.
- **Lógica condicional** — combinam `if/else` com métodos que retornam `boolean`.
- **Composição de métodos** — chamam um método dentro de outro e reutilizam lógica existente.
- **Exemplos práticos** — programas simples para compilar e testar.

## 1. Métodos com parâmetros

Os parâmetros permitem que um método receba informações no momento em que é chamado.

```java
public static void dados(String nome, int idade, String cidade) {
    System.out.println(
        "Olá, " + nome +
        ". Sua idade é " + idade +
        " e sua cidade é " + cidade
    );
}

public static void main(String[] args) {
    dados("João", 17, "Juiz de Fora");
    dados("Maria", 25, "Rio de Janeiro");
}
```

**Como funciona:**

1. `dados` declara três parâmetros: `nome`, `idade` e `cidade`.
2. A chamada do método fornece os argumentos correspondentes.
3. O método utiliza esses valores para exibir uma mensagem personalizada.
4. O mesmo método pode ser chamado várias vezes com argumentos diferentes.

**Distinção importante:** parâmetros são declarados na definição do método; argumentos são os valores reais fornecidos na chamada.

## 2. Valores de retorno: `return` e `void`

Um método declarado com `void` não retorna um valor. Já um método declarado com um tipo como `int`, `double` ou `boolean` precisa retornar um valor compatível.

### Usando `void`

```java
public static void somarEExibir(int a, int b) {
    System.out.println(a + b);
}
```

Esse método executa uma ação: calcula e exibe a soma.

### Retornando um valor

```java
public static int somar(int a, int b) {
    return a + b;
}
```

Esse método retorna a soma em vez de exibi-la diretamente.

O valor retornado pode ser exibido sem criar uma variável:

```java
System.out.println(somar(10, 5));
```

Saída:

```text
15
```

Também é possível armazená-lo para utilizá-lo posteriormente:

```java
int resultado = somar(10, 5);
System.out.println(resultado);
```

**Princípio importante:** uma variável intermediária é opcional. Utilize-a quando precisar reutilizar o resultado, realizar outras operações ou melhorar a legibilidade.

### Tipos de retorno comuns

| Tipo de retorno | Finalidade |
|---|---|
| `int` | Retorna um número inteiro |
| `double` | Retorna um número decimal |
| `boolean` | Retorna `true` ou `false` |
| `String` | Retorna um texto |
| `void` | Não retorna um valor |

## 3. Lógica condicional e valores de retorno

Métodos podem avaliar uma condição e retornar um resultado de acordo com ela.

```java
public static boolean maioridade(int idade) {
    if (idade >= 18) {
        return true;
    } else {
        return false;
    }
}
```

Uso:

```java
System.out.println(maioridade(20));
System.out.println(maioridade(15));
```

Saída:

```text
true
false
```

A condição também pode ser retornada diretamente, porque a própria comparação produz um valor booleano:

```java
public static boolean maioridade(int idade) {
    return idade >= 18;
}
```

As duas implementações apresentam o mesmo comportamento.

### Imprimir versus retornar

Imprimir uma mensagem e retornar um valor são operações diferentes.

```java
public static boolean aprovado(double media) {
    if (media >= 7) {
        System.out.println("Você está aprovado");
        return true;
    } else {
        System.out.println("Você está reprovado");
        return false;
    }
}
```

- `System.out.println()` exibe uma mensagem.
- `return` devolve um valor para quem chamou o método.
- `boolean` define o tipo de valor retornado.

Um método pode realizar as duas operações.

## 4. Chamadas entre métodos

Um método pode chamar outro método e utilizar o valor que ele retorna. Isso permite reutilizar operações existentes em vez de duplicar sua lógica.

```java
public static int somar(int a, int b) {
    return a + b;
}

public static int dobrarSoma(int a, int b) {
    return somar(a, b) * 2;
}
```

Uso:

```java
System.out.println(dobrarSoma(3, 4));
```

Saída:

```text
14
```

**Fluxo de execução:**

1. `dobrarSoma(3, 4)` recebe dois argumentos.
2. `somar(3, 4)` retorna `7`.
3. O valor retornado é multiplicado por `2`.
4. `dobrarSoma` retorna `14`.
5. `System.out.println()` exibe o resultado.

Observe que nenhuma variável intermediária é necessária.

### Quando separar métodos?

Um único método pode realizar toda a operação. Separar métodos é útil quando isso melhora a reutilização, a legibilidade ou a manutenção do código.

Por exemplo, se diferentes partes de um programa precisarem realizar o mesmo cálculo, manter esse cálculo em um único método evita duplicação da lógica.

**O objetivo não é criar o maior número possível de métodos. É atribuir a cada método uma responsabilidade útil.**

## Como escolher a abordagem

| Abordagem | Quando usar |
|---|---|
| Método `void` | Para executar uma ação sem retornar um valor |
| Método com tipo de retorno | Para produzir um valor que outra parte do programa utilizará |
| Retorno condicional | Para tomar uma decisão e retornar seu resultado |
| Chamada entre métodos | Para reutilizar lógica e separar responsabilidades |

## Princípios importantes

- Escolha um tipo de retorno compatível com o valor que o método deve produzir.
- Um método com retorno diferente de `void` precisa retornar um valor compatível em todos os caminhos normais possíveis de execução.
- Os parâmetros definem quais informações o método recebe.
- Os valores de retorno permitem que os métodos comuniquem resultados.
- Evite duplicação desnecessária, mas não divida operações simples em métodos sem uma boa razão.
- Em Java, os nomes dos métodos convencionalmente começam com letra minúscula, como `calcularMedia` e `maioridade`.

</details>

---

## 🗺️ Roadmap

- [x] Understand the purpose of methods / Entender o propósito dos métodos
- [x] Study methods with parameters / Estudar métodos com parâmetros
- [x] Study return values and `void` / Estudar valores de retorno e `void`
- [x] Combine conditionals with `boolean` returns / Combinar condicionais com retornos `boolean`
- [x] Call methods from other methods / Chamar métodos dentro de outros métodos
- [x] Practice method composition / Praticar a composição de métodos
- [x] Document examples in English and Portuguese / Documentar exemplos em inglês e português

---

## 📁 Project Structure

```text
Java-Learning-Library/
├── README.md
└── Fundamentos/
    ├── MetodosComParametros.java
    ├── MetodosComRetorno.java
    ├── CondicionaisERetorno.java
    ├── ChamadasEntreMetodos.java
    └── SistemaAprovacao.java
```

*Adjust the filenames in this tree to match the actual names used in your repository. Each public Java class must have the same name as its file.*

---

## 🧠 Philosophy

> Understand the responsibility. Return meaningful values. Reuse logic with intention.

> Entenda a responsabilidade. Retorne valores significativos. Reutilize a lógica com intenção.

<div align="center">

Made with ☕, curiosity, and consistency.

</div>