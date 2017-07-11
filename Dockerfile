FROM openjdk:8
ADD target/liverpoolGp.jar liverpoolGp.jar
EXPOSE 8281
ENTRYPOINT [ "java" , "-jar" , "liverpoolGp.jar" ]