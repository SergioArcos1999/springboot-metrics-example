# Use those commands on Windows.

minikube docker-env
# Copy the command given & use it

docker build -t springboot-metrics .

#Once the image is built, apply the deployment.yaml & appconfig.yaml



#https://docs.docker.com/docker-hub/repos/#pushing-a-docker-container-image-to-docker-hub
docker login

docker tag springboot-metrics:latest sarcos1999/springboot-metrics:latest

docker push sarcos1999/springboot-metrics:latest