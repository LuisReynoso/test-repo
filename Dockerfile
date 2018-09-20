FROM openjdk:8-jre
MAINTAINER Luis Emmanuel Garcia <luis.reynoso@aure.com>

ENTRYPOINT ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/share/test-devspace/app.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/test-devspace/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/test-devspace/app.jar