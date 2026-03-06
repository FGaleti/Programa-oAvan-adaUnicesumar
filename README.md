# 🎓 Projeto: Programação Avançada (Spring Boot)

Este repositório armazena o projeto prático desenvolvido para a disciplina de **Programação Avançada**. O objetivo principal é consolidar na prática os conceitos de desenvolvimento Backend utilizando a linguagem **Java** e o framework **Spring Boot**.

A aplicação foi estruturada seguindo o padrão de projeto arquitetural baseado em camadas, promovendo a separação de responsabilidades, manutenibilidade e escalabilidade do código.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Gerenciador de Dependências:** Maven *(ou Gradle, dependendo da sua configuração base)*
* **Padrão Arquitetural:** MVC (Model-View-Controller) / Arquitetura em Camadas

## 📁 Estrutura do Projeto

O código-fonte principal (`src/main/java/com/bn/demo`) está organizado da seguinte forma:

* **`models/` (ou Entities):** Contém as classes de domínio da aplicação. Representam as tabelas do banco de dados e as regras de negócio intrínsecas aos objetos.
* **`repositories/`:** Interfaces responsáveis pela comunicação com o banco de dados. Geralmente estendem o `JpaRepository`, fornecendo métodos prontos para operações CRUD (Create, Read, Update, Delete).
* **`services/`:** Camada onde reside a lógica de negócio principal. Esta camada consome os repositórios e prepara os dados antes de devolvê-los ou salvá-los, mantendo os controllers limpos.
* **`controllers/`:** Camada de interface (APIs REST). Recebe as requisições HTTP (`GET`, `POST`, `PUT`, `DELETE`), chama os serviços adequados e retorna as respostas HTTP apropriadas para o cliente.
* **`SchollApplication.java`:** A classe principal (`@SpringBootApplication`) que inicializa o contexto do Spring e sobe a aplicação no servidor embutido (Tomcat). *(Nota: A nomenclatura da classe principal reflete o contexto do projeto escolar).*

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o **JDK** (Java Development Kit) instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/FGaleti/Programa-Avancada-Unicesumar.git](https://github.com/FGaleti/Programa-Avancada-Unicesumar.git)
