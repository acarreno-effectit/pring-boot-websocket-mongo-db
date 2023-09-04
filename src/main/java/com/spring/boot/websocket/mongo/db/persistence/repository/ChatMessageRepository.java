package com.spring.boot.websocket.mongo.db.persistence.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.spring.boot.websocket.mongo.db.persistence.entity.ChatMessageEntity;

public interface ChatMessageRepository extends ReactiveMongoRepository<ChatMessageEntity, String> {

}
