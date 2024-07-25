## Sobre

Este projeto Spring demonstra como aplicar os princípios de padrões de projeto, como Facade, Singleton e Strategy, em um contexto prático. A aplicação utiliza conceitos relacionados a esses padrões de maneira indireta, refletindo como tais práticas podem ser integradas em um contexto de desenvolvimento Spring.

_Exemplo: O uso da anotação @Autowired para injeção de dependências no Spring é uma forma indireta de aplicar o padrão Singleton, garantindo que apenas uma instância de um bean seja criada e gerenciada pelo container Spring._

A aplicação inclui APIs REST e configurações específicas que demonstram como esses padrões podem ser utilizados para melhorar a estrutura e organização do código.

## Testando a API

Você pode testar a API utilizando Swagger, que fornece uma interface gráfica para interagir com os endpoints da API.

1. Inicie a aplicação Spring Boot.
2. Acesse a documentação feita com Swagger:

   <http://localhost:8080/swagger-ui.html>

   Nesta interface, você pode visualizar a documentação gerada automaticamente para os endpoints da API e testar as requisições diretamente do navegador.

   Caso você esteja usando uma porta diferente da padrão (8080), ajuste a URL conforme a porta configurada no seu ambiente.

## Acessando o Banco de Dados H2

A aplicação utiliza um banco de dados H2 em memória. Você pode acessar o console H2 para visualizar e gerenciar o banco de dados.

1. Inicie a aplicação Spring Boot.
2. Acesse o console H2:

   <http://localhost:8080/h2-console>

   Certifique-se de que as configurações de URL, nome de usuário e senha correspondem às definidas no [`application.properties`](src/main/resources/application.properties).
   Novamente, caso você esteja usando uma porta diferente da padrão (8080), ajuste a URL conforme a porta configurada no seu ambiente.

## Estrutura do Projeto

- **Controllers:** Contém os controladores REST que expõem as APIs.
- **DTOs:** Objetos de Transferência de Dados utilizados para comunicação entre cliente e servidor.
- **Models:** Entidades que representam as tabelas do banco de dados.
- **Repositories:** Interfaces que fornecem acesso aos dados no banco de dados.
- **Services:** Contêm a lógica de negócios e interagem com os repositórios.