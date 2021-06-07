FROM openjdk:8-jre-alpine
LABEL maintainer="sun oct-month@qq.com"

ARG workdir=/clock-in-core

WORKDIR ${workdir}
COPY ./target/clock-0.0.1-SNAPSHOT.jar ${workdir}/clock.jar

ENTRYPOINT [ "java", "-jar", "-Dconfig=prod", "clock.jar" ]
