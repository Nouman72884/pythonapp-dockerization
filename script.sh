#! /bin/bash
docker stop pythonapp
docker rm pythonapp
docker rmi 020046395185.dkr.ecr.us-east-1.amazonaws.com/pythonapp
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 020046395185.dkr.ecr.us-east-1.amazonaws.com
docker run --name pythonapp -p 5000:5000 -d 020046395185.dkr.ecr.us-east-1.amazonaws.com/pythonapp:latest
