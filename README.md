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

## IDE

Graças à disponibilidade de licença de estudante para o IntelliJ Idea Ultimate, essa será a IDE escolhida para esse trabalho mas tentarei replicar os resultados e testes também no Eclipse

## Ferramentas de Build

Dentre as duas ferramentas mais populares de build, será adotado o Maven por sua popularidade. Essa é a mesma ferramenta adotada nas aulas da PUC Minas. Então não há diferenças aqui.

Maven já havia sido instalado em meu computador em outra ocasião pelo caminho sugerido pelo Mosh no vídeo: usando o Chocolatey para efetuar o download e instalação: 
- [Installing Chocolatey](https://chocolatey.org/install?_gl=1*1gzkr8j*_ga*MTc0Mjc5MTE1OS4xNzUxMjI3NTk4*_ga_0WDD29GGN2*czE3NTEyMjc1OTgkbzEkZzEkdDE3NTEyMjc3MjMkajMzJGwwJGgw)
- [Apache Maven](https://maven.apache.org/install.html)

O resultado do comando `mvn -v` está mostrado abaixo, com alguns trechos removidos:

```shell
Apache Maven 3.9.10 (5f519b97e944483d878815739f519b2eade0a91d)
Maven home: {...}\apache-maven-3.9.10
Java version: 21.0.7, vendor: Amazon.com Inc., runtime: {...}\corretto-21.0.7
Default locale: pt_BR, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```