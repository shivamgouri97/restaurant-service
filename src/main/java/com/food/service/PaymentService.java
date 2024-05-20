package com.food.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {
//
//    @Autowired
//    private PaymentRepository orderRepository;

//    @Value("${topic.name.producer}")
//    private String topicName;
//
//    @Autowired
//    private  KafkaTemplate<String, String> kafkaTemplate;

//    public void createOrder(Order order) throws JsonProcessingException {
//        order.setStatus(Status.CREATED);
//        orderRepository.save(order);
//
//        ObjectMapper mapper = new ObjectMapper();
//        String reqJson = mapper.writeValueAsString(order);
//        kafkaTemplate.send(topicName, reqJson);
//        log.info("pushed to kafka queue");
//    }
}
