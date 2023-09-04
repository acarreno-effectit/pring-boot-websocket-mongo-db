package com.spring.boot.websocket.mongo.db.mapper;

import org.springframework.stereotype.Component;
import com.spring.boot.websocket.mongo.db.persistence.entity.ChatMessageEntity;

@Component
public class WebSocketMapper {

  public ChatMessageEntity toChatMessageEntity(String payloadAsText) {

    System.out.println(payloadAsText);

    return null;
  }



}
