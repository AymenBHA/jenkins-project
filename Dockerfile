FROM komljen/jdk-oracle

RUN \
  apt-get update && \
  apt-get -y install \
          maven && \
  rm -rf /var/lib/apt/lists/*