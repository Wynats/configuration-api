# configuration-api
Spring Boot project for Configuration Service

# Docker use:
Build image with parameters

docker build --build-arg url=https://github.com/Wynats/configuration-api.git 
--build-arg project=configuration-api 
--build-arg artifactid=configuration-api 
--build-arg version=0.0.1 
-t configuration-api --no-cache - < Dockerfile


Run with parameters

docker run -d -p 8080:8080  --name configuration_container configuration-api 
