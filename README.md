# Sobre o projeto

## Card Microservice

Este é um projeto de microserviço em Java para um sistema de cartão de crédito. Ele consiste em vários microserviços para gerenciar clientes, cartões, avaliação de crédito, solicitacao de cartao e gateway de comunicação e registro de serviços.

# Microservices:

- **Discovery-eureka :** Discovery Eureka é utilizado como serviço de descoberta e registro para facilitar a comunicação entre os microserviços.

- **Clientes :** Responsável pelo gerenciamento de informações dos clientes, incluindo cadastro e buscar o cliente.

- **Cartão :** Responsável por registrar um cartão, listar e receber a fila de mensagens do RabbitMQ para solicitar um cartão para um cliente.

- **Avaliação de Credito :** Responsavel por efetuar a busca de um cliente e utilizar os métodos dos microserviços de clientes e cartoes através da biblioteca Spring Cloud OpenFeign. Além disso, realiza a avaliação de crédito com base em sua renda e idade, e envia a solicitação de um novo cartão por meio da fila de mensagens RabbitMQ."

- **Gateway :** Atua como um ponto de entrada único para os microserviços, roteando solicitações dos clientes para os microserviços apropriadose e realiza o balanceamento de carga.

## 🎥  Assista ao vídeo do projeto 



https://github.com/Diog007/Card-microservices-Spring-Boot/assets/151067241/4fde35af-da1b-4ac9-9a8f-2d98f334d663



# 🛠️ Tecnologias Utilizadas:

<table>
  <tr>
    <td>Java</td>
    <td>Spring Boot</td>
	<td>Spring Cloud</td>
	<td>RabbitMQ</td>
    <td>Spring Security</td>
	<td>Discovery Eureka</td>
	<td>Docker</td>
	<td>Dockerfile</td>
    <td>JPA</td>
    <td>Keycloak</td>
    <td>H2 Database</td>
    <td>Springdoc OpenAPI</td>
  </tr>
  <tr>
    <td>17</td>
    <td>3.2.3</td>
    <td>6.2.2</td>
	<td>3.13.0</td>
	<td>6.2.2</td>
	<td>3.2.3</td>
	<td>23.0.3</td>
	<td>1.0.0</td>
    <td>3.9.6</td>
    <td>24.0.1</td>
    <td>8.0</td>
    <td>1.8.1</td>
  </tr>
</table>
<br>
