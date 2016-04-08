import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by z001vd4 on 4/8/16.
 */

/**
 * This producer will send a message to topic "test".
 */


public class Producer {
    public static void main(String[] args) throws IOException {
        // set up the producer
        KafkaProducer<String, String> producer;

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "testGroup");
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());

        producer = new KafkaProducer<>(props);

        try {
            // send lots of messages
            producer.send(new ProducerRecord<String, String>("fast-messages", "test message"));

        } catch (Throwable throwable) {
            System.out.print(throwable.getStackTrace());
        } finally {
            producer.close();
        }

    }
}