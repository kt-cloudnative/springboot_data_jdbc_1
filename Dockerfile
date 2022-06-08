FROM shclub/jre17-runtime:v1.0.0

ENV SPRING_PROFILES_ACTIVE dev

ENV SERVICE_NAME edu10

ADD ./target/$SERVICE_NAME-*.jar /$SERVICE_NAME.jar

ENTRYPOINT ["sh", "-c", "java -jar  ./$SERVICE_NAME.jar "]

