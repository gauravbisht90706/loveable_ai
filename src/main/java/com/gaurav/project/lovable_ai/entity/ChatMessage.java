package com.gaurav.project.lovable_ai.entity;

import com.gaurav.project.lovable_ai.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolsCalls; // JSON array of tools called

    Integer tokenUsed;

    Instant createdAt;

}
