FROM openjdk:8
ADD /target/final_project-0.1.jar axissarel.jar
EXPOSE 8093
ENTRYPOINT ["java", "-jar","axissarel.jar"]
