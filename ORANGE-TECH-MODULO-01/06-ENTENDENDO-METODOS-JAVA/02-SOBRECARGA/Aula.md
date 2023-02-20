# 📌 **Sobrecarga**
## ✅ **Conceituação**
É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.

<br>

## ✅ **Conceituação**
Alterar a assinatura do método:

Ass = nome + parâmetros
```
converterParaInteiro(float f);
converterParaInteiro(double d);
converterParaInteiro(String s);
converterParaInteiro(float f, RoundType rd);
converterParaInteiro(double d, RoundType rd);
converterParaInteiro(String s, RoundType rd);

converterParaInteiro(RoundType rd, String s);
converterParaInteiro();
```
*Tenha em mente que ao mudar a lista de parâmetros e manter o nome do método, são as condições para se ter uma sobrecarga.*

<br>

## ✅ **Exemplos**
```
void              println()
void              println(boolean x)
void              println(char x)
void              println(char[] x)
void              println(double x)
void              println(float x)
void              println(int x)
void              println(long x)
void              println(Object x)
void              println(String x)
```
```
static String              valueOf()
static String              valueOf(boolean b)
static String              valueOf(char c)
static String              valueOf(char[] data)
static String              valueOf(char[] data, int offset, int count)
static String              valueOf(float f)
static String              valueOf(int i)
static String              valueOf(long l)
static String              valueOf(Object obj)
static String              valueOf(double d)
```

