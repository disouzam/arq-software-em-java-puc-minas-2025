# Sobre esse repositório

Esse repositório contem o código do trabalho desenvolvido para a disciplina de Arquitetura de Software com Frameworks Java da pós-graduação em Arquitetura de Software Distribuído da PUC Minas. O conteúdo contido aqui é fruto do meu desenvolvimento individual, usando fontes publicamente disponíveis na internet sobre o assunto, aulas da pós graduação da PUC Minas e referências de outros repositórios, próprios ou de outros desenvolvedores.

# Requisitos do trabalho

Esse repositório conterá um projeto Java 21, usando os frameworks e tecnologias apresentados em sala.

O conteúdo mínimo deverá contemplar:

- Java 21;
- Spring Boot 3.4.4;
- PostgreSQL (pelo menos 2 tabelas);
- Integração com Keycloak para Autenticação/Autorização;
- Publicação dos códigos dos microserviços em um repositório Git (podendo ser GitHub ou similares);
- Pelo menos 2 microserviços se comunicando com os frameworks Java apresentados em sala;
- Pelo menos 1 design pattern dentre os apresentados na sala de aula ou nas referências bibliográficas;
- Validação de código via Sonar (Opcional)

# Warming up

Como minha experiência é pequena em Java, mesmo tendo participado do curso ao longo de seis semanas e colaborado em um trabalho anterior, vou listar abaixo os pontos importantes ensinados através de um tutorial disponível no YouTube do canal Programming with Mosh:

[Spring Boot Tutorial for Beginners [2025]](https://www.youtube.com/watch?v=gJrjgg1KVL4)

O código-fonte do próprio Mosh Hamedani está disponível em [spring-store](https://github.com/mosh-hamedani/spring-store). E cada um de seus commits corresponde a uma lição de seu curso.

## Iniciando...

O diagrama abaixo, reproduzido do vídeo do Mosh Hamedani citado acima, resume as principais idéias por trás do framework Spring e da relação com o Spring Boot. Parafraseando o Mosh, o Spring Boot veio para facilitar a adoção do Spring por meio de uma série de recursos prontos ou pré-configurados.

![Spring e Spring Boot](spring-and-spring-boot.png)

## JDK

Para esse trabalho, irei adotar o JDK Correto fornecido pela Amazon e usarei a versão 21.0.7, disponível em: [Amazon Corretto 21 Installation Instructions for Windows 10 or Later](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/windows-install.html), conforme sugerido na disciplina. Outros Java Development Kits estão disponíveis, alguns gratuitos como o Corretto e outros sujeitos a licenciamento, mas não discutirei as implicações nem diferenças aqui. Recomendo um excelente resposta sobre o assunto no Stack Overflow: [Several vendors offer a choice of Java implementations](https://stackoverflow.com/questions/58250782/which-free-version-of-java-can-i-use-for-production-environments-and-or-commerci/58260110#58260110)

O comando `java -version` produz o seguinte resultado no meu computador:

```shell
openjdk version "21.0.7" 2025-04-15 LTS
OpenJDK Runtime Environment Corretto-21.0.7.6.1 (build 21.0.7+6-LTS)
OpenJDK 64-Bit Server VM Corretto-21.0.7.6.1 (build 21.0.7+6-LTS, mixed mode, sharing)
```