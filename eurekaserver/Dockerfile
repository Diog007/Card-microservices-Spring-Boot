#comando que define que a imagem sera construída a partir da imagem OpenJDK versão 17
FROM openjdk:17
#criando uma pasta chamada app
WORKDIR /app
#escolhendo o arquivo que quero copiar parar pasta app criado em cima
COPY ./target/eurekaserver-0.0.1-SNAPSHOT.jar app.jar
#defino qual a porta que quero expor
EXPOSE 8761
#comando para rodar a imagem "app.jar"
ENTRYPOINT java -jar app.jar