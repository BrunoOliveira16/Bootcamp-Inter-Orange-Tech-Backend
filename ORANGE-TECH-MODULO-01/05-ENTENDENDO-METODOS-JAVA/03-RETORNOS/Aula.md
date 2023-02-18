# 📌 **Retornos**
É uma instrução de interrupção. Simbologia: return

## ✅ **Funcionamento**
O método executa seu retorno quando:
- Completa todas suas instruções internas
- Chega a uma declaração explícita de retorno
- Lança uma exceção

<br>

## ✅ **Considerações**
- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;

- O tipo de dado do return deve ser compatível com o do método;

- Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.

Exemplos:
```
public String getMensagem() {
   return "Ola!";
}

public void setIdade(...) {
    return 10;
}

public double getJuros() {                 
   return 2.36;                                       
}

public void executar() {
    ...
    return; 
    ...
}

public int getParcelas() {
   return 1.36f;
}

```