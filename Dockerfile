FROM tomcat:7.0.75-jre7
RUN apt-get update
COPY target/webapp-0.0.1-SNAPSHOT.war
