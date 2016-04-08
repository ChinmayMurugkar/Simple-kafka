# Simple-Kafka

Kafka verion 0.9

Start the zookeeper
bin/zookeeper-server-start etc/kafka/zookeeper.properties

Start the broker
bin/kafka-server-start etc/kafka/server.properties

Create Topic
bin/kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

Run produecer
Run Consumer
