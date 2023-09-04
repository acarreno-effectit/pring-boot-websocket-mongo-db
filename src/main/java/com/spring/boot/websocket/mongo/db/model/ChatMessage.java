package com.spring.boot.websocket.mongo.db.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ChatMessage {

  private String message;
  private String user;
  private String room;
  private LocalDateTime created;
  private Boolean readed;

}
