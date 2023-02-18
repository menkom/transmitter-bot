FROM gradle:7.6-jdk17 as builder
COPY . /home/app/
WORKDIR /home/app/
RUN gradle clean build

FROM bellsoft/liberica-openjdk-alpine:17.0.5
WORKDIR /opt/bot
COPY --from=builder /home/app/build/libs/transmitter-bot-0.0.1-SNAPSHOT.jar /opt/bot/transmitter-bot.jar
CMD ["java", "-jar", "transmitter-bot.jar"]

EXPOSE 8080
