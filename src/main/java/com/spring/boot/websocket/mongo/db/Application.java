package com.spring.boot.websocket.mongo.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
// @EntityScan("com.spring.boot.websocket.mongo.db.persistence.entity")
// @EnableReactiveMongoRepositories("com.spring.boot.websocket.mongo.db.persistence.repository")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
