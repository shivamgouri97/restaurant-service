package com.food.config;


//Configuration
public class KafkaConsumerConfig {
////    @Value("${spring.kafka.bootstrap-servers}")
////    private String bootstrapServer;
////
////    @Value("${spring.kafka.group-id}")
////    private String groupId;
//
//    @Bean
//    public ConsumerFactory<String, Order> orderConsumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(Map.of(
//                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092",
//                ConsumerConfig.GROUP_ID_CONFIG, "orders_group",
//                ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class,
//                ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class
//        ), new StringDeserializer(), new JsonDeserializer<>(Order.class));
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, Order> orderKafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, Order> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(orderConsumerFactory());
//        return factory;
//    }
}