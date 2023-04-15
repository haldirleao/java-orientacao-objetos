## Bootcamp DIO / Banco Pan Java Developer
### Módulo: Programação Orientada a Objetos com Java
### Instrutor: Thiago Leite e Carvalho
https://www.linkedin.com/in/thiago-leite-e-carvalho-1b337b127

Engenheiro de Software, Java backend developer (SERPRO), professor, escritor.

## Tópicos estudados - Orientação a objetos:
### Por que usar?
  
| PE (Programação Estruturada)           | POO (Programação orientada a objetos)                                                    |
|----------------------------------------|------------------------------------------------------------------------------------------|
| Tem uma representação mais simplista.  | Tem uma representação mais realista (mais próximas do mundo real).                       |
| Focada em operações (funções) e dados. | Focada na modelagem de entidades e nas interações entre elas.                            |
| Focada no "como fazer".                | Focada no "o que fazer".                                                                 |
|                                        | Melhor coesão<br/>Melhor acoplamento<br/>Diminuição do gap semântico<br/>Coletor de lixo |

### Fundamentos

>_"A **Orientação a Objetos** é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos"_

**Abstração**: processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos

**Reuso**: capacidade de criar novas unidades de código a partir de outras já existentes.

**Ensapsulamento**: capacidade de esconder complexidades e proteger dados.

### Estrutura básica da OO

#### **Classe** https://pt.wikipedia.org/wiki/Classe_(programa%C3%A7%C3%A3o)
  
  Exemplos de classes: Veículo, Livro, Venda, Viagem, Animal, Imóvel, Casa.
  
  Dicas: são substantivos, possuem nomes significativos, o contexto deve ser considerado.

  #### **Atributo** https://pt.wikipedia.org/wiki/Atributo_(computa%C3%A7%C3%A3o)
  
  Exemplos: Na  classe Carro temos atributos como: fabricante, modelo, ano, cor, etc. Já na classe Pessoa: nome, sobrenome, data de nascimento, etc.
  
  **Atributos vs Variáveis**. Atributos são próprios e peculiares a alguém ou algo. Variáveis: "que podem variar", inconstante, instável. Ao programar na linguagem Java, não existe distinção entre as duas denominações, porém é importante reconhecer as diferenças no que se refere aos paradigmas da POO e PE.

  #### **Método** https://pt.wikipedia.org/wiki/M%C3%A9todo_(programa%C3%A7%C3%A3o)
  
  Exemplos: Na classe Carro temos métodos como: ligar, abrirCapo, virarAEsquerda, virarADireita, frear, buzinar, etc.
  
  
  Dicas: são verbos, possuem nomes signiticativos, o contexto deve ser considerado.
  
  Na OO existem dois métodos especiais. **Construtor**: inicializa (instancia) um objeto na programação orientada a objetos. Em muitas linguagens de programação, um construtor tem o mesmo nome da classe na qual cria o objeto. **Destrutor**: chamado pelo coletor de lixo em um objeto quando a coleta de lixo determina que não há mais referências ao objeto. Auxilia na destruição do objeto instanciado, liberando recursos do sistema.
 
  #### **Objeto** https://pt.wikipedia.org/wiki/Objeto_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)
  
  Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore, etc) ou conceitual (viagem, estoque, compra, etc). Possui um significado bem definido para um determinado software. Inicialmente se define a classe, a partir da qual serão instanciados objetos distintos.

  #### **Mensagem** https://en.wikipedia.org/wiki/Message_passing
  
  É o processo de ativação de um método de um objeto. Ocorre quando uma requisição (chamada) ao método é realizada, disparando a execução de seu comportamento descrito por sua classe. Pode também ser requisitada diretamente à classe (método estático).

  Conceitos não detalhados neste curso, com a sugestão do instrutor que sejam estudados e entendidos futuramente:
  - Instância vs Estático: atributos e métodos "do objeto" e "da classe".
  - Estado de um objeto.
  - Identidade de um objeto.
  - Representação numérica de um objeto.
  - Reprentação padrão de um objeto.
 
### As relações: Herança, Associação e Interface
### A organização de pacotes e visibilidades

#### Herança https://pt.wikipedia.org/wiki/Heran%C3%A7a_(programa%C3%A7%C3%A3o_orientada_a_objetos)

>"É o relacionamento entre classes em que uma classe chamada de **subclasse** (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de **superclasse** (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue
reaproveitar os atributos e métodos dela. Além dos que 
venham a ser herdados, a subclasse pode definir
seus próprios membros."

**membros da classe = (atributos + métodos) da classe**

**Herança simples**: a classe filha tem somente uma classe mãe.

**Herança múltipla**: a classe filha tem uma ou mais classes mães. Na linguagem Java não há como implementar heranças múltiplas.

**Upcasting** é fazer um objeto se passar por um objeto que seja um supertipo dele. Ele sempre funcionará já que todo objeto é completamente compatível com um tipo do qual ele foi derivado. Como sempre pode ser realizado, é possível fazer implicitamente, ou seja, o compilador faz por você quando for necessário. Algumas pessoas gostam de chamar de **promoção de tipo**.

**Downcasting** é quando o objeto se passa como se fosse um subtipo dele. Não há garantias que funcione (pode lançar uma `ClassCastException`, o que obviamente é um erro de programação) e pode haver necessidade de conversões. O compilador só aceita se ele puder provar que o objeto se encaixará perfeitamente e seja de fato aquele objeto. Por isso deve ser explicitado pelo programador quando deseja essa ação. A coerção ocorre em tempo de execução. Algumas pessoas gostam de chamar de **demoção de tipo** (apesar de ser um neologismo). **CUIDADO! ao usar o downcasting, já que pode ocorrer erros, inclusive em tempo de execução!**

**Polimorfismo**

#### Associação


#### Interface

🚧 Em construção 🚧

### Materiais de apoio
- https://github.com/tlcdio - Github com projetos de exemplos utilizados nos cursos DIO com o instrutor Thiago Leite.
- [Livro Orientação a Objetos- Aprenda seus conceitos e suas aplicabilidades de forma efetiva, Thiago Leite e Carvalho](https://www.casadocodigo.com.br/products/livro-oo-conceitos)
- https://pt.wikipedia.org/wiki/Programa%C3%A7%C3%A3o_orientada_a_objetos
- https://www.webopedia.com/definitions/constructor/
- https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#finalize()
- https://www.w3schools.com/java/ref_keyword_this.asp
- https://stackoverflow.com/questions/32447678/omitting-public-modifier-in-java-methods
- https://pt.stackoverflow.com/questions/131091/o-que-%C3%A9-upcasting-e-downcasting-na-linguagem-java

---
haldirleao

Iniciado em 14/abr/2023. Concluído em dd/abr/2023.
