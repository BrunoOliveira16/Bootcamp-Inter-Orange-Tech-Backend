# 📌 **Programação Orientada a Objetos**
## 📝 **Método**
<hr><br>

## ✅ **Definição**
É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento.

Exemplos:
- Carro
    - ligar

- Comprador
    - realizar torca

- Viagem
    - calcular total

<br>

### ✅ **Criação**

Java e C#
- Visibilidade
- Retorno
- Nome
- Parâmetros

Python
- def
- Nome
- Parâmetros

<br>

## ✅ **Dicas**
- Verbos
- Nome significativos
- Contexto deve ser considerado

<br>

## ✅ **Código**
```
// Java
class Carro {
    void frear() {
        ...
    }
}

// C#
class Carro {
    void frear() {
        ...
    }
}

// Python
class Carro:
    def frear ()
        ...
```

<br>

## ✅ **Metodos**
Dois métodos especiais:
- Construtor
- Destrutor

### **Constructor**
```
// Java
class Carro {
    Carro() {
        ...
    }
}

// C#
class Carro {
    Carro() {
        ...
    }
}

// Python
class Carro:
    def __init__(self):
        ...
```

<br>

### **Destrutor**
```
// Java
class Carro {
    void finalize() {
        ...
    }
}

// C#
class Carro {
    ~Carro() {
        ...
    }
}

// Python
class Carro:
    def __del__(self):
        ...
```

<br>

## ✅ **Sobrecarga:**
Mudar a assinatura de acordo com a necessidade
- Assinatura: nome + parâmetros

<br>

```
// Java
m1()
m1(int i)
m1(float f)
m1(String s, long l)
m1(long l, String s)

// C#
M1()
M1(int i)
M1(float f)
M1(String s, long l)
M1(long l, String s)

// Python
N/A
```