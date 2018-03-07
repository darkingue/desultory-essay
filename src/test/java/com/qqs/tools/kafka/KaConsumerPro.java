package com.qqs.tools.kafka;

/**
 * Created by qqs on 26/02/18.
 */


import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class KaConsumerPro {
    private final ConsumerConnector consumer;

    //    private final static String TOPIC = "TX.ACCOUNT";
    private final static String TOPIC = "TX.CM_REFUND_D";
//    private final static String TOPIC = "TX.CM_REFUND_E";

    private KaConsumerPro() {
        Properties props = new Properties();
        //zookeeper
        props.put("zookeeper.connect", "172.25.61.46:2181");
        //topic
        props.put("group.id", "1");

        //Zookeeper 超时
        props.put("zookeeper.session.timeout.ms", "4000");
        props.put("zookeeper.sync.time.ms", "200");
        props.put("auto.commit.interval.ms", "1000");
        props.put("auto.offset.reset", "smallest");


        props.put("serializer.class", "kafka.serializer.StringEncoder");

        ConsumerConfig config = new ConsumerConfig(props);

        consumer = kafka.consumer.Consumer.createJavaConsumerConnector(config);
    }


    void consume(String topic) {
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(topic, new Integer(1));
//        topicCountMap.put(TOPIC2, new Integer(2));
//        topicCountMap.put(TOPIC3, new Integer(3));


        StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
        StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());

        Map<String, List<KafkaStream<String, String>>> consumerMap =
                consumer.createMessageStreams(topicCountMap, keyDecoder, valueDecoder);
        KafkaStream<String, String> stream = consumerMap.get(topic).get(0);
        ConsumerIterator<String, String> it = stream.iterator();

        int messageCount = 0;
        while (it.hasNext()) {
            System.out.println(it.next().message());
            messageCount++;
            if (messageCount == 100) {
                System.out.println("Consumer端一共消费了" + messageCount + "条消息！");
            }
        }
    }

    public static void main(String[] args) {
        new KaConsumerPro().consume(args[0]);
    }

}
