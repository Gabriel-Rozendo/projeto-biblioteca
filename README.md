# projeto-biblioteca

O Sistema de Gerenciamento de Locação de Livros é uma aplicação desenvolvida em Java que permite o cadastro e gerenciamento de funcionários, usuários e livros, além de facilitar o processo de locação e devolução de livros. O sistema foi projetado para ser intuitivo e eficiente, oferecendo uma interface de texto simples e funcionalidades organizadas em menus interativos.

Funcionalidades Principais:
Cadastro de Funcionários:

Permite o registro de funcionários com detalhes como nome, CPF, chapa, salário e endereço.

Os dados são armazenados em objetos da classe Funcionario.

Cadastro de Usuários:

Facilita o cadastro de usuários com informações como nome, CPF, código e endereço.

Os dados são armazenados em objetos da classe Usuario.

Cadastro de Livros:

Oferece a possibilidade de cadastrar livros com detalhes como título, gênero e autor.

Os dados são armazenados em objetos da classe Livro.

Locação e Devolução de Livros:

Permite a locação de livros, registrando detalhes como título, gênero, autor, data de locação e valor.

Facilita a devolução de livros, calculando eventuais multas com base na data de devolução.

Os dados de locação são gerenciados pela classe Locacao.

Consulta de Dados:

Oferece um sub-menu para visualizar detalhes de funcionários, usuários, livros, livros locados e devolvidos.

As informações são exibidas de forma clara e organizada.

Validação de Entradas:

O sistema inclui validações para garantir que as entradas do usuário sejam corretas, evitando erros durante a execução.

Interface Amigável:

O sistema utiliza menus interativos e mensagens claras para guiar o usuário durante a navegação.

Estrutura do Projeto:
Classes Principais:

Main: Classe principal que contém o método main e gerencia a execução do programa.

Funcionario: Armazena os dados dos funcionários.

Usuario: Armazena os dados dos usuários.

Livro: Armazena os dados dos livros.

Endereco: Armazena informações de endereço (rua, número, bairro).

Locacao: Gerencia as operações de locação e devolução de livros.

Benefícios:
Organização: O sistema é modular, com classes bem definidas e responsabilidades claras.

Facilidade de Uso: A interface de texto é intuitiva, tornando o sistema acessível até para usuários sem experiência técnica.

Extensibilidade: O código foi projetado para permitir futuras melhorias, como a adição de persistência de dados (arquivos ou banco de dados) ou uma interface gráfica.

Tecnologias Utilizadas:
Linguagem: Java.

Bibliotecas: java.util.Scanner para entrada de dados.

Considerações Finais:
Este projeto é ideal para bibliotecas ou instituições que necessitam de um sistema simples e eficiente para gerenciar o empréstimo de livros. Com uma estrutura modular e código bem organizado, o sistema pode ser facilmente adaptado para atender a necessidades específicas ou expandido com novas funcionalidades.

