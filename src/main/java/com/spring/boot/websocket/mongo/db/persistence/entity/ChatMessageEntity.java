package com.spring.boot.websocket.mongo.db.persistence.entity;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "ChatMessage")
public class ChatMessageEntity {

  @Id
  private String id;

  private String message;

  private String user;

  private String room;

  private LocalDateTime created;

  private Boolean readed;


}
