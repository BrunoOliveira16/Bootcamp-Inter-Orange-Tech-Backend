# 📌 **Controle de Fluxo**

## ✅ Conceituação
São estrtuturas que tem a capacidade de direcionar o fluxo de execução do código.

Tipos:

### Decisão:
- if
- if-else
- if-else-if
- switch
- Operador ternário

### Repetição:
- for
- while
- do while

### Interrupção
- break
- continue
- return

&nbsp;

## ✅ Criação
### **Decisão:** 
estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução.

- **Opções:** if(se), switch(escolha) e operador ternário

## if(se)
```
// Estrutura
if(condição){ } 

if(condição){ 
} else{ }  

if(condição){ 
} else if(condição){ 
} else { }

// Exemplo
if(idade > 18){}

if(aprovado){
} else { }

if(casado && temFilhos){
} else if(casado && semFilhos){
} else { }
                    
```
&nbsp;

## Operador ternário
```
// Estrutura
condição ? true : false;

condição ? true : null;

// Exemplo
ligado ? desligar : ligar;

emMovimento ? freia : null;
```
&nbsp;

## switch(escolha)
```
// Estrutura
variável: byte, short, char, int, Enum, String

switch (variável) {
    case 1 :
        break;
    case ...:
        break;
    default :
        break;
}

// Exemplo
switch(olhos) {
    case "AZUL" :
        break;
    case "VERDE" :
        break;
    case "CASTANHO" :
        break;
    default :
        break;
}
```
&nbsp;

## ✅ Boas Práticas
- Switch é para valores exatos e if para expressões booleanas

- Evitar usar o default do switch para "case genéricos"

- Evitar o efeito "flecha" dos if's

- Evitar muitos if's aninhados

- Usar a boa prática da aula 2 para diminuir o tamanho if

