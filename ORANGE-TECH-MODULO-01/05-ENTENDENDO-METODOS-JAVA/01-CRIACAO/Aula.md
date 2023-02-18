# 📌 **Criação**

## ✅ **Conceituação**
É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.

<br>

## ✅ **Definição**
Padrão de definição:
```
<?visibilidade?><?tipo?><?modificador?>retorno
nome(<?parâmetro?>)<?exceções?>corpo
```
*Oque está com interrogação é opcional, já retorno, nome e corpo são obrigatórios*

<br>

### 📝 **Criação**
onde:

- **visibilidade:** "public", "protected" ou "private"
- **tipo:** concreto ou abstrato
- **modificador:** "static" ou "final"
- **retorno:** tipo de dado ou "void"
- **nome:** nome que é fornecido ao método
- **parâmetro:** parâmetros que pode receber
- **exceções:** exceções que pode lançar
- **corpo:** código que possui vazio

Exemplos
```
public String getNome() {...}

public double calcularTotalNota() {...}

public int verificarDistancia(int coordenada1, int cordenada2) {...}

public abstract void executar;

public void alterarFabricante(Fabricante fabricante) {...}

public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras) {...}

public static R N(P) {...}
```

<br>

### 📝 **Utilização**
Passa-se uma mensagem através de uma classe ou objeto.
```
nome_da_classe.nome_do_metodo(); //sem parâmetros
ou
nome_da_classe.nome_do_metodo(...); //com parâmetros

nome_da_objeto.nome_do_metodo(); //sem parâmetros
ou
nome_da_objeto.nome_do_metodo(...); //com parâmetros

//classe
Math.random();
ou
Math.sqrt(4);

//objeto
usuario.getEmail();
ou
usuario.alterarEndereco(endereco);
```

<br>

## ✅ **Particularidades**
### **Assinatura:** 
É a forma de identificar unicamente o método

Ass = nome + parâmetros

**Método:**
```
public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3) {...}
```

<br>

**Assinatura:**
```
calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)
```

<br>

### **Construtor e Destrutor:** 
São métodos especiais usados na orientação a objetos.

### **Mensagem:** 
É o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe..

<br>

### 📝 **Particularidades**
Passagem de parâmetros:
- Por valor (cópia)
- Por referência (endereço)

Passagem de parâmetros por valor (cópia):
```
int i = 10;
public void fazerAlgo (int i) {

    i = i + 10
    System.out.println('Valor de i dentro: " + i);
}
System.out.println('Valor de i fora: " + i);
```

<br>

### 📝 **Boas Práticas**
- Nomes devem ser descritivos, mas curtos
- Notação camelo
```
verificarSaldo(); executarTransferencia(...); existeDebito();
```
- Deve possuir entre 80 e 120 linhas
- Evite lista de parâmetros longas
- Visibilidade adequadas