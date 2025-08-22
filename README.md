# Biblioteca

> A ideia deste projeto foi estruturada pelo Google Gemini, e compreende os conhecimentos sobre operadores, controles de fluxo, loop, programação orientada a objetos, arrays, herança, annotations, imutabilidade, interfaces, classes abstratas e polimorfismo.

---

Este projeto consiste em criar um sistema de gerenciamento para uma biblioteca, rodando via console. O objetivo é aplicar de forma coesa os principais pilares da Programação Orientada a Objetos.

## Descrição do Projeto

Criar um sistema que permite adicionar, buscar, listar e gerenciar o empréstimo de itens de uma biblioteca. Para tornar o projeto mais interessante, a biblioteca não terá apenas livros, mas também outros tipos de mídia, como revistas ou artigos digitais.

### Conceitos Aplicados

- [x]  **Programação Orientada a Objetos:** Classes principais como `Livro`, `Revista`, `Membro`, `Biblioteca`.
- [x]  **Herança e Classes Abstratas:** Criar uma classe abstrata `ItemBiblioteca` com atributos comuns (título, autor, ano de publicação). `Livro` e `Revista` herdarão dela.
- [x]  **Interfaces:** Crie uma interface `Emprestavel` com os métodos `emprestar(Membro membro)` e `devolver()`. A classe `Livro` implementaria essa interface, mas talvez a `Revista` não (ou teria regras diferentes).
- [x]  **Polimorfismo:** A classe `Biblioteca` terá um `Array` (ou `ArrayList`) de `ItemBiblioteca`. Os métodos de busca e listagem deverão tratar `Livro` e `Revista` de forma polimórfica.
- [x]  **Imutabilidade:** Crie uma classe `Autor` com atributos como nome e data de nascimento. Garanta que um objeto `Autor` seja imutável após sua criação.
- [x]  **Controle de Fluxo e Loops:** Para criar o menu de interação com o usuário no console (ex: "1 - Adicionar Livro", "2 - Buscar por Título", etc.).

### Estrutura Sugerida

- **Modele as classes:**
    - [x]  `Autor` (imutável).
    - [x]  `ItemBiblioteca` (abstrata).
    - [x]  `Livro` (herda de `ItemBiblioteca`, implementa `Emprestavel`).
    - [x]  `Revista` (herda de `ItemBiblioteca`).
    - [x]  `Membro`.
- **Crie a classe `Biblioteca`:**
    - [x]  Deve conter um `ArrayList<ItemBiblioteca>` para o acervo.
    - [x]  Deve ter métodos para `adicionarItem`, `buscarPorTitulo`, `listarTodosOsItens`.
- **Implemente a lógica de empréstimo:**
    - [x]  Controle se um item está disponível ou emprestado.
    - [x]  Associe o empréstimo a um `Membro`.
- **Crie a classe `Main`:**
    - [x]  Implemente um menu de texto para que o usuário possa interagir com o sistema.

### Desafio Extra
    - [ ] Implementar o sistema de empréstimo e devolução associada à um membro.