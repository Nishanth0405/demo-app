FROM openjdk:21
ARG DEPLOYMENT_ENV
ARG ARTIFACT
ENV DEPLOYMENT=${DEPLOYMENT_ENV}
ENV ARTIFACTARG=${ARTIFACT}
WORKDIR /
COPY target/${ARTIFACTARG}  /${ARTIFACTARG}
EXPOSE 80
CMD java -Dspring.profiles.active=${DEPLOYMENT} -Dreactor.netty.http.server.accessLogEnabled=true --enable-preview -agentlib:jdwp=transport=dt_socket,server=y,suspend=n -jar ${ARTIFACTARG}