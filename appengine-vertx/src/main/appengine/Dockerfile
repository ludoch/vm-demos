FROM gcr.io/google_appengine/openjdk8
ADD vert-0.1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

