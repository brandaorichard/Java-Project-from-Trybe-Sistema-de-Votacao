<!-- Olá, Tryber!
Esse é apenas um arquivo inicial para o README do seu projeto.
É essencial que você preencha esse documento por conta própria, ok?
Não deixe de usar nossas dicas de escrita de README de projetos, e deixe sua criatividade brilhar!
:warning: IMPORTANTE: você precisa deixar nítido:
- quais arquivos/pastas foram desenvolvidos por você; 
- quais arquivos/pastas foram desenvolvidos por outra pessoa estudante;
- quais arquivos/pastas foram desenvolvidos pela Trybe.
-->
# Sistema de Votação Eletrônico

Este projeto é um sistema de votação eletrônico desenvolvido em Java, que permite o cadastro de pessoas candidatas e eleitoras, gerencia o processo de votação e exibe os resultados. O objetivo é praticar a lógica de programação orientada a objetos (POO) e aplicar conceitos fundamentais como classes, herança, encapsulamento, polimorfismo e interfaces.

## Funcionalidades

#### Cadastro de Pessoas Candidatas
- Permite o cadastro de pessoas candidatas ao receber o nome e número identificador.

#### Cadastro de Pessoas Eleitoras
- Permite o cadastro de pessoas eleitoras ao receber o nome e CPF.

#### Processo de Votação
- Registra votos de pessoas eleitoras para pessoas candidatas específicas.

#### Exibição de Resultados
- Mostra o resultado parcial ou final da votação, incluindo a quantidade de votos e a porcentagem para cada candidato.


## Tecnologias Utilizadas

<ul>
  <li><strong>Java</strong></li>
  <li><strong>ArrayList</strong></li>
  <li><strong>Object-Oriented Programming</strong></li>
</ul>

## Estrutura do Projeto

### Classes

#### Pessoa
- Classe abstrata base para `PessoaCandidata` e `PessoaEleitora`.
- **Atributos:**
  - `nome` (protegido): Nome da pessoa.
- **Métodos:**
  - Getters e setters para `nome`.

#### PessoaCandidata
- Herda de `Pessoa`.
- **Atributos:**
  - `numero`: Número identificador da pessoa candidata.
  - `votos`: Número de votos recebidos pela pessoa candidata.
- **Métodos:**
  - Getters e setters para `numero`.
  - Getter para `votos`.
  - `receberVoto()`: Incrementa o número de votos.

#### PessoaEleitora
- Herda de `Pessoa`.
- **Atributos:**
  - `cpf`: CPF da pessoa eleitora.
- **Métodos:**
  - Getters e setters para `cpf`.

#### GerenciamentoVotacao
- Responsável pelo gerenciamento do processo de votação.
- **Atributos:**
  - `pessoasCandidatas`: Lista de pessoas candidatas.
  - `pessoasEleitoras`: Lista de pessoas eleitoras.
  - `cpfsComputados`: Lista de CPFs de pessoas eleitoras que já votaram.
- **Métodos:**
  - `cadastrarPessoaCandidata(String nome, int numero)`: Cadastra uma nova pessoa candidata.
  - `cadastrarPessoaEleitora(String nome, String cpf)`: Cadastra uma nova pessoa eleitora.
  - `votar(String cpfPessoaEleitora, int numeroPessoaCandidata)`: Registra um voto.
  - `mostrarResultado()`: Exibe o resultado da votação.

### Interface

#### GerenciamentoVotacaoInterface
- Define os métodos que `GerenciamentoVotacao` deve implementar.

### Classe Principal

#### Principal
- Contém o método `main` e é responsável pela interação com o usuário.
- Menus para cadastro de pessoas candidatas, cadastro de pessoas eleitoras e processo de votação.

## Exemplo de Uso

### Cadastrar Pessoas Candidatas

```yaml
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
```
### Cadastrar Pessoas Eleitoras

```yaml
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o CPF da pessoa eleitora:
123.456.789-00
```
### Votação

```yaml
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o CPF da pessoa eleitora:
123.456.789-00
Entre com o número da pessoa candidata:
1
```
### Mostrar resultado

```yaml
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
2
Nome: Maria - 1 votos (100%)
Total de votos: 1
```

## Instalação do Projeto

1. **Clonar o Repositório:**
   - Clone o repositório do projeto do GitHub para o seu ambiente local:
     ```
     git clone https://github.com/seu_usuario/seu_projeto.git
     ```

2. **Instalar as dependências:**
   - Utilize o comando do mvn:
     ```
     mvn clean install
     ```

3. **Execução do Programa:**
   - Execute a classe `Principal` para iniciar o sistema de votação:
     ```
     java Principal
     ```

4. **Siga as Instruções do Programa:**
   - O programa irá solicitar interações para cadastrar pessoas candidatas, eleitoras e realizar o processo de votação. Siga as instruções fornecidas pelo programa para interagir corretamente.

## Execução dos Testes

Para executar os testes do projeto, siga estas etapas:

### Passos para Execução dos Testes

1. Navegue até o diretório raiz do projeto no terminal.

2. Execute o seguinte comando Maven para limpar o projeto e executar os testes:

    ```bash
    mvn clean test
    ```

## Conclusão
Este projeto demonstra a aplicação prática dos conceitos de Programação Orientada a Objetos em Java, proporcionando um sistema funcional de votação eletrônica. Através da implementação das classes e métodos descritos, é possível gerenciar todo o processo de votação de forma eficiente e organizada.
