FROM anapsix/alpine-java
LABEL maintainer="santkunal2000@gmail.com"
COPY /target/devops-groovy-products-1.1.0-SNAPSHOT.jar /home/devops-groovy-products-1.1.0-SNAPSHOT.jar
CMD ["java","-jar","/home/devops-groovy-products-1.1.0-SNAPSHOT.jar"]