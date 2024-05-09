# Projeto API - Consulta de Endereço por CEP

Este projeto consiste em uma aplicação Java para consulta de endereço a partir de um CEP utilizando a API do ViaCEP. O usuário pode fornecer um CEP válido e o sistema retornará as informações do endereço correspondente, salvando os dados em um arquivo JSON.

## Como usar

### Pré-requisitos

- Java 11 ou superior instalado
- Maven instalado (para gerenciar as dependências)

### Execução

1. Clone o repositório para sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile e execute o programa principal usando o seguinte comando: mvn clean compile exec:java
4. Siga as instruções no terminal para fornecer um CEP válido quando solicitado.

## Estrutura do Projeto

- **src/main/java/br/com/projeto/via/cep/**: Contém os arquivos fonte Java.
  - **exceptions**: Pacote para classes de exceções customizadas.
  - **model**: Pacote para classes de modelos.
    - **entities**: Pacote para entidades de dados.
    - **services**: Pacote para classes de serviços.
- **pom.xml**: Arquivo de configuração do Maven, que gerencia as dependências do projeto.

## Desenvolvimento

- O projeto utiliza a biblioteca Gson para a manipulação de dados JSON.
- A comunicação com a API ViaCEP é feita utilizando a classe HttpClient do Java.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou reportar problemas.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
