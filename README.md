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

- Java JDK 25 instalado.
- Maven instalado (opcional, pois o projeto inclui o Maven Wrapper).
- PostgreSQL 18 instalado.
- Banco de dados `delivery_vinicola` criado no PostgreSQL.

### Passos para executar

**1. Clone o repositório**

```bash
git clone https://github.com/danielstroeher06-maker/delivery-GRANPRIS.git
cd delivery-GRANPRIS
```

**2. Configure a variável de ambiente do banco de dados**

Por segurança, a senha do banco de dados não fica armazenada diretamente no código-fonte. O projeto utiliza a variável de ambiente `DB_PASSWORD` para acessar o PostgreSQL.

Cada pessoa deve configurar essa variável com a senha do próprio usuário do PostgreSQL.

No IntelliJ IDEA:

1. Acesse **Run → Edit Configurations**.
2. Selecione a configuração de execução da aplicação Spring Boot.
3. Localize o campo **Environment variables**.
4. Adicione `DB_PASSWORD` e informe a senha do seu usuário do PostgreSQL.
5. Salve as alterações.

**Importante:** não compartilhe sua senha nem a inclua no código-fonte ou nos arquivos enviados ao GitHub.

**3. Execute a aplicação usando o Maven Wrapper**

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows:

```bat
mvnw.cmd spring-boot:run
```

**4. Acesse a aplicação**

Após iniciar corretamente, a aplicação estará disponível localmente em:

```text
http://localhost:8080
```

### Observações

- Certifique-se de que o PostgreSQL esteja em execução.
- O banco `delivery_vinicola` deve existir antes de iniciar a aplicação.
- A variável `DB_PASSWORD` precisa estar configurada no ambiente em que a aplicação será executada.

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
