FROM anapsix/alpine-java
MAINTAINER JesusSanchez-Rivera
COPY target/testpipeline-1.0.jar target/testpipeline-1.0.jar
CMD ["java", "-cp", "target/testpipeline-1.0.jar", "com.testpipeline.Fibonacci"]