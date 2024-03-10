#como para definir a versao do maven que vai criar o biuld "TARGET"
FROM maven:3.8.5-openjdk-17 as build
#criando uma pasta chamada app
WORKDIR /app
#comando usado para copiar todo projeto para pasta app
COPY . .
#comando para gerar o target
RUN mvn clean package -DskipTests



#comando que define que a imagem sera construída a partir da imagem OpenJDK versão 17
FROM openjdk:17
#criando uma pasta chamada app
WORKDIR /app
#fazendo uma copia do build que ele fez emcima passando o caminho do jar criado
#e definindo para onde desejo copiar
COPY --from=build ./app/target/*.jar ./app.jar
#comando para rodar a imagem "app.jar"
ENTRYPOINT java -jar app.jar