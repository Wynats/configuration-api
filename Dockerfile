FROM alpine/git as clone
ARG url
WORKDIR /app
RUN git clone ${url}

FROM maven:3.5-jdk-8-alpine as build
ARG project
WORKDIR /app
COPY --from=clone /app/${project} /app
ENTRYPOINT ["mvn" ,"spring-boot:run"]
