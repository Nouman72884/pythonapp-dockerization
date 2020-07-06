FROM ubuntu:18.04
ADD . /pythonapp
WORKDIR /pythonapp
RUN apt-get install python -y && \
apt-get install python-pip -y && pip install -r requirements.txt
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz \
  && usermod -aG docker jenkins
CMD ["python","app.py"]
