# 🍷 Delivery GRANPRIS

Sistema de delivery para vinícola, desenvolvido em **Java** com **Spring Boot**, permitindo o gerenciamento de vinhos e pedidos de forma simples e eficiente.

## 📋 Sobre o projeto

O **Delivery GRANPRIS** é uma API voltada para gerenciar o catálogo de vinhos e o processo de entrega de uma vinícola, oferecendo operações de cadastro, consulta, atualização e remoção de produtos.

> 🌱 **Projeto de aprendizado em evolução.** Este repositório documenta meu progresso estudando Java e Spring Boot, e é atualizado progressivamente conforme avanço nos estudos. A pasta [`docs/aprendizado/`](docs/aprendizado) reúne rascunhos e experimentos que fizeram parte desse processo, mas que não fazem parte do código de produção da aplicação.

## 🚀 Tecnologias utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Lombok**
- **Maven**

## 📁 Estrutura do projeto

```
delivery-GRANPRIS/
├── .mvn/wrapper/
├── docs/
│   └── aprendizado/        # Rascunhos e registros do processo de aprendizado
├── src/
│   ├── main/
│   │   ├── java/          # Código-fonte da aplicação
│   │   └── resources/     # Arquivos de configuração
│   └── test/               # Testes automatizados
├── pom.xml                # Gerenciamento de dependências (Maven)
├── mvnw / mvnw.cmd         # Maven Wrapper
└── README.md
```

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java JDK 17+ instalado
- Maven (ou usar o Maven Wrapper incluso no projeto)

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/danielstroeher06-maker/delivery-GRANPRIS.git
   cd delivery-GRANPRIS
   ```

2. Execute a aplicação usando o Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
   No Windows:
   ```bash
   mvnw.cmd spring-boot:run
   ```

3. A aplicação estará disponível em:
   ```
   http://localhost:8080
   ```

## 🍇 Funcionalidades

- Cadastro de vinhos
- Consulta de vinhos disponíveis
- Atualização de informações de produtos
- Remoção de itens do catálogo

> As funcionalidades acima podem ser ajustadas conforme a evolução do projeto.

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## 📄 Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
