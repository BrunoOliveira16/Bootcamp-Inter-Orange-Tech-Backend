# 📌 **Operadores Lógicos**

## ✅ Conceituação
São simbolos especiais quais são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado.

Tipos:

- Conjunção;

- Disjunção;

- Disjunção exclusiva;

- Negação;

&nbsp;

## 📎 **Conjunção**
É uma operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdadeiras.

Simbologia: &&

Terminologia: and(e)

| O-E | O-E | R |
|--- |--- |--- |
| V | V | V |
| V | F | F |
| F | V | F |
| F | F | F |

O - Operando | E - Expressão | R - Resultado

&nbsp;

## 📎 **Disjunção**
É uma operação lógica que só é falso quando ambos os operandos ou expressões envolvidas são falsos.

Simbologia: ||

Terminologia: or(ou)

| O-E | O-E | R |
|--- |--- |--- |
| V | V | V |
| V | F | V |
| F | V | V |
| F | F | F |

O - Operando | E - Expressão | R - Resultado

&nbsp;

## 📎 **Disjunção Exclusiva**
É uma operação lógica que só é verdadeiro quando ambos os operandos ou expressões são opostos.

Simbologia: ^

Terminologia: xor

| O-E | O-E | R |
|--- |--- |--- |
| V | V | F |
| V | F | V |
| F | V | V |
| F | F | F |

O - Operando | E - Expressão | R - Resultado

&nbsp;

## 📎 **Negação**
É uma operação lógica que inverte o valor lógico de um operando ou expressão.

Simbologia: !

Terminologia: inversão

| O-E | R |
|--- |--- |
| V | F |
| F | V |

O - Operando | E - Expressão | R - Resultado

&nbsp;

## ✅ Utilização
### Qual Utilizar?
Vai depender muito da real necessidade ou tipo de decisão que se deseja tomar, uma vez que estes operadores ou expressões lógicas são utilizadas dentro de estruturas de controle de fluxo.

### Curiosidades
> Os operadores abaixo não são operadores lógicos!

- Operador bitwise: & e | 

- Operadores shift: ~, >>, >>>, <<

&nbsp;

## ✅ Exemplos

```

boolean b1 = true;
boolean b2 = false;
boolean b3 = true;
boolean b4 = false;

b1 && b2
b1 && b3

b2 || b3
b2 || b4

b1 ^ b3
b4 ^ b1

!b1
!b2

(i1 > i2) || (f2 < f1)
((i1 + i2) < (f2 - f1)) && true

```

&nbsp;

## ✅ Boas Práticas
### Crie variáveis auxiliares para guardar resultados intermediários

&nbsp;

```

double salarioMensal = 11893.58d;
double mediaSalario = 10500d;

int quantidadeDependentes = 4;
int mediaDependentes = 2;

System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

boolean salarioBaixo = salarioMensal < mediaSalario;
boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

System.out.println((salarioBaixo) && (muitosDependentes));

boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
System.out.println("Recebe auxilio: " + recebeAuxilio);

```
