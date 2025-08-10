package com.pe.example.config.kafka;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class KafkaConsumer {
  private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
  @Incoming("consumer-in")
  public void consume(String message){
    log.info("Mensa recibido de Kafka: {} " + message);
  }
}
