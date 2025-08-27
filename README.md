# HomeOffice do dia 26 de agosto

entrega via pullRequest! lembrando quem nao fizer e falta pessoal! 
---

## 🧭 Desafio: "Museu da Programação — A Jornada do Java"

### 🎯 Objetivo
Criar uma aplicação Java que simule um museu interativo sobre a história da linguagem Java, utilizando conceitos de orientação a objetos: classes, objetos, encapsulamento, herança e polimorfismo.

---

### 🏛️ Contexto Narrativo
Imagine que os alunos são desenvolvedores contratados para criar o sistema de um museu virtual chamado **"Museu da Programação"**, onde visitantes podem explorar salas temáticas sobre a evolução do Java, seus criadores, versões marcantes e curiosidades.

---

### 🧱 Requisitos Técnicos

#### 1. **Classes Base**
- `Sala`: classe abstrata com atributos como `nome`, `descricao`, `anoCriacao`.
- `Visitante`: com atributos como `nome`, `idade`, e método `explorarSala(Sala sala)`.

#### 2. **Herança**
- Criar subclasses de `Sala`, como:
  - `SalaFundadores`: fala sobre James Gosling e a Sun Microsystems.
  - `SalaVersoes`: mostra as principais versões do Java (Java 1.0, 5, 8, 17...).
  - `SalaCuriosidades`: exibe fatos curiosos (ex: por que o nome Java?).

#### 3. **Polimorfismo**
- Cada sala deve ter um método `exibirConteudo()` que se comporta de forma diferente em cada tipo de sala.

#### 4. **Interatividade**
- Criar um menu no terminal onde o usuário (visitante) escolhe qual sala visitar.
- Ao visitar, o conteúdo é exibido com base na lógica da sala específica.

---

### 💡 Extras para quem quiser ir além
- Criar uma interface `Interativa` com métodos como `responderQuiz()` ou `verVideo()`.
- Implementar um sistema de pontos: cada sala visitada dá pontos ao visitante.
- Salvar o progresso do visitante em um arquivo `.txt`.

---

### 🧠 Fundamentos Reforçados
- História do Java
- Classes e objetos
- Herança e polimorfismo
- Abstração e encapsulamento
- Interação via terminal


MuseuJava/
├── src/
│   ├── museu/
│   │   ├── Main.java
│   │   ├── Visitante.java
│   │   ├── Sala.java
│   │   ├── SalaFundadores.java
│   │   ├── SalaVersoes.java
│   │   ├── SalaCuriosidades.java
│   │   └── Interativa.java
├── README.md
└── .gitignore
---

