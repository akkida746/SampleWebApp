I created this project for learning cutting edge technologies. All code is working properly bearing provided steps are followed correctly.

--> Build docker image:
1. docker build --tag sampleapp

--> Push docker image to dockerhub:
1. docker login --username username
2. docker tag my-image username/my-repo
3. docker push username/my-repo

--> Kubernetes deployment steps:
1. deployment.yaml contains all detail required to deploy this app and running on kubernetes
2. kubectl apply -f deployment.yaml
3. kubectl get deployments
4. kubectl get pods
5. kubectl get services
