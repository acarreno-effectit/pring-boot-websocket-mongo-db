package com.spring.boot.websocket.mongo.db.handle;

import java.io.IOException;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import com.spring.boot.websocket.mongo.db.persistence.repository.ChatMessageRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WebSocketHandler extends AbstractWebSocketHandler {

  private ChatMessageRepository chatMessageRepository;

  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message)
      throws IOException {
    System.out.println("New Text Message Received: " + message.getPayload());
    
    
    chatMessageRepository.findAll().then().subscribe();
    
    
    session.sendMessage(message);
  }

  @Override
  protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message)
      throws IOException {
    System.out.println("New Binary Message Received");
    session.sendMessage(message);
  }
}
