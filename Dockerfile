FROM ubuntu

RUN apt-get update && apt install -y vim && apt install gcc && mkdir INHERE && cd INHERE && touch a.c